package com.r4men.create_cobblemon.datagen.create;

import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.item.ModItems;
import com.simibubi.create.api.data.recipe.CuttingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public final class ModCuttingRecipeGen extends CuttingRecipeGen {
    GeneratedRecipe IRON_BALL_BASE = create(
            "iron_ball_base", b -> b
                    .require(Items.IRON_INGOT)
                    .duration(200)
                    .output(ModItems.IRON_BALL_BASE, 6));

    public ModCuttingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
