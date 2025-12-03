package com.r4men.create_cobblemon.datagen.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.fluid.ModFluids;
import com.simibubi.create.api.data.recipe.FillingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.concurrent.CompletableFuture;

public class ModFillingRecipeGen extends FillingRecipeGen {
    GeneratedRecipe ANTIDOTE = potionFilling(
            "antidote",
            ModFluids.ANTIDOTE.get(),
            CobblemonItems.ANTIDOTE);

    GeneratedRecipe AWAKENING = potionFilling(
            "awakening",
            ModFluids.AWAKENING.get(),
            CobblemonItems.AWAKENING);

    GeneratedRecipe BURN_HEAL = potionFilling(
            "burn_heal",
            ModFluids.BURN_HEAL.get(),
            CobblemonItems.BURN_HEAL);

    GeneratedRecipe ELIXIR = potionFilling(
            "elixir",
            ModFluids.ELIXIR.get(),
            CobblemonItems.ELIXIR);

    GeneratedRecipe ETHER = potionFilling(
            "ether",
            ModFluids.ETHER.get(),
            CobblemonItems.ETHER);

    GeneratedRecipe FULL_HEAL = potionFilling(
            "full_heal",
            ModFluids.FULL_HEAL.get(),
            CobblemonItems.FULL_HEAL);

    GeneratedRecipe FULL_RESTORE = potionFilling(
            "full_restore",
            ModFluids.FULL_RESTORE.get(),
            CobblemonItems.FULL_RESTORE);

    GeneratedRecipe HYPER_POTION = potionFilling(
            "hyper_potion",
            ModFluids.HYPER_POTION.get(),
            CobblemonItems.HYPER_POTION);

    GeneratedRecipe ICE_HEAL = potionFilling(
            "ice_heal",
            ModFluids.ICE_HEAL.get(),
            CobblemonItems.ICE_HEAL);

    GeneratedRecipe MAX_ELIXIR = potionFilling(
            "max_elixir",
            ModFluids.MAX_ELIXIR.get(),
            CobblemonItems.MAX_ELIXIR);

    GeneratedRecipe MAX_ETHER = potionFilling(
            "max_ether",
            ModFluids.MAX_ETHER.get(),
            CobblemonItems.MAX_ETHER);

    GeneratedRecipe MAX_POTION = potionFilling(
            "max_potion",
            ModFluids.MAX_POTION.get(),
            CobblemonItems.MAX_POTION);

    GeneratedRecipe MEDICINAL_BREW = potionFilling(
            "medicinal_brew",
            ModFluids.MEDICINAL_BREW.get(),
            CobblemonItems.MEDICINAL_BREW);

    GeneratedRecipe PARALYZE_HEAL = potionFilling(
            "paralyze_heal",
            ModFluids.PARALYZE_HEAL.get(),
            CobblemonItems.PARALYZE_HEAL);

    GeneratedRecipe POTION = potionFilling(
            "potion",
            ModFluids.POTION.get(),
            CobblemonItems.POTION);

    GeneratedRecipe SUPER_POTION = potionFilling(
            "super_potion",
            ModFluids.SUPER_POTION.get(),
            CobblemonItems.SUPER_POTION);

    private GeneratedRecipe potionFilling(String name, FlowingFluid fluid, ItemLike potionItem) {
        return create(name, b -> b
                .require(fluid, 250)
                .require(Items.GLASS_BOTTLE)
                .output(potionItem));
    }

    public ModFillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
