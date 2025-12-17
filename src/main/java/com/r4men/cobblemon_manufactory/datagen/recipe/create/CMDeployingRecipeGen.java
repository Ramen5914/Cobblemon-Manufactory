package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.DeployingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class CMDeployingRecipeGen extends DeployingRecipeGen {
    GeneratedRecipe ANCIENT_BLACK_BALL_LID = create(
            "ancient_black_ball_lid", b -> b
                    .require(CMItems.TUMBLESTONE_LID)
                    .require(Items.BLACK_DYE)
                    .output(CMItems.ANCIENT_BLACK_BALL_LID));

    GeneratedRecipe ANCIENT_BLUE_BALL_LID = create(
            "ancient_blue_ball_lid", b -> b
                    .require(CMItems.TUMBLESTONE_LID)
                    .require(Items.BLUE_DYE)
                    .output(CMItems.ANCIENT_BLUE_BALL_LID));

    GeneratedRecipe ANCIENT_GIGATON_BALL_LID = create(
            "ancient_gigaton_ball_lid", b -> b
                    .require(CMItems.ANCIENT_LEADEN_BALL_LID)
                    .require(Items.GOLD_NUGGET)
                    .output(CMItems.ANCIENT_GIGATON_BALL_LID));

    GeneratedRecipe ANCIENT_GREAT_BALL_LID = create(
            "ancient_great_ball_lid", b -> b
                    .require(CMItems.ANCIENT_BLUE_BALL_LID)
                    .require(Items.RED_DYE)
                    .output(CMItems.ANCIENT_GREAT_BALL_LID));

    GeneratedRecipe ANCIENT_GREEN_BALL_LID = create(
            "ancient_green_ball_lid", b -> b
                    .require(CMItems.TUMBLESTONE_LID)
                    .require(Items.GREEN_DYE)
                    .output(CMItems.ANCIENT_GREEN_BALL_LID));

    GeneratedRecipe ANCIENT_HEAVY_BALL_LID = create(
            "ancient_heavy_ball_lid", b -> b
                    .require(CMItems.BLACK_TUMBLESTONE_LID)
                    .require(Items.BLACK_DYE)
                    .output(CMItems.ANCIENT_HEAVY_BALL_LID));

    GeneratedRecipe ANCIENT_LEADEN_BALL_LID = create(
            "ancient_leaden_ball_lid", b -> b
                    .require(CMItems.ANCIENT_HEAVY_BALL_LID)
                    .require(Items.IRON_NUGGET)
                    .output(CMItems.ANCIENT_LEADEN_BALL_LID));

    GeneratedRecipe ANCIENT_PINK_BALL_LID = create(
            "ancient_pink_ball_lid", b -> b
                    .require(CMItems.TUMBLESTONE_LID)
                    .require(Items.PINK_DYE)
                    .output(CMItems.ANCIENT_PINK_BALL_LID));

    GeneratedRecipe ANCIENT_RED_BALL_LID = create(
            "ancient_red_ball_lid", b -> b
                    .require(CMItems.TUMBLESTONE_LID)
                    .require(Items.RED_DYE)
                    .output(CMItems.ANCIENT_RED_BALL_LID));

    GeneratedRecipe ANCIENT_ULTRA_BALL_LID = create(
            "ancient_ultra_ball_lid", b -> b
                    .require(CMItems.ANCIENT_BLACK_BALL_LID)
                    .require(Items.YELLOW_DYE)
                    .output(CMItems.ANCIENT_ULTRA_BALL_LID));

    GeneratedRecipe ANCIENT_WHITE_BALL_LID = create(
            "ancient_white_ball_lid", b -> b
                    .require(CMItems.TUMBLESTONE_LID)
                    .require(Items.WHITE_DYE)
                    .output(CMItems.ANCIENT_WHITE_BALL_LID));

    GeneratedRecipe ANCIENT_YELLOW_BALL_LID = create(
            "ancient_yellow_ball_lid", b -> b
                    .require(CMItems.TUMBLESTONE_LID)
                    .require(Items.YELLOW_DYE)
                    .output(CMItems.ANCIENT_YELLOW_BALL_LID));

    GeneratedRecipe BEAST_BALL_LID = create(
            "beast_ball_lid", b -> b
                    .require(AllItems.GOLDEN_SHEET)
                    .require(Items.ECHO_SHARD)
                    .output(CMItems.BEAST_BALL_LID));

    GeneratedRecipe DIVE_BALL_LID = create(
            "dive_ball_lid", b -> b
                    .require(CMItems.BLUE_BALL_LID)
                    .require(Items.WHITE_DYE)
                    .output(CMItems.DIVE_BALL_LID));

    GeneratedRecipe DREAM_BALL_LID = create(
            "dream_ball_lid", b -> b
                    .require(CMItems.GREAT_BALL_LID)
                    .require(Items.PINK_DYE)
                    .output(CMItems.DREAM_BALL_LID));

    GeneratedRecipe DUSK_BALL_LID = create(
            "dusk_ball_lid", b -> b
                    .require(CMItems.GREEN_BALL_LID)
                    .require(Items.BLACK_DYE)
                    .output(CMItems.DUSK_BALL_LID));

    GeneratedRecipe FAST_BALL_LID = create(
            "fast_ball_lid", b -> b
                    .require(CMItems.RED_BALL_LID)
                    .require(Items.YELLOW_DYE)
                    .output(CMItems.FAST_BALL_LID));

    GeneratedRecipe ANCIENT_FEATHER_BALL_LID = create(
            "ancient_feather_ball_lid", b -> b
                    .require(CMItems.SKY_TUMBLESTONE_LID)
                    .require(Items.LIGHT_BLUE_DYE)
                    .output(CMItems.ANCIENT_FEATHER_BALL_LID));

    GeneratedRecipe FRIEND_BALL_LID = create(
            "friend_ball_lid", b -> b
                    .require(CMItems.GREEN_BALL_LID)
                    .require(Items.RED_DYE)
                    .output(CMItems.FRIEND_BALL_LID));

    GeneratedRecipe GREAT_BALL_LID = create(
            "great_ball_lid", b -> b
                    .require(CMItems.BLUE_BALL_LID)
                    .require(Items.RED_DYE)
                    .output(CMItems.GREAT_BALL_LID));

    GeneratedRecipe HEAL_BALL_LID = create(
            "heal_ball_lid", b -> b
                    .require(CMItems.PINK_BALL_LID)
                    .require(Items.WHITE_DYE)
                    .output(CMItems.HEAL_BALL_LID));

    GeneratedRecipe HEAVY_BALL_LID = create(
            "heavy_ball_lid", b -> b
                    .require(CMItems.BLACK_BALL_LID)
                    .require(Items.BLUE_DYE)
                    .output(CMItems.HEAVY_BALL_LID));

    GeneratedRecipe ANCIENT_JET_BALL_LID = create(
            "ancient_jet_ball_lid", b -> b
                    .require(CMItems.ANCIENT_WING_BALL_LID)
                    .require(Items.GOLD_NUGGET)
                    .output(CMItems.ANCIENT_JET_BALL_LID));

    GeneratedRecipe LEVEL_BALL_LID = create(
            "level_ball_lid", b -> b
                    .require(CMItems.BLACK_BALL_LID)
                    .require(Items.RED_DYE)
                    .output(CMItems.LEVEL_BALL_LID));

    GeneratedRecipe LOVE_BALL_LID = create(
            "love_ball_lid", b -> b
                    .require(CMItems.WHITE_BALL_LID)
                    .require(Items.PINK_DYE)
                    .output(CMItems.LOVE_BALL_LID));

    GeneratedRecipe LURE_BALL_LID = create(
            "lure_ball_lid", b -> b
                    .require(CMItems.RED_BALL_LID)
                    .require(Items.CYAN_DYE)
                    .output(CMItems.LURE_BALL_LID));

    GeneratedRecipe LUXURY_BALL_LID = create(
            "luxury_ball_lid", b -> b
                    .require(CMItems.BLACK_BALL_LID)
                    .require(Items.GOLD_NUGGET)
                    .output(CMItems.LUXURY_BALL_LID));

    GeneratedRecipe MOON_BALL_LID = create(
            "moon_ball_lid", b -> b
                    .require(CMItems.NET_BALL_LID)
                    .require(Items.YELLOW_DYE)
                    .output(CMItems.MOON_BALL_LID));

    GeneratedRecipe NEST_BALL_LID = create(
            "nest_ball_lid", b -> b
                    .require(CMItems.GREEN_BALL_LID)
                    .require(Items.YELLOW_DYE)
                    .output(CMItems.NEST_BALL_LID));

    GeneratedRecipe NET_BALL_LID = create(
            "net_ball_lid", b -> b
                    .require(CMItems.BLUE_BALL_LID)
                    .require(Items.BLACK_DYE)
                    .output(CMItems.NET_BALL_LID));

    GeneratedRecipe PARK_BALL_LID = create(
            "park_ball_lid", b -> b
                    .require(CMItems.GREEN_BALL_LID)
                    .require(Items.LIME_DYE)
                    .output(CMItems.PARK_BALL_LID));

    GeneratedRecipe QUICK_BALL_LID = create(
            "quick_ball_lid", b -> b
                    .require(CMItems.BLUE_BALL_LID)
                    .require(Items.YELLOW_DYE)
                    .output(CMItems.QUICK_BALL_LID));

    GeneratedRecipe REPEAT_BALL_LID = create(
            "repeat_ball_lid", b -> b
                    .require(CMItems.LEVEL_BALL_LID)
                    .require(Items.YELLOW_DYE)
                    .output(CMItems.REPEAT_BALL_LID));

    GeneratedRecipe SAFARI_BALL_LID = create(
            "safari_ball_lid", b -> b
                    .require(CMItems.GREEN_BALL_LID)
                    .require(Items.BROWN_DYE)
                    .output(CMItems.SAFARI_BALL_LID));

    GeneratedRecipe SPORT_BALL_LID = create(
            "sport_ball_lid", b -> b
                    .require(CMItems.RED_BALL_LID)
                    .require(Items.WHITE_DYE)
                    .output(CMItems.SPORT_BALL_LID));

    GeneratedRecipe TIMER_BALL_LID = create(
            "timer_ball_lid", b -> b
                    .require(CMItems.SPORT_BALL_LID)
                    .require(Items.BLACK_DYE)
                    .output(CMItems.TIMER_BALL_LID));

    GeneratedRecipe ULTRA_BALL_LID = create(
            "ultra_ball_lid", b -> b
                    .require(CMItems.BLACK_BALL_LID)
                    .require(Items.YELLOW_DYE)
                    .output(CMItems.ULTRA_BALL_LID));

    GeneratedRecipe ANCIENT_WING_BALL_LID = create(
            "ancient_wing_ball_lid", b -> b
                    .require(CMItems.ANCIENT_FEATHER_BALL_LID)
                    .require(Items.IRON_NUGGET)
                    .output(CMItems.ANCIENT_WING_BALL_LID));

    public CMDeployingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }

    @Override
    public @NotNull String getName() {
        return CobblemonManufactory.NAME + "'s Deploying Recipes";
    }
}
