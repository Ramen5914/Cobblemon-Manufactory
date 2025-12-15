package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomModelData;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public final class CMSequencedAssemblyRecipeGen extends SequencedAssemblyRecipeGen {
    GeneratedRecipe POKE_BALL = baseBall(
            "poke_ball",
            CMItems.RED_BALL_LID,
            CMItems.INCOMPLETE_POKE_BALL,
            CobblemonItems.POKE_BALL);

    GeneratedRecipe ANCIENT_SLATE_BALL = simpleCopperBall(
            "ancient_slate_ball",
            CMItems.ANCIENT_BLACK_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_SLATE_BALL,
            CobblemonItems.ANCIENT_SLATE_BALL);

    GeneratedRecipe ANCIENT_AZURE_BALL = simpleCopperBall(
            "ancient_azure_ball",
            CMItems.ANCIENT_BLUE_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_AZURE_BALL,
            CobblemonItems.ANCIENT_AZURE_BALL);

    GeneratedRecipe ANCIENT_FEATHER_BALL = simpleCopperBall(
            "ancient_feather_ball",
            CMItems.ANCIENT_FEATHER_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_FEATHER_BALL,
            CobblemonItems.ANCIENT_FEATHER_BALL);

    GeneratedRecipe ANCIENT_GIGATON_BALL = simpleGoldBall(
            "ancient_gigaton_ball",
            CMItems.ANCIENT_GIGATON_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_GIGATON_BALL,
            CobblemonItems.ANCIENT_GIGATON_BALL);

    GeneratedRecipe ANCIENT_GREAT_BALL = simpleIronBall(
            "ancient_great_ball",
            CMItems.ANCIENT_GREAT_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_GREAT_BALL,
            CobblemonItems.ANCIENT_GREAT_BALL);

    GeneratedRecipe ANCIENT_VERDANT_BALL = simpleCopperBall(
            "ancient_verdant_ball",
            CMItems.ANCIENT_GREEN_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_VERDANT_BALL,
            CobblemonItems.ANCIENT_VERDANT_BALL);

    GeneratedRecipe ANCIENT_HEAVY_BALL = simpleCopperBall(
            "ancient_heavy_ball",
            CMItems.ANCIENT_HEAVY_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_HEAVY_BALL,
            CobblemonItems.ANCIENT_HEAVY_BALL);

    GeneratedRecipe ANCIENT_JET_BALL = simpleGoldBall(
            "ancient_jet_ball",
            CMItems.ANCIENT_JET_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_JET_BALL,
            CobblemonItems.ANCIENT_JET_BALL);

    GeneratedRecipe ANCIENT_LEADEN_BALL = simpleIronBall(
            "ancient_leaden_ball",
            CMItems.ANCIENT_LEADEN_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_LEADEN_BALL,
            CobblemonItems.ANCIENT_LEADEN_BALL);

    GeneratedRecipe ANCIENT_ROSEATE_BALL = simpleCopperBall(
            "ancient_roseate_ball",
            CMItems.ANCIENT_PINK_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_ROSEATE_BALL,
            CobblemonItems.ANCIENT_ROSEATE_BALL);

    GeneratedRecipe ANCIENT_POKE_BALL = simpleCopperBall(
            "ancient_poke_ball",
            CMItems.ANCIENT_RED_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_POKE_BALL,
            CobblemonItems.ANCIENT_POKE_BALL);

    GeneratedRecipe ANCIENT_ULTRA_BALL = simpleGoldBall(
            "ancient_ultra_ball",
            CMItems.ANCIENT_ULTRA_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_ULTRA_BALL,
            CobblemonItems.ANCIENT_ULTRA_BALL);

    GeneratedRecipe ANCIENT_IVORY_BALL = simpleCopperBall(
            "ancient_ivory_ball",
            CMItems.ANCIENT_WHITE_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_IVORY_BALL,
            CobblemonItems.ANCIENT_IVORY_BALL);

    GeneratedRecipe ANCIENT_WING_BALL = simpleIronBall(
            "ancient_wing_ball",
            CMItems.ANCIENT_WING_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_WING_BALL,
            CobblemonItems.ANCIENT_WING_BALL);

    GeneratedRecipe ANCIENT_CITRINE_BALL = simpleCopperBall(
            "ancient_citrine_ball",
            CMItems.ANCIENT_YELLOW_BALL_LID,
            CMItems.INCOMPLETE_ANCIENT_CITRINE_BALL,
            CobblemonItems.ANCIENT_CITRINE_BALL);

    GeneratedRecipe AZURE_BALL = simpleCopperBall(
            "azure_ball",
            CMItems.BLUE_BALL_LID,
            CMItems.INCOMPLETE_AZURE_BALL,
            CobblemonItems.AZURE_BALL);

    GeneratedRecipe BEAST_BALL = simpleCopperBall(
            "beast_ball",
            CMItems.BEAST_BALL_LID,
            CMItems.INCOMPLETE_BEAST_BALL,
            CobblemonItems.BEAST_BALL);

    GeneratedRecipe CHERISH_BALL = simpleCopperBall(
            "cherish_ball",
            CMItems.RED_BALL_LID,
            CMItems.INCOMPLETE_CHERISH_BALL,
            CobblemonItems.CHERISH_BALL);

    GeneratedRecipe CITRINE_BALL = simpleCopperBall(
            "citrine_ball",
            CMItems.YELLOW_BALL_LID,
            CMItems.INCOMPLETE_CITRINE_BALL,
            CobblemonItems.CITRINE_BALL);

    GeneratedRecipe DIVE_BALL = simpleIronBall(
            "dive_ball",
            CMItems.DIVE_BALL_LID,
            CMItems.INCOMPLETE_DIVE_BALL,
            CobblemonItems.DIVE_BALL);

    GeneratedRecipe DREAM_BALL = simpleCopperBall(
            "dream_ball",
            CMItems.DREAM_BALL_LID,
            CMItems.INCOMPLETE_DREAM_BALL,
            CobblemonItems.DREAM_BALL);

    GeneratedRecipe DUSK_BALL = simpleGoldBall(
            "dusk_ball",
            CMItems.DUSK_BALL_LID,
            CMItems.INCOMPLETE_DUSK_BALL,
            CobblemonItems.DUSK_BALL);

    GeneratedRecipe FAST_BALL = simpleIronBall(
            "fast_ball",
            CMItems.FAST_BALL_LID,
            CMItems.INCOMPLETE_FAST_BALL,
            CobblemonItems.FAST_BALL);

    GeneratedRecipe FRIEND_BALL = simpleIronBall(
            "friend_ball",
            CMItems.FRIEND_BALL_LID,
            CMItems.INCOMPLETE_FRIEND_BALL,
            CobblemonItems.FRIEND_BALL);

    GeneratedRecipe GREAT_BALL = simpleIronBall(
            "great_ball",
            CMItems.GREAT_BALL_LID,
            CMItems.INCOMPLETE_GREAT_BALL,
            CobblemonItems.GREAT_BALL);

    GeneratedRecipe HEAL_BALL = simpleCopperBall(
            "heal_ball",
            CMItems.HEAL_BALL_LID,
            CMItems.INCOMPLETE_HEAL_BALL,
            CobblemonItems.HEAL_BALL);

    GeneratedRecipe HEAVY_BALL = simpleIronBall(
            "heavy_ball",
            CMItems.HEAVY_BALL_LID,
            CMItems.INCOMPLETE_HEAVY_BALL,
            CobblemonItems.HEAVY_BALL);

    GeneratedRecipe LEVEL_BALL = simpleIronBall(
            "level_ball",
            CMItems.LEVEL_BALL_LID,
            CMItems.INCOMPLETE_LEVEL_BALL,
            CobblemonItems.LEVEL_BALL);

    GeneratedRecipe LOVE_BALL = simpleGoldBall(
            "love_ball",
            CMItems.LOVE_BALL_LID,
            CMItems.INCOMPLETE_LOVE_BALL,
            CobblemonItems.LOVE_BALL);

    GeneratedRecipe LURE_BALL = simpleIronBall(
            "lure_ball",
            CMItems.LURE_BALL_LID,
            CMItems.INCOMPLETE_LURE_BALL,
            CobblemonItems.LURE_BALL);

    GeneratedRecipe LUXURY_BALL = simpleGoldBall(
            "luxury_ball",
            CMItems.LUXURY_BALL_LID,
            CMItems.INCOMPLETE_LUXURY_BALL,
            CobblemonItems.LUXURY_BALL);

    GeneratedRecipe MASTER_BALL = simpleCopperBall(
            "master_ball",
            CMItems.MASTER_BALL_LID,
            CMItems.INCOMPLETE_MASTER_BALL,
            CobblemonItems.MASTER_BALL);

    GeneratedRecipe MOON_BALL = simpleIronBall(
            "moon_ball",
            CMItems.MOON_BALL_LID,
            CMItems.INCOMPLETE_MOON_BALL,
            CobblemonItems.MOON_BALL);

    GeneratedRecipe NEST_BALL = simpleIronBall(
            "nest_ball",
            CMItems.NEST_BALL_LID,
            CMItems.INCOMPLETE_NEST_BALL,
            CobblemonItems.NEST_BALL);

    GeneratedRecipe NET_BALL = simpleIronBall(
            "net_ball",
            CMItems.NET_BALL_LID,
            CMItems.INCOMPLETE_NET_BALL,
            CobblemonItems.NET_BALL);

    GeneratedRecipe PARK_BALL = simpleIronBall(
            "park_ball",
            CMItems.PARK_BALL_LID,
            CMItems.INCOMPLETE_PARK_BALL,
            CobblemonItems.PARK_BALL);

    GeneratedRecipe PREMIER_BALL = simpleCopperBall(
            "premier_ball",
            CMItems.WHITE_BALL_LID,
            CMItems.INCOMPLETE_PREMIER_BALL,
            CobblemonItems.PREMIER_BALL);

    GeneratedRecipe QUICK_BALL = simpleGoldBall(
            "quick_ball",
            CMItems.QUICK_BALL_LID,
            CMItems.INCOMPLETE_QUICK_BALL,
            CobblemonItems.QUICK_BALL);

    GeneratedRecipe REPEAT_BALL = simpleGoldBall(
            "repeat_ball",
            CMItems.REPEAT_BALL_LID,
            CMItems.INCOMPLETE_REPEAT_BALL,
            CobblemonItems.REPEAT_BALL);

    GeneratedRecipe ROSEATE_BALL = simpleCopperBall(
            "roseate_ball",
            CMItems.PINK_BALL_LID,
            CMItems.INCOMPLETE_ROSEATE_BALL,
            CobblemonItems.ROSEATE_BALL);

    GeneratedRecipe SAFARI_BALL = simpleCopperBall(
            "safari_ball",
            CMItems.SAFARI_BALL_LID,
            CMItems.INCOMPLETE_SAFARI_BALL,
            CobblemonItems.SAFARI_BALL);

    GeneratedRecipe SLATE_BALL = simpleCopperBall(
            "slate_ball",
            CMItems.BLACK_BALL_LID,
            CMItems.INCOMPLETE_SLATE_BALL,
            CobblemonItems.SLATE_BALL);

    GeneratedRecipe SPORT_BALL = simpleIronBall(
            "sport_ball",
            CMItems.SPORT_BALL_LID,
            CMItems.INCOMPLETE_SPORT_BALL,
            CobblemonItems.SPORT_BALL);

    GeneratedRecipe TIMER_BALL = simpleGoldBall(
            "timer_ball",
            CMItems.TIMER_BALL_LID,
            CMItems.INCOMPLETE_TIMER_BALL,
            CobblemonItems.TIMER_BALL);

    GeneratedRecipe ULTRA_BALL = simpleGoldBall(
            "ultra_ball",
            CMItems.ULTRA_BALL_LID,
            CMItems.INCOMPLETE_ULTRA_BALL,
            CobblemonItems.ULTRA_BALL);

    GeneratedRecipe VERDANT_BALL = simpleCopperBall(
            "verdant_ball",
            CMItems.GREEN_BALL_LID,
            CMItems.INCOMPLETE_VERDANT_BALL,
            CobblemonItems.VERDANT_BALL);

    GeneratedRecipe MASTER_BALL_LID = create(
            "master_ball_lid", b -> b
                    .require(Items.SHULKER_SHELL)
                    .transitionTo(CMItems.INCOMPLETE_MASTER_BALL_LID)
                    .addOutput(CMItems.MASTER_BALL_LID, 1)
                    .loops(1)
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(AllItems.SAND_PAPER))
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Items.NETHERITE_INGOT))
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Items.NETHERITE_INGOT)));

    public CMSequencedAssemblyRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }

    private GeneratedRecipe simpleBall(String name, ItemLike lid, ItemLike incomplete, ItemLike ball, TagKey<Item> tag) {
        return create(name, b -> b
                .require(lid)
                .transitionTo(incomplete)
                .addOutput(ball, 1)
                .loops(1)
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.IRON_BALL_BASE))
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(tag)));
    }

    private GeneratedRecipe simpleBall(String name, ItemLike lid, ItemLike incomplete, ItemLike ball, ItemLike nugget) {
        return create(name, b -> b
                .require(lid)
                .transitionTo(incomplete)
                .addOutput(ball, 1)
                .loops(1)
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.IRON_BALL_BASE))
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(nugget)));
    }

    private GeneratedRecipe baseBall(String name, ItemLike lid, ItemLike incomplete, ItemLike ball) {
        ItemStack transitional = new ItemStack(incomplete);
        transitional.set(DataComponents.CUSTOM_MODEL_DATA, new CustomModelData(0));

        return create(name, b -> b
                .require(lid)
                .transitionTo(transitional.getItem())
                .addOutput(ball, 1)
                .loops(1)
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.COPPER_BALL_BASE))
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Items.IRON_NUGGET)));
    }

    private GeneratedRecipe simpleCopperBall(String name, ItemLike lid, ItemLike incomplete, ItemLike ball) {
        return simpleBall(name, lid, incomplete, ball, AllItems.COPPER_NUGGET);
    }

    private GeneratedRecipe simpleGoldBall(String name, ItemLike lid, ItemLike incomplete, ItemLike ball) {
        return simpleBall(name, lid, incomplete, ball, Tags.Items.NUGGETS_GOLD);
    }

    private GeneratedRecipe simpleIronBall(String name, ItemLike lid, ItemLike incomplete, ItemLike ball) {
        return simpleBall(name, lid, incomplete, ball, Tags.Items.NUGGETS_IRON);
    }
}
