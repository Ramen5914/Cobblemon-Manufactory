package com.r4men.create_cobblemon.datagen.create;

import com.r4men.create_cobblemon.CreateCobblemon;
import com.simibubi.create.api.data.recipe.CuttingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ModCuttingRecipeGen extends CuttingRecipeGen {
    public ModCuttingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
