package com.r4men.create_cobblemon.datagen.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.item.ModItems;
import com.simibubi.create.api.data.recipe.PressingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;

public final class ModPressingRecipeGen extends PressingRecipeGen {
    GeneratedRecipe BLACK_BALL_LID = itemToLid("black_ball_lid", CobblemonItems.BLACK_APRICORN, ModItems.BLACK_BALL_LID);
    GeneratedRecipe BLACK_TUMBLESTONE_LID = itemToLid("black_tumblestone_lid", CobblemonItems.BLACK_TUMBLESTONE, ModItems.BLACK_TUMBLESTONE_LID);
    GeneratedRecipe BLUE_BALL_LID = itemToLid("blue_ball_lid", CobblemonItems.BLUE_APRICORN, ModItems.BLUE_BALL_LID);
    GeneratedRecipe GREEN_BALL_LID = itemToLid("green_ball_lid", CobblemonItems.GREEN_APRICORN, ModItems.GREEN_BALL_LID);
    GeneratedRecipe PINK_BALL_LID = itemToLid("pink_ball_lid", CobblemonItems.PINK_APRICORN, ModItems.PINK_BALL_LID);
    GeneratedRecipe RED_BALL_LID = itemToLid("red_ball_lid", CobblemonItems.RED_APRICORN, ModItems.RED_BALL_LID);
    GeneratedRecipe SKY_TUMBLESTONE_LID = itemToLid("sky_tumblestone_lid", CobblemonItems.SKY_TUMBLESTONE, ModItems.SKY_TUMBLESTONE_LID);
    GeneratedRecipe TUMBLESTONE_LID = itemToLid("tumblestone_lid", CobblemonItems.TUMBLESTONE, ModItems.TUMBLESTONE_LID);
    GeneratedRecipe WHITE_BALL_LID = itemToLid("white_ball_lid", CobblemonItems.WHITE_APRICORN, ModItems.WHITE_BALL_LID);
    GeneratedRecipe YELLOW_BALL_LID = itemToLid("yellow_ball_lid", CobblemonItems.YELLOW_APRICORN, ModItems.YELLOW_BALL_LID);

    private GeneratedRecipe itemToLid(String name, ItemLike apricorn, ItemLike lid) {
        return create(name, b -> b
                .require(apricorn)
                .output(lid));
    }

    public ModPressingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
