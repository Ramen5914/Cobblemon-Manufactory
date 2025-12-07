package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.simibubi.create.api.data.recipe.CuttingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public final class CMCuttingRecipeGen extends CuttingRecipeGen {
    GeneratedRecipe IRON_BALL_BASE = create(
            "iron_ball_base", b -> b
                    .require(Items.IRON_INGOT)
                    .duration(200)
                    .output(CMItems.IRON_BALL_BASE, 6));

    public CMCuttingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }
}
