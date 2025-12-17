package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.simibubi.create.api.data.recipe.PolishingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class CMPolishingRecipeGen extends PolishingRecipeGen {
    GeneratedRecipe EXP_CANDY_M = create(
            "exp_candy_m", b -> b
                    .require(CMItems.EXP_QUARTZ)
                    .output(CobblemonItems.EXPERIENCE_CANDY_M));

    public CMPolishingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }

    @Override
    public @NotNull String getName() {
        return CobblemonManufactory.NAME + "'s Polishing Recipes";
    }
}
