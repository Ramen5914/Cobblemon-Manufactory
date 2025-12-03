package com.r4men.create_cobblemon.datagen.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.simibubi.create.api.data.recipe.MillingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;

public class ModMillingRecipeGen extends MillingRecipeGen {
    GeneratedRecipe BLUE_MINT_SEEDS = mintSeeds("blue_mint_seeds", CobblemonItems.BLUE_MINT_LEAF, CobblemonItems.BLUE_MINT_SEEDS);
    GeneratedRecipe CYAN_MINT_SEEDS = mintSeeds("cyan_mint_seeds", CobblemonItems.CYAN_MINT_LEAF, CobblemonItems.CYAN_MINT_SEEDS);
    GeneratedRecipe GREEN_MINT_SEEDS = mintSeeds("green_mint_seeds", CobblemonItems.GREEN_MINT_LEAF, CobblemonItems.GREEN_MINT_SEEDS);
    GeneratedRecipe PINK_MINT_SEEDS = mintSeeds("pink_mint_seeds", CobblemonItems.PINK_MINT_LEAF, CobblemonItems.PINK_MINT_SEEDS);
    GeneratedRecipe RED_MINT_SEEDS = mintSeeds("red_mint_seeds", CobblemonItems.RED_MINT_LEAF, CobblemonItems.RED_MINT_SEEDS);
    GeneratedRecipe WHITE_MINT_SEEDS = mintSeeds("white_mint_seeds", CobblemonItems.WHITE_MINT_LEAF, CobblemonItems.WHITE_MINT_SEEDS);

    GeneratedRecipe LEFTOVERS = create(
            "leftovers", b -> b
                    .require(Items.APPLE)
                    .duration(20)
                    .output(.9f, CobblemonItems.LEFTOVERS));

    GeneratedRecipe VIVICHOKE_SEEDS = create(
            "vivichoke_seeds", b -> b
                    .require(CobblemonItems.VIVICHOKE)
                    .duration(70)
                    .output(CobblemonItems.VIVICHOKE_SEEDS, 2)
                    .output(.5f, CobblemonItems.VIVICHOKE_SEEDS));

    private GeneratedRecipe mintSeeds(String name, ItemLike leaf, ItemLike seed) {
        return create(name, b -> b
                .require(leaf)
                .duration(70)
                .output(seed)
                .output(.5f, seed));
    }

    public ModMillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
