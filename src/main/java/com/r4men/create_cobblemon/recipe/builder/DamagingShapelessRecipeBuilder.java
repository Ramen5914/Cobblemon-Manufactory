package com.r4men.create_cobblemon.recipe.builder;

import com.r4men.create_cobblemon.recipe.DamagingShapelessRecipe;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.NonNullList;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class DamagingShapelessRecipeBuilder implements RecipeBuilder {
    private final RecipeCategory category;
    private final Item result;
    private final int count;
    private final ItemStack resultStack;
    private final NonNullList<Ingredient> ingredients = NonNullList.create();
    private final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();
    @Nullable
    private String group;

    public DamagingShapelessRecipeBuilder(RecipeCategory category, ItemLike result, int count) {
        this(category, new ItemStack(result, count));
    }

    public DamagingShapelessRecipeBuilder(RecipeCategory category, ItemStack result) {
        this.category = category;
        this.result = result.getItem();
        this.count = result.getCount();
        this.resultStack = result;
    }

    public static DamagingShapelessRecipeBuilder shapeless(RecipeCategory category, ItemLike result) {
        return new DamagingShapelessRecipeBuilder(category, result, 1);
    }

    public static DamagingShapelessRecipeBuilder shapeless(RecipeCategory category, ItemLike result, int count) {
        return new DamagingShapelessRecipeBuilder(category, result, count);
    }

    public static DamagingShapelessRecipeBuilder shapeless(RecipeCategory category, ItemStack result) {
        return new DamagingShapelessRecipeBuilder(category, result);
    }

    public DamagingShapelessRecipeBuilder requires(TagKey<Item> tag) {
        return this.requires(Ingredient.of(tag));
    }

    public DamagingShapelessRecipeBuilder requires(ItemLike item) {
        return this.requires(item, 1);
    }

    public DamagingShapelessRecipeBuilder requires(ItemLike item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.requires(Ingredient.of(item));
        }

        return this;
    }

    public DamagingShapelessRecipeBuilder requires(Ingredient ingredient) {
        return this.requires(ingredient, 1);
    }

    public DamagingShapelessRecipeBuilder requires(Ingredient ingredient, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.ingredients.add(ingredient);
        }

        return this;
    }

    public @NotNull DamagingShapelessRecipeBuilder unlockedBy(@NotNull String name, @NotNull Criterion<?> criterion) {
        this.criteria.put(name, criterion);
        return this;
    }

    public @NotNull DamagingShapelessRecipeBuilder group(@Nullable String groupName) {
        this.group = groupName;
        return this;
    }

    @Override
    public @NotNull Item getResult() {
        return this.result;
    }

    @Override
    public void save(@NotNull RecipeOutput recipeOutput, @NotNull ResourceLocation id) {
        this.ensureValid(id);

        Advancement.Builder advancement$Builder = recipeOutput.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id))
                .requirements(AdvancementRequirements.Strategy.OR);

        this.criteria.forEach(advancement$Builder::addCriterion);

        DamagingShapelessRecipe damagingShapelessRecipe = new DamagingShapelessRecipe(
                Objects.requireNonNullElse(this.group, ""),
                RecipeBuilder.determineBookCategory(this.category),
                this.resultStack,
                this.ingredients);

        recipeOutput.accept(id.withPrefix("shapeless/damaging/"), damagingShapelessRecipe, advancement$Builder.build(id.withPrefix("recipes/" + this.category.getFolderName() + "/shapeless/damaging/")));
    }

    private void ensureValid(ResourceLocation id) {
        if (this.criteria.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + id);
        }
    }
}
