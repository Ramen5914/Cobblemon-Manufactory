package com.r4men.create_cobblemon.datagen.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.item.ModItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.HauntingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public final class ModHauntingRecipeGen extends HauntingRecipeGen {
    GeneratedRecipe EXP_QUARTZ = simpleHaunting("exp_quartz", AllItems.ROSE_QUARTZ, ModItems.EXP_QUARTZ);
    GeneratedRecipe COPPER_BLOCK = simpleHaunting("copper_block", Blocks.IRON_BLOCK, Blocks.COPPER_BLOCK);
    GeneratedRecipe COPPER_INGOT = simpleHaunting("copper_ingot", Items.IRON_INGOT, Items.COPPER_INGOT);
    GeneratedRecipe COPPER_NUGGET = simpleHaunting("copper_nugget", Items.IRON_NUGGET, AllItems.COPPER_NUGGET);
    GeneratedRecipe TWISTED_SPOON = simpleHaunting("twisted_spoon", Items.IRON_SHOVEL, CobblemonItems.TWISTED_SPOON);

    private GeneratedRecipe simpleHaunting(String name, ItemLike from, ItemLike to) {
        return create(name, b -> b.require(from).output(to));
    }

    public ModHauntingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCobblemon.MOD_ID);
    }
}
