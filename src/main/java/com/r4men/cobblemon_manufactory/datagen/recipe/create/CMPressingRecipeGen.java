package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.simibubi.create.api.data.recipe.PressingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;

public final class CMPressingRecipeGen extends PressingRecipeGen {
    GeneratedRecipe BLACK_BALL_LID = itemToLid("black_ball_lid", CobblemonItems.BLACK_APRICORN, CMItems.BLACK_BALL_LID);
    GeneratedRecipe BLACK_TUMBLESTONE_LID = itemToLid("black_tumblestone_lid", CobblemonItems.BLACK_TUMBLESTONE, CMItems.BLACK_TUMBLESTONE_LID);
    GeneratedRecipe BLUE_BALL_LID = itemToLid("blue_ball_lid", CobblemonItems.BLUE_APRICORN, CMItems.BLUE_BALL_LID);
    GeneratedRecipe GREEN_BALL_LID = itemToLid("green_ball_lid", CobblemonItems.GREEN_APRICORN, CMItems.GREEN_BALL_LID);
    GeneratedRecipe PINK_BALL_LID = itemToLid("pink_ball_lid", CobblemonItems.PINK_APRICORN, CMItems.PINK_BALL_LID);
    GeneratedRecipe RED_BALL_LID = itemToLid("red_ball_lid", CobblemonItems.RED_APRICORN, CMItems.RED_BALL_LID);
    GeneratedRecipe SKY_TUMBLESTONE_LID = itemToLid("sky_tumblestone_lid", CobblemonItems.SKY_TUMBLESTONE, CMItems.SKY_TUMBLESTONE_LID);
    GeneratedRecipe TUMBLESTONE_LID = itemToLid("tumblestone_lid", CobblemonItems.TUMBLESTONE, CMItems.TUMBLESTONE_LID);
    GeneratedRecipe WHITE_BALL_LID = itemToLid("white_ball_lid", CobblemonItems.WHITE_APRICORN, CMItems.WHITE_BALL_LID);
    GeneratedRecipe YELLOW_BALL_LID = itemToLid("yellow_ball_lid", CobblemonItems.YELLOW_APRICORN, CMItems.YELLOW_BALL_LID);

    public CMPressingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }

    private GeneratedRecipe itemToLid(String name, ItemLike apricorn, ItemLike lid) {
        return create(name, b -> b
                .require(apricorn)
                .output(lid));
    }
}
