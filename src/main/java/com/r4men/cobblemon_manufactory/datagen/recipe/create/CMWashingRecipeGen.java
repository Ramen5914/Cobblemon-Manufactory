package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.simibubi.create.api.data.recipe.WashingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class CMWashingRecipeGen extends WashingRecipeGen {
    GeneratedRecipe CRUSHED_EXP_QUARTZ = create("crushed_exp_quartz", b -> b
            .require(CMItems.CRUSHED_EXP_QUARTZ)
            .output(CobblemonItems.EXPERIENCE_CANDY_S, 2)
            .output(.75f, CobblemonItems.EXPERIENCE_CANDY_XS)
            .output(.5f, CobblemonItems.EXPERIENCE_CANDY_XS));

    public CMWashingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }

    @Override
    public @NotNull String getName() {
        return CobblemonManufactory.NAME + "'s Washing Recipes";
    }
}
