package com.r4men.create_cobblemon.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.datagen.create.*;
import com.r4men.create_cobblemon.util.ModTags;
import com.simibubi.create.api.data.recipe.ProcessingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    static final List<ProcessingRecipeGen<?, ?, ?>> GENERATORS = new ArrayList<>();
    static final int BUCKET = FluidType.BUCKET_VOLUME;
    static final int BOTTLE = 250;

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CobblemonItems.ANCIENT_SLATE_BALL, 1)
                .requires(ModTags.Items.DYEABLE_ANCIENT_BALLS)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_black_dye", has(Items.BLACK_DYE))
                .save(recipeOutput, CreateCobblemon.MOD_ID + ":ancient_slate_ball");
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
