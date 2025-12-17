package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.datagen.recipe.CMRecipeProvider;
import com.r4men.cobblemon_manufactory.fluid.CMFluids;
import com.simibubi.create.api.data.recipe.EmptyingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.Fluid;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class CMEmptyingRecipeGen extends EmptyingRecipeGen {
    GeneratedRecipe ANTIDOTE = potionEmptying(
            "antidote",
            CobblemonItems.ANTIDOTE,
            CMFluids.ANTIDOTE.get());

    GeneratedRecipe AWAKENING = potionEmptying(
            "awakening",
            CobblemonItems.AWAKENING,
            CMFluids.AWAKENING.get());

    GeneratedRecipe BURN_HEAL = potionEmptying(
            "burn_heal",
            CobblemonItems.BURN_HEAL,
            CMFluids.BURN_HEAL.get());

    GeneratedRecipe ELIXIR = potionEmptying(
            "elixir",
            CobblemonItems.ELIXIR,
            CMFluids.ELIXIR.get());

    GeneratedRecipe ETHER = potionEmptying(
            "ether",
            CobblemonItems.ETHER,
            CMFluids.ETHER.get());

    GeneratedRecipe FULL_HEAL = potionEmptying(
            "full_heal",
            CobblemonItems.FULL_HEAL,
            CMFluids.FULL_HEAL.get());

    GeneratedRecipe FULL_RESTORE = potionEmptying(
            "full_restore",
            CobblemonItems.FULL_RESTORE,
            CMFluids.FULL_RESTORE.get());

    GeneratedRecipe HYPER_POTION = potionEmptying(
            "hyper_potion",
            CobblemonItems.HYPER_POTION,
            CMFluids.HYPER_POTION.get());

    GeneratedRecipe ICE_HEAL = potionEmptying(
            "ice_heal",
            CobblemonItems.ICE_HEAL,
            CMFluids.ICE_HEAL.get());

    GeneratedRecipe MAX_ELIXIR = potionEmptying(
            "max_elixir",
            CobblemonItems.MAX_ELIXIR,
            CMFluids.MAX_ELIXIR.get());

    GeneratedRecipe MAX_ETHER = potionEmptying(
            "max_ether",
            CobblemonItems.MAX_ETHER,
            CMFluids.MAX_ETHER.get());

    GeneratedRecipe MAX_POTION = potionEmptying(
            "max_potion",
            CobblemonItems.MAX_POTION,
            CMFluids.MAX_POTION.get());

    GeneratedRecipe MEDICINAL_BREW = potionEmptying(
            "medicinal_brew",
            CobblemonItems.MEDICINAL_BREW,
            CMFluids.MEDICINAL_BREW.get());

    GeneratedRecipe PARALYZE_HEAL = potionEmptying(
            "paralyze_heal",
            CobblemonItems.PARALYZE_HEAL,
            CMFluids.PARALYZE_HEAL.get());

    GeneratedRecipe POTION = potionEmptying(
            "potion",
            CobblemonItems.POTION,
            CMFluids.POTION.get());

    GeneratedRecipe SUPER_POTION = potionEmptying(
            "super_potion",
            CobblemonItems.SUPER_POTION,
            CMFluids.SUPER_POTION.get());

    public CMEmptyingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }

    private GeneratedRecipe potionEmptying(String name, ItemLike potion, Fluid fluid) {
        return create(
                name, b -> b
                        .require(potion)
                        .output(fluid, CMRecipeProvider.BOTTLE)
                        .output(Items.GLASS_BOTTLE));
    }

    @Override
    public @NotNull String getName() {
        return CobblemonManufactory.NAME + "'s Emptying Recipes";
    }
}
