package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import com.simibubi.create.content.kinetics.press.PressingRecipe;
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
    GeneratedRecipe ANCIENT_AZURE_BALL_LID = create(
            "ancient_azure_ball_lid", b -> b
                    .require(CobblemonItems.TUMBLESTONE)
                    .transitionTo(CMItems.INCOMPLETE_ANCIENT_AZURE_BALL_LID)
                    .addOutput(CMItems.ANCIENT_AZURE_BALL_LID, 1)
                    .loops(1)
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CobblemonItems.BLUE_APRICORN))
                    .addStep(PressingRecipe::new, rb -> rb));

    GeneratedRecipe ANCIENT_AZURE_BALL_BASE = create(
            "ancient_azure_ball_base", b -> b
                    .require(CobblemonItems.TUMBLESTONE)
                    .transitionTo(CMItems.INCOMPLETE_ANCIENT_AZURE_BALL_BASE)
                    .addOutput(CMItems.ANCIENT_AZURE_BALL_BASE, 1)
                    .loops(1)
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CobblemonItems.BLUE_APRICORN))
                    .addStep(PressingRecipe::new, rb -> rb));

    GeneratedRecipe ANCIENT_AZURE_BALL = create(
            "ancient_azure_ball", b -> b
                    .require(CMItems.COPPER_BALL_CORE)
                    .transitionTo(CMItems.INCOMPLETE_ANCIENT_AZURE_BALL)
                    .addOutput(CobblemonItems.ANCIENT_AZURE_BALL, 1)
                    .loops(1)
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.ANCIENT_AZURE_BALL_BASE))
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.ANCIENT_AZURE_BALL_LID))
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Items.IRON_NUGGET)));

    GeneratedRecipe POKE_BALL_LID = create(
            "poke_ball_lid", b -> b
                    .require(CobblemonItems.RED_APRICORN)
                    .transitionTo(CMItems.INCOMPLETE_POKE_BALL_LID)
                    .addOutput(CMItems.POKE_BALL_LID, 1)
                    .loops(1)
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CobblemonItems.RED_APRICORN))
                    .addStep(PressingRecipe::new, rb -> rb));

    GeneratedRecipe POKE_BALL_BASE = create(
            "poke_ball_base", b -> b
                    .require(CobblemonItems.RED_APRICORN)
                    .transitionTo(CMItems.INCOMPLETE_POKE_BALL_BASE)
                    .addOutput(CMItems.POKE_BALL_BASE, 1)
                    .loops(1)
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CobblemonItems.RED_APRICORN))
                    .addStep(DeployerApplicationRecipe::new, rb -> rb));

    GeneratedRecipe POKE_BALL = create(
            "poke_ball", b -> b
                    .require(CMItems.COPPER_BALL_CORE)
                    .transitionTo(CMItems.INCOMPLETE_POKE_BALL)
                    .addOutput(CobblemonItems.POKE_BALL, 1)
                    .loops(1)
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.POKE_BALL_BASE))
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.POKE_BALL_LID))
                    .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Items.IRON_NUGGET)));

    public CMSequencedAssemblyRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }

    @Override
    public String getName() {
        return CobblemonManufactory.NAME + "'s Sequenced Assembly Recipes";
    }

    private GeneratedRecipe simpleBall(String name, ItemLike lid, ItemLike incomplete, ItemLike ball, TagKey<Item> tag) {
        return create(name, b -> b
                .require(lid)
                .transitionTo(incomplete)
                .addOutput(ball, 1)
                .loops(1)
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.IRON_BALL_CORE))
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(tag)));
    }

    private GeneratedRecipe simpleBall(String name, ItemLike lid, ItemLike incomplete, ItemLike ball, ItemLike nugget) {
        return create(name, b -> b
                .require(lid)
                .transitionTo(incomplete)
                .addOutput(ball, 1)
                .loops(1)
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.IRON_BALL_CORE))
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
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.COPPER_BALL_CORE))
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
