package com.r4men.create_cobblemon.datagen.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.datagen.ModRecipeProvider;
import com.r4men.create_cobblemon.fluid.ModFluids;
import com.simibubi.create.api.data.recipe.EmptyingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.Fluid;

import java.util.concurrent.CompletableFuture;

public final class ModEmptyingRecipeGen extends EmptyingRecipeGen {
    GeneratedRecipe ANTIDOTE = potionEmptying(
            "antidote",
            CobblemonItems.ANTIDOTE,
            ModFluids.ANTIDOTE.get());

    GeneratedRecipe AWAKENING = potionEmptying(
            "awakening",
            CobblemonItems.AWAKENING,
            ModFluids.AWAKENING.get());

    GeneratedRecipe BURN_HEAL = potionEmptying(
            "burn_heal",
            CobblemonItems.BURN_HEAL,
            ModFluids.BURN_HEAL.get());

    GeneratedRecipe ELIXIR = potionEmptying(
            "elixir",
            CobblemonItems.ELIXIR,
            ModFluids.ELIXIR.get());

    GeneratedRecipe ETHER = potionEmptying(
            "ether",
            CobblemonItems.ETHER,
            ModFluids.ETHER.get());

    GeneratedRecipe FULL_HEAL = potionEmptying(
            "full_heal",
            CobblemonItems.FULL_HEAL,
            ModFluids.FULL_HEAL.get());

    GeneratedRecipe FULL_RESTORE = potionEmptying(
            "full_restore",
            CobblemonItems.FULL_RESTORE,
            ModFluids.FULL_RESTORE.get());

    GeneratedRecipe HYPER_POTION = potionEmptying(
            "hyper_potion",
            CobblemonItems.HYPER_POTION,
            ModFluids.HYPER_POTION.get());

    GeneratedRecipe ICE_HEAL = potionEmptying(
            "ice_heal",
            CobblemonItems.ICE_HEAL,
            ModFluids.ICE_HEAL.get());

    GeneratedRecipe MAX_ELIXIR = potionEmptying(
            "max_elixir",
            CobblemonItems.MAX_ELIXIR,
            ModFluids.MAX_ELIXIR.get());

    GeneratedRecipe MAX_ETHER = potionEmptying(
            "max_ether",
            CobblemonItems.MAX_ETHER,
            ModFluids.MAX_ETHER.get());

    GeneratedRecipe MAX_POTION = potionEmptying(
            "max_potion",
            CobblemonItems.MAX_POTION,
            ModFluids.MAX_POTION.get());

    GeneratedRecipe MEDICINAL_BREW = potionEmptying(
            "medicinal_brew",
            CobblemonItems.MEDICINAL_BREW,
            ModFluids.MEDICINAL_BREW.get());

    GeneratedRecipe PARALYZE_HEAL = potionEmptying(
            "paralyze_heal",
            CobblemonItems.PARALYZE_HEAL,
            ModFluids.PARALYZE_HEAL.get());

    GeneratedRecipe POTION = potionEmptying(
            "potion",
            CobblemonItems.POTION,
            ModFluids.POTION.get());

    GeneratedRecipe SUPER_POTION = potionEmptying(
            "super_potion",
            CobblemonItems.SUPER_POTION,
            ModFluids.SUPER_POTION.get());

    private GeneratedRecipe potionEmptying(String name, ItemLike potion, Fluid fluid) {
        return create(
                name, b -> b
                        .require(potion)
                        .output(fluid, ModRecipeProvider.BOTTLE)
                        .output(Items.GLASS_BOTTLE));
    }

    public ModEmptyingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
