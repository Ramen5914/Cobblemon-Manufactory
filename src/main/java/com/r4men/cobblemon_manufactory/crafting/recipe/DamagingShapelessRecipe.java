package com.r4men.cobblemon_manufactory.crafting.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.r4men.cobblemon_manufactory.crafting.CMRecipes;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import org.jetbrains.annotations.NotNull;

public class DamagingShapelessRecipe extends ShapelessRecipe {
    public DamagingShapelessRecipe(String group, CraftingBookCategory category, ItemStack result, NonNullList<Ingredient> ingredients) {
        super(group, category, result, ingredients);
    }

    @Override
    public @NotNull NonNullList<ItemStack> getRemainingItems(CraftingInput input) {
        NonNullList<ItemStack> remainders = NonNullList.withSize(input.size(), ItemStack.EMPTY);

        for (int i = 0; i < remainders.size(); i++) {
            ItemStack item = input.getItem(i);
            if (item.hasCraftingRemainingItem()) {
                remainders.set(i, item);
            } else if (item.isDamageableItem()) {
                int durability = item.getDamageValue();
                item.setDamageValue(durability + 1);

                if (item.getDamageValue() == item.getMaxDamage()) {
                    remainders.set(i, ItemStack.EMPTY);
                } else {
                    remainders.set(i, item.copy());
                }
            }
        }

        return remainders;
    }

    @Override
    public @NotNull RecipeSerializer<?> getSerializer() {
        return CMRecipes.DAMAGING_SHAPELESS.get();
    }

    public static class Serializer implements RecipeSerializer<DamagingShapelessRecipe> {


        public static final StreamCodec<RegistryFriendlyByteBuf, DamagingShapelessRecipe> STREAM_CODEC = StreamCodec.of(
                DamagingShapelessRecipe.Serializer::toNetwork, DamagingShapelessRecipe.Serializer::fromNetwork
        );
        private static final MapCodec<DamagingShapelessRecipe> CODEC = RecordCodecBuilder.mapCodec(
                instance -> instance.group(
                                Codec.STRING.optionalFieldOf("group", "").forGetter(ShapelessRecipe::getGroup),
                                CraftingBookCategory.CODEC.fieldOf("category").orElse(CraftingBookCategory.MISC).forGetter(ShapelessRecipe::category),
                                ItemStack.STRICT_CODEC.fieldOf("result").forGetter(recipe -> recipe.result),
                                Ingredient.CODEC_NONEMPTY
                                        .listOf()
                                        .fieldOf("ingredients")
                                        .flatXmap(
                                                ingredients -> {
                                                    Ingredient[] aingredient = ingredients.toArray(Ingredient[]::new); // Neo skip the empty check and immediately create the array.
                                                    if (aingredient.length == 0) {
                                                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                                                    } else {
                                                        return aingredient.length > ShapedRecipePattern.getMaxHeight() * ShapedRecipePattern.getMaxWidth()
                                                                ? DataResult.error(() -> "Too many ingredients for shapeless recipe. The maximum is: %s".formatted(ShapedRecipePattern.getMaxHeight() * ShapedRecipePattern.getMaxWidth()))
                                                                : DataResult.success(NonNullList.of(Ingredient.EMPTY, aingredient));
                                                    }
                                                },
                                                DataResult::success
                                        )
                                        .forGetter(ShapelessRecipe::getIngredients)
                        )
                        .apply(instance, DamagingShapelessRecipe::new)
        );

        private static DamagingShapelessRecipe fromNetwork(RegistryFriendlyByteBuf buffer) {
            String s = buffer.readUtf();
            CraftingBookCategory craftingBookCategory = buffer.readEnum(CraftingBookCategory.class);
            int i = buffer.readVarInt();
            NonNullList<Ingredient> nonnulllist = NonNullList.withSize(i, Ingredient.EMPTY);
            nonnulllist.replaceAll(ingredient -> Ingredient.CONTENTS_STREAM_CODEC.decode(buffer));
            ItemStack itemStack = ItemStack.STREAM_CODEC.decode(buffer);

            return new DamagingShapelessRecipe(s, craftingBookCategory, itemStack, nonnulllist);
        }

        private static void toNetwork(RegistryFriendlyByteBuf buffer, DamagingShapelessRecipe recipe) {
            buffer.writeUtf(recipe.getGroup());
            buffer.writeEnum(recipe.category());
            buffer.writeVarInt(recipe.getIngredients().size());
            for (Ingredient ingredient : recipe.getIngredients()) {
                Ingredient.CONTENTS_STREAM_CODEC.encode(buffer, ingredient);
            }
            ItemStack.STREAM_CODEC.encode(buffer, recipe.result);
        }

        @Override
        public @NotNull MapCodec<DamagingShapelessRecipe> codec() {
            return CODEC;
        }

        @Override
        public @NotNull StreamCodec<RegistryFriendlyByteBuf, DamagingShapelessRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}
