package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.api.tags.CobblemonItemTags;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.simibubi.create.api.data.recipe.CuttingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class CMCuttingRecipeGen extends CuttingRecipeGen {
    GeneratedRecipe COPPER_BALL_BASE = create(
            "copper_ball_base", b -> b
                    .require(CobblemonItemTags.TIER_1_POKE_BALL_MATERIALS)
                    .duration(200)
                    .output(CMItems.COPPER_BALL_BASE, 4));

    GeneratedRecipe IRON_BALL_BASE = create(
            "iron_ball_base", b -> b
                    .require(CobblemonItemTags.TIER_2_POKE_BALL_MATERIALS)
                    .duration(200)
                    .output(CMItems.IRON_BALL_BASE, 6));

    GeneratedRecipe GOLD_BALL_BASE = create(
            "gold_ball_base", b -> b
                    .require(CobblemonItemTags.TIER_3_POKE_BALL_MATERIALS)
                    .duration(200)
                    .output(CMItems.GOLD_BALL_BASE, 2));

    GeneratedRecipe DIAMOND_BALL_BASE = create(
            "diamond_ball_base", b -> b
                    .require(CobblemonItemTags.TIER_4_POKE_BALL_MATERIALS)
                    .duration(200)
                    .output(CMItems.DIAMOND_BALL_BASE, 1));

    public CMCuttingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }

    @Override
    public @NotNull String getName() {
        return CobblemonManufactory.NAME + "'s Cutting Recipes";
    }
}
