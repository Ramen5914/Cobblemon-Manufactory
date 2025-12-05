package com.r4men.create_cobblemon.datagen.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.item.ModItems;
import com.simibubi.create.api.data.recipe.WashingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public final class ModWashingRecipeGen extends WashingRecipeGen {
    GeneratedRecipe CRUSHED_EXP_QUARTZ = create("crushed_exp_quartz", b -> b
            .require(ModItems.CRUSHED_EXP_QUARTZ)
            .output(CobblemonItems.EXPERIENCE_CANDY_S, 2)
            .output(.75f, CobblemonItems.EXPERIENCE_CANDY_XS)
            .output(.5f, CobblemonItems.EXPERIENCE_CANDY_XS));

    public ModWashingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
