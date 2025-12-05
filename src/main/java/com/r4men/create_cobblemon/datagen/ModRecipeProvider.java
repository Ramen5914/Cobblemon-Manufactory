package com.r4men.create_cobblemon.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.api.tags.CobblemonItemTags;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.datagen.create.*;
import com.r4men.create_cobblemon.item.ModItems;
import com.r4men.create_cobblemon.recipe.builder.DamagingShapelessRecipeBuilder;
import com.r4men.create_cobblemon.util.ModTags;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.ProcessingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    static final List<ProcessingRecipeGen<?, ?, ?>> GENERATORS = new ArrayList<>();
    public static final int BUCKET = FluidType.BUCKET_VOLUME;
    public static final int BOTTLE = 250;

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ancientBallFromDye(CobblemonItems.ANCIENT_SLATE_BALL, Items.BLACK_DYE, recipeOutput);
        ancientBallFromDye(CobblemonItems.ANCIENT_AZURE_BALL, Items.BLUE_DYE, recipeOutput);
        ancientBallFromDye(CobblemonItems.ANCIENT_VERDANT_BALL, Items.GREEN_DYE, recipeOutput);
        ancientBallFromDye(CobblemonItems.ANCIENT_ROSEATE_BALL, Items.PINK_DYE, recipeOutput);
        ancientBallFromDye(CobblemonItems.ANCIENT_POKE_BALL, Items.RED_DYE, recipeOutput);
        ancientBallFromDye(CobblemonItems.ANCIENT_IVORY_BALL, Items.WHITE_DYE, recipeOutput);
        ancientBallFromDye(CobblemonItems.ANCIENT_CITRINE_BALL, Items.YELLOW_DYE, recipeOutput);

        ancientLidFromDye(ModItems.ANCIENT_BLACK_BALL_LID.get(), Items.BLACK_DYE, recipeOutput);
        ancientLidFromDye(ModItems.ANCIENT_BLUE_BALL_LID.get(), Items.BLUE_DYE, recipeOutput);
        ancientLidFromDye(ModItems.ANCIENT_GREEN_BALL_LID.get(), Items.GREEN_DYE, recipeOutput);
        ancientLidFromDye(ModItems.ANCIENT_PINK_BALL_LID.get(), Items.PINK_DYE, recipeOutput);
        ancientLidFromDye(ModItems.ANCIENT_RED_BALL_LID.get(), Items.RED_DYE, recipeOutput);
        ancientLidFromDye(ModItems.ANCIENT_WHITE_BALL_LID.get(), Items.WHITE_DYE, recipeOutput);
        ancientLidFromDye(ModItems.ANCIENT_YELLOW_BALL_LID.get(), Items.YELLOW_DYE, recipeOutput);

        basicLidFromDye(ModItems.BLACK_BALL_LID.get(), Items.BLACK_DYE, recipeOutput);
        basicLidFromDye(ModItems.BLUE_BALL_LID.get(), Items.BLUE_DYE, recipeOutput);
        basicLidFromDye(ModItems.GREEN_BALL_LID.get(), Items.GREEN_DYE, recipeOutput);
        basicLidFromDye(ModItems.PINK_BALL_LID.get(), Items.PINK_DYE, recipeOutput);
        basicLidFromDye(ModItems.RED_BALL_LID.get(), Items.RED_DYE, recipeOutput);
        basicLidFromDye(ModItems.WHITE_BALL_LID.get(), Items.WHITE_DYE, recipeOutput);
        basicLidFromDye(ModItems.YELLOW_BALL_LID.get(), Items.YELLOW_DYE, recipeOutput);

        apricornFromDye(CobblemonItems.BLACK_APRICORN, Items.BLACK_DYE, recipeOutput);
        apricornFromDye(CobblemonItems.BLUE_APRICORN, Items.BLUE_DYE, recipeOutput);
        apricornFromDye(CobblemonItems.GREEN_APRICORN, Items.GREEN_DYE, recipeOutput);
        apricornFromDye(CobblemonItems.PINK_APRICORN, Items.PINK_DYE, recipeOutput);
        apricornFromDye(CobblemonItems.RED_APRICORN, Items.RED_DYE, recipeOutput);
        apricornFromDye(CobblemonItems.WHITE_APRICORN, Items.WHITE_DYE, recipeOutput);
        apricornFromDye(CobblemonItems.YELLOW_APRICORN, Items.YELLOW_DYE, recipeOutput);

        ballFromDye(CobblemonItems.AZURE_BALL, Items.BLUE_DYE, recipeOutput);
        ballFromDye(CobblemonItems.CITRINE_BALL, Items.YELLOW_DYE, recipeOutput);
        ballFromDye(CobblemonItems.POKE_BALL, Items.RED_DYE, recipeOutput);
        ballFromDye(CobblemonItems.PREMIER_BALL, Items.WHITE_DYE, recipeOutput);
        ballFromDye(CobblemonItems.ROSEATE_BALL, Items.PINK_DYE, recipeOutput);
        ballFromDye(CobblemonItems.SLATE_BALL, Items.BLACK_DYE, recipeOutput);
        ballFromDye(CobblemonItems.VERDANT_BALL, Items.GREEN_DYE, recipeOutput);

        simpleLidFromDye(ModItems.BLACK_TUMBLESTONE_LID.get(), ModItems.ANCIENT_HEAVY_BALL_LID.get(), Items.BLACK_DYE, recipeOutput);
        simpleLidFromDye(ModItems.SKY_TUMBLESTONE_LID.get(), ModItems.ANCIENT_FEATHER_BALL_LID.get(), Items.LIGHT_BLUE_DYE, recipeOutput);

        compressionRecipe(CobblemonItems.EXPERIENCE_CANDY_XS, 6, CobblemonItems.EXPERIENCE_CANDY_S, recipeOutput);
        compressionRecipe(CobblemonItems.EXPERIENCE_CANDY_S, 3, CobblemonItems.EXPERIENCE_CANDY_M, recipeOutput);
        compressionRecipe(CobblemonItems.EXPERIENCE_CANDY_M, 3, CobblemonItems.EXPERIENCE_CANDY_L, recipeOutput);
        compressionRecipe(CobblemonItems.EXPERIENCE_CANDY_L, 3, CobblemonItems.EXPERIENCE_CANDY_XL, recipeOutput);

        seedFromDye(CobblemonItems.BLACK_APRICORN_SEED, Items.BLACK_DYE, recipeOutput);
        seedFromDye(CobblemonItems.BLUE_APRICORN_SEED, Items.BLUE_DYE, recipeOutput);
        seedFromDye(CobblemonItems.GREEN_APRICORN_SEED, Items.GREEN_DYE, recipeOutput);
        seedFromDye(CobblemonItems.PINK_APRICORN_SEED, Items.PINK_DYE, recipeOutput);
        seedFromDye(CobblemonItems.RED_APRICORN_SEED, Items.RED_DYE, recipeOutput);
        seedFromDye(CobblemonItems.WHITE_APRICORN_SEED, Items.WHITE_DYE, recipeOutput);
        seedFromDye(CobblemonItems.YELLOW_APRICORN_SEED, Items.YELLOW_DYE, recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CobblemonItems.RARE_CANDY, 1)
                .requires(CobblemonItems.EXPERIENCE_CANDY_L)
                .requires(AllItems.EMPTY_SCHEMATIC)
                .unlockedBy("has_exp_candy_l", has(CobblemonItems.EXPERIENCE_CANDY_L))
                .unlockedBy("has_empty_schematic", has(AllItems.EMPTY_SCHEMATIC))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(
                        CreateCobblemon.MOD_ID,
                        "rare_candy")
                        .withPrefix("shapeless/"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CobblemonItems.CHERISH_BALL, 1)
                .pattern("RAR")
                .pattern("BIB")
                .pattern("RAR")
                .define('R', Items.REDSTONE)
                .define('A', CobblemonItems.RED_APRICORN)
                .define('B', CobblemonItems.BLACK_APRICORN)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_red_apricorn", has(CobblemonItems.RED_APRICORN))
                .unlockedBy("has_black_apricorn", has(CobblemonItems.BLACK_APRICORN))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(
                        CreateCobblemon.MOD_ID,
                        "cherish_ball")
                        .withPrefix("shaped/"));

        DamagingShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CobblemonItems.LEFTOVERS, 1)
                .requires(Items.APPLE)
                .requires(Items.SHEARS)
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(
                        CreateCobblemon.MOD_ID,
                        "leftovers"));
    }

    private void compressionRecipe(ItemLike input, int count, ItemLike output, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder recipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 1)
                .unlockedBy(getHasName(input), has(input));

        for (int i = 0; i < count; i++) {
            recipe.requires(input);
        }

        recipe.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(
                CreateCobblemon.MOD_ID,
                getItemName(output))
                .withPrefix("shapeless/"));
    }

    private void seedFromDye(ItemLike seed, ItemLike dye, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, seed, 1)
                .requires(CobblemonItemTags.APRICORN_SPROUTS)
                .requires(dye)
                .unlockedBy(getHasName(dye), has(dye))
                .unlockedBy("has_apricorn_sprouts", has(CobblemonItemTags.APRICORN_SPROUTS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(
                        CreateCobblemon.MOD_ID,
                        getItemName(seed))
                        .withPrefix("shapeless/"));
    }

    private void ancientBallFromDye(ItemLike ball, ItemLike dye, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ball, 1)
                .requires(ModTags.Items.DYEABLE_ANCIENT_BALLS)
                .requires(dye)
                .unlockedBy(getHasName(dye), has(dye))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(
                        CreateCobblemon.MOD_ID,
                        getItemName(ball))
                        .withPrefix("shapeless/"));
    }

    private void ballFromDye(ItemLike ball, ItemLike dye, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ball, 1)
                .requires(ModTags.Items.DYEABLE_POKE_BALLS)
                .requires(dye)
                .unlockedBy(getHasName(dye), has(dye))
                .save(recipeOutput,  ResourceLocation.fromNamespaceAndPath(
                        CreateCobblemon.MOD_ID,
                        getItemName(ball))
                        .withPrefix("shapeless/"));
    }

    private void ancientLidFromDye(ItemLike lid, ItemLike dye, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, lid, 1)
                .requires(ModTags.Items.ANCIENT_BALL_LIDS)
                .requires(dye)
                .unlockedBy(getHasName(dye), has(dye))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(
                        CreateCobblemon.MOD_ID,
                        getItemName(lid))
                        .withPrefix("shapeless/"));
    }

    private void basicLidFromDye(ItemLike lid, ItemLike dye, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, lid, 1)
                .requires(ModTags.Items.POKE_BALL_LIDS)
                .requires(dye)
                .unlockedBy(getHasName(dye), has(dye))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(
                                CreateCobblemon.MOD_ID,
                                getItemName(lid))
                        .withPrefix("shapeless/"));
    }

    private void simpleLidFromDye(ItemLike input, ItemLike lid, ItemLike dye, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, lid, 1)
                .requires(input)
                .requires(dye)
                .unlockedBy(getHasName(dye), has(dye))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(
                                CreateCobblemon.MOD_ID,
                                getItemName(lid))
                        .withPrefix("shapeless/"));
    }

    private void apricornFromDye(ItemLike apricorn, ItemLike dye, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, apricorn, 1)
                .requires(CobblemonItemTags.APRICORNS)
                .requires(dye)
                .unlockedBy(getHasName(dye), has(dye))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(
                        CreateCobblemon.MOD_ID,
                        getItemName(apricorn))
                        .withPrefix("shapeless/"));
    }

    public static void registerAllProcessing(DataGenerator gen, PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        GENERATORS.add(new ModCrushingRecipeGen(output, registries));
        GENERATORS.add(new ModCuttingRecipeGen(output, registries));
        GENERATORS.add(new ModDeployingRecipeGen(output, registries));
        GENERATORS.add(new ModEmptyingRecipeGen(output, registries));
        GENERATORS.add(new ModFillingRecipeGen(output, registries));
        GENERATORS.add(new ModHauntingRecipeGen(output, registries));
        GENERATORS.add(new ModMillingRecipeGen(output, registries));
        GENERATORS.add(new ModMixingRecipeGen(output, registries));
        GENERATORS.add(new ModPolishingRecipeGen(output, registries));
        GENERATORS.add(new ModPressingRecipeGen(output, registries));
        GENERATORS.add(new ModWashingRecipeGen(output, registries));

        gen.addProvider(true, new DataProvider() {
            @Override
            public @NotNull String getName() {
                return "Create: Cobblemon Industrialized Processing Recipes";
            }

            @Override
            public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cachedOutput) {
                return CompletableFuture.allOf(GENERATORS.stream()
                        .map(gen -> gen.run(cachedOutput))
                        .toArray(CompletableFuture[]::new));
            }
        });
    }
}
