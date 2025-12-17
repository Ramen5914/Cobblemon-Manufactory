package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.fluid.CMFluids;
import com.simibubi.create.api.data.recipe.FillingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.concurrent.CompletableFuture;

public final class CMFillingRecipeGen extends FillingRecipeGen {
    GeneratedRecipe ANTIDOTE = potionFilling(
            "antidote",
            CMFluids.ANTIDOTE.get(),
            CobblemonItems.ANTIDOTE);

    GeneratedRecipe AWAKENING = potionFilling(
            "awakening",
            CMFluids.AWAKENING.get(),
            CobblemonItems.AWAKENING);

    GeneratedRecipe BURN_HEAL = potionFilling(
            "burn_heal",
            CMFluids.BURN_HEAL.get(),
            CobblemonItems.BURN_HEAL);

    GeneratedRecipe ELIXIR = potionFilling(
            "elixir",
            CMFluids.ELIXIR.get(),
            CobblemonItems.ELIXIR);

    GeneratedRecipe ETHER = potionFilling(
            "ether",
            CMFluids.ETHER.get(),
            CobblemonItems.ETHER);

    GeneratedRecipe FULL_HEAL = potionFilling(
            "full_heal",
            CMFluids.FULL_HEAL.get(),
            CobblemonItems.FULL_HEAL);

    GeneratedRecipe FULL_RESTORE = potionFilling(
            "full_restore",
            CMFluids.FULL_RESTORE.get(),
            CobblemonItems.FULL_RESTORE);

    GeneratedRecipe HYPER_POTION = potionFilling(
            "hyper_potion",
            CMFluids.HYPER_POTION.get(),
            CobblemonItems.HYPER_POTION);

    GeneratedRecipe ICE_HEAL = potionFilling(
            "ice_heal",
            CMFluids.ICE_HEAL.get(),
            CobblemonItems.ICE_HEAL);

    GeneratedRecipe MAX_ELIXIR = potionFilling(
            "max_elixir",
            CMFluids.MAX_ELIXIR.get(),
            CobblemonItems.MAX_ELIXIR);

    GeneratedRecipe MAX_ETHER = potionFilling(
            "max_ether",
            CMFluids.MAX_ETHER.get(),
            CobblemonItems.MAX_ETHER);

    GeneratedRecipe MAX_POTION = potionFilling(
            "max_potion",
            CMFluids.MAX_POTION.get(),
            CobblemonItems.MAX_POTION);

    GeneratedRecipe MEDICINAL_BREW = potionFilling(
            "medicinal_brew",
            CMFluids.MEDICINAL_BREW.get(),
            CobblemonItems.MEDICINAL_BREW);

    GeneratedRecipe PARALYZE_HEAL = potionFilling(
            "paralyze_heal",
            CMFluids.PARALYZE_HEAL.get(),
            CobblemonItems.PARALYZE_HEAL);

    GeneratedRecipe POTION = potionFilling(
            "potion",
            CMFluids.POTION.get(),
            CobblemonItems.POTION);

    GeneratedRecipe SUPER_POTION = potionFilling(
            "super_potion",
            CMFluids.SUPER_POTION.get(),
            CobblemonItems.SUPER_POTION);

    public CMFillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }

    @Override
    public @NotNull String getName() {
        return CobblemonManufactory.NAME + "'s Filling Recipes";
    }

    private GeneratedRecipe potionFilling(String name, FlowingFluid fluid, ItemLike potionItem) {
        return create(name, b -> b
                .require(fluid, 250)
                .require(Items.GLASS_BOTTLE)
                .output(potionItem));
    }
}
