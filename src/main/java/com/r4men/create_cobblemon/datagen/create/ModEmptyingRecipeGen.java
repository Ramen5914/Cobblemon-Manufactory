package com.r4men.create_cobblemon.datagen.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.fluid.ModFluids;
import com.simibubi.create.api.data.recipe.EmptyingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModEmptyingRecipeGen extends EmptyingRecipeGen {
    GeneratedRecipe ANTIDOTE = create(
            "antidote", b -> b
                    .require(CobblemonItems.ANTIDOTE)
                    .output(ModFluids.SOURCE_ANTIDOTE_WATER.get(), 250)
                    .output(Items.GLASS_BOTTLE));

    public ModEmptyingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
