package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.fluid.CMFluids;
import com.r4men.cobblemon_manufactory.util.CMTags;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public final class CMMixingRecipeGen extends MixingRecipeGen {
    GeneratedRecipe ANTIDOTE = medicinalBrewToPotion(
            "antidote",
            CobblemonItems.PECHA_BERRY,
            CMFluids.ANTIDOTE.get());

    GeneratedRecipe AWAKENING = medicinalBrewToPotion(
            "awakening",
            CobblemonItems.CHESTO_BERRY,
            CMFluids.AWAKENING.get());

    GeneratedRecipe BERRY_SWEET = create(
            "berry_sweet", b -> b
                    .require(Items.BLUE_DYE)
                    .require(Tags.Fluids.HONEY, 125)
                    .require(Items.SUGAR)
                    .output(CobblemonItems.BERRY_SWEET));

    GeneratedRecipe BURN_HEAL = medicinalBrewToPotion(
            "burn_heal",
            CobblemonItems.RAWST_BERRY,
            CMFluids.BURN_HEAL.get());

    GeneratedRecipe CLOVER_SWEET = create(
            "clover_sweet", b -> b
                    .require(Items.GREEN_DYE)
                    .require(Tags.Fluids.HONEY, 125)
                    .require(Items.SUGAR)
                    .output(CobblemonItems.CLOVER_SWEET));

    GeneratedRecipe ELIXIR = medicinalBrewToPotion(
            "elixir",
            CobblemonItems.HOPO_BERRY,
            CMFluids.ELIXIR.get());

    GeneratedRecipe ETHER = medicinalBrewToPotion(
            "ether",
            CobblemonItems.LEPPA_BERRY,
            CMFluids.ETHER.get());

    GeneratedRecipe FLOWER_SWEET = create(
            "flower_sweet", b -> b
                    .require(Items.ORANGE_DYE)
                    .require(Tags.Fluids.HONEY, 125)
                    .require(Items.SUGAR)
                    .output(CobblemonItems.FLOWER_SWEET));

    GeneratedRecipe FULL_HEAL = xToPotion(
            "full_heal",
            CobblemonItems.LUM_BERRY,
            CMTags.Fluids.UPGRADES_TO_FULL_HEAL,
            CMFluids.FULL_HEAL.get());

    GeneratedRecipe FULL_RESTORE = xToPotion(
            "full_restore",
            CobblemonItems.LUM_BERRY,
            CMFluids.MAX_POTION.get(),
            CMFluids.FULL_RESTORE.get());

    GeneratedRecipe HYPER_POTION = medicinalBrewToPotion(
            "hyper_potion",
            CobblemonItems.SITRUS_BERRY,
            CMFluids.HYPER_POTION.get());

    GeneratedRecipe HYPER_POTION_FROM_SUPER_POTION = create(
            "hyper_potion_from_super_potion", b -> b
                    .requiresHeat(HeatCondition.HEATED)
                    .require(CMFluids.SUPER_POTION.get(), 1000)
                    .require(CMTags.Items.UPGRADES_SUPER_POTION)
                    .output(CMFluids.HYPER_POTION.get(), 1000));

    GeneratedRecipe ICE_HEAL = medicinalBrewToPotion(
            "ice_heal",
            CobblemonItems.ASPEAR_BERRY,
            CMFluids.ICE_HEAL.get());

    GeneratedRecipe LOVE_SWEET = create(
            "love_sweet", b -> b
                    .require(Items.PINK_DYE)
                    .require(Tags.Fluids.HONEY, 125)
                    .require(Items.SUGAR)
                    .output(CobblemonItems.LOVE_SWEET));

    GeneratedRecipe MAX_ELIXIR = xToPotion(
            "max_elixir",
            CobblemonItems.PEP_UP_FLOWER,
            CMFluids.ELIXIR.get(),
            CMFluids.MAX_ELIXIR.get());

    GeneratedRecipe MAX_ETHER = xToPotion(
            "max_ether",
            CobblemonItems.PEP_UP_FLOWER,
            CMFluids.ETHER.get(),
            CMFluids.MAX_ETHER.get());

    GeneratedRecipe MAX_POTION = xToPotion(
            "max_potion",
            CobblemonItems.VIVICHOKE,
            CMFluids.HYPER_POTION.get(),
            CMFluids.MAX_POTION.get());

    GeneratedRecipe MEDICINAL_BREW = xToPotion(
            "medicinal_brew",
            CobblemonItems.MEDICINAL_LEEK,
            Tags.Fluids.WATER,
            CMFluids.MEDICINAL_BREW.get());

    GeneratedRecipe PARALYZE_HEAL = medicinalBrewToPotion(
            "paralyze_heal",
            CobblemonItems.CHERI_BERRY,
            CMFluids.PARALYZE_HEAL.get());

    GeneratedRecipe POTION = medicinalBrewToPotion(
            "potion",
            CobblemonItems.ORAN_BERRY,
            CMFluids.POTION.get());

    GeneratedRecipe RIBBON_SWEET = create(
            "ribbon_sweet", b -> b
                    .require(Items.PURPLE_DYE)
                    .require(Tags.Fluids.HONEY, 125)
                    .require(Items.SUGAR)
                    .output(CobblemonItems.RIBBON_SWEET));

    GeneratedRecipe STAR_SWEET = create(
            "star_sweet", b -> b
                    .require(Items.YELLOW_DYE)
                    .require(Tags.Fluids.HONEY, 125)
                    .require(Items.SUGAR)
                    .output(CobblemonItems.STAR_SWEET));

    GeneratedRecipe STRAWBERRY_SWEET = create(
            "strawberry_sweet", b -> b
                    .require(Items.RED_DYE)
                    .require(Tags.Fluids.HONEY, 125)
                    .require(Items.SUGAR)
                    .output(CobblemonItems.STRAWBERRY_SWEET));

    GeneratedRecipe SUPER_POTION = xToPotion(
            "super_potion",
            CobblemonItems.ENERGY_ROOT,
            CMFluids.POTION.get(),
            CMFluids.SUPER_POTION.get());

    GeneratedRecipe VIVICHOKE_DIP = create(
            "vivichoke_dip", b -> b
                    .require(CobblemonItems.VIVICHOKE)
                    .require(Tags.Fluids.MILK, 500)
                    .require(Items.BOWL)
                    .require(Items.BREAD)
                    .output(CobblemonItems.VIVICHOKE_DIP));

    private GeneratedRecipe xToPotion(String name, ItemLike item, FlowingFluid in, FlowingFluid out) {
        return create(name, b -> b
                .requiresHeat(HeatCondition.HEATED)
                .require(in, 1000)
                .require(item)
                .output(out, 1000));
    }

    private GeneratedRecipe xToPotion(String name, ItemLike item, TagKey<Fluid> in, FlowingFluid out) {
        return create(name, b -> b
                .requiresHeat(HeatCondition.HEATED)
                .require(in, 1000)
                .require(item)
                .output(out, 1000));
    }

    private GeneratedRecipe medicinalBrewToPotion(String name, ItemLike berry, FlowingFluid potion) {
        return create(name, b -> b
                .requiresHeat(HeatCondition.HEATED)
                .require(CMFluids.MEDICINAL_BREW.get(), 1000)
                .require(berry)
                .output(potion, 1000));
    }

    public CMMixingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }
}
