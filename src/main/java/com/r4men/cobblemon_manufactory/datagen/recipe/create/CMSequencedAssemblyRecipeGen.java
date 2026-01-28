package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.r4men.cobblemon_manufactory.util.CMUtil;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import com.simibubi.create.content.kinetics.press.PressingRecipe;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

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

    public CMSequencedAssemblyRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);

        baseBall(CobblemonItems.POKE_BALL,
                CMItems.INCOMPLETE_POKE_BALL,
                CMItems.POKE_BALL_LID,
                CMItems.INCOMPLETE_POKE_BALL_LID,
                CMItems.POKE_BALL_BASE,
                CMItems.INCOMPLETE_POKE_BALL_BASE,
                CobblemonItems.RED_APRICORN);

        baseBall(CobblemonItems.CITRINE_BALL,
                CMItems.INCOMPLETE_CITRINE_BALL,
                CMItems.CITRINE_BALL_LID,
                CMItems.INCOMPLETE_CITRINE_BALL_LID,
                CMItems.CITRINE_BALL_BASE,
                CMItems.INCOMPLETE_CITRINE_BALL_BASE,
                CobblemonItems.YELLOW_APRICORN);

        baseBall(CobblemonItems.VERDANT_BALL,
                CMItems.INCOMPLETE_VERDANT_BALL,
                CMItems.VERDANT_BALL_LID,
                CMItems.INCOMPLETE_VERDANT_BALL_LID,
                CMItems.VERDANT_BALL_BASE,
                CMItems.INCOMPLETE_VERDANT_BALL_BASE,
                CobblemonItems.GREEN_APRICORN);

        baseBall(CobblemonItems.AZURE_BALL,
                CMItems.INCOMPLETE_AZURE_BALL,
                CMItems.AZURE_BALL_LID,
                CMItems.INCOMPLETE_AZURE_BALL_LID,
                CMItems.AZURE_BALL_BASE,
                CMItems.INCOMPLETE_AZURE_BALL_BASE,
                CobblemonItems.BLUE_APRICORN);

        baseBall(CobblemonItems.ROSEATE_BALL,
                CMItems.INCOMPLETE_ROSEATE_BALL,
                CMItems.ROSEATE_BALL_LID,
                CMItems.INCOMPLETE_ROSEATE_BALL_LID,
                CMItems.ROSEATE_BALL_BASE,
                CMItems.INCOMPLETE_ROSEATE_BALL_BASE,
                CobblemonItems.PINK_APRICORN);

        baseBall(CobblemonItems.SLATE_BALL,
                CMItems.INCOMPLETE_SLATE_BALL,
                CMItems.SLATE_BALL_LID,
                CMItems.INCOMPLETE_SLATE_BALL_LID,
                CMItems.SLATE_BALL_BASE,
                CMItems.INCOMPLETE_SLATE_BALL_BASE,
                CobblemonItems.BLACK_APRICORN);

        baseBall(CobblemonItems.PREMIER_BALL,
                CMItems.INCOMPLETE_PREMIER_BALL,
                CMItems.PREMIER_BALL_LID,
                CMItems.INCOMPLETE_PREMIER_BALL_LID,
                CMItems.PREMIER_BALL_BASE,
                CMItems.INCOMPLETE_PREMIER_BALL_BASE,
                CobblemonItems.WHITE_APRICORN);
    }

    @Override
    public @NotNull String getName() {
        return CobblemonManufactory.NAME + "'s Sequenced Assembly Recipes";
    }

    private void baseBall(ItemLike ball, ItemLike incompleteBall, ItemLike lid, ItemLike incompleteLid, ItemLike base, ItemLike incompleteBase, ItemLike apricorn) {
        String NAME = CMUtil.getItemName(ball);

        create(NAME + "_lid", b -> b
                .require(apricorn)
                .transitionTo(incompleteLid)
                .addOutput(lid, 1)
                .loops(1)
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(apricorn))
                .addStep(PressingRecipe::new, rb -> rb));

        create(NAME + "_base", b -> b
                .require(apricorn)
                .transitionTo(incompleteBase)
                .addOutput(base, 1)
                .loops(1)
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(apricorn))
                .addStep(DeployerApplicationRecipe::new, rb -> rb));

        create(NAME, b -> b
                .require(CMItems.COPPER_BALL_CORE)
                .transitionTo(incompleteBall)
                .addOutput(ball, 1)
                .loops(1)
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(base))
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(lid))
                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Items.IRON_NUGGET)));
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

//    private GeneratedRecipe baseBall(String name, ItemLike lid, ItemLike incomplete, ItemLike ball) {
//        ItemStack transitional = new ItemStack(incomplete);
//        transitional.set(DataComponents.CUSTOM_MODEL_DATA, new CustomModelData(0));
//
//        return create(name, b -> b
//                .require(lid)
//                .transitionTo(transitional.getItem())
//                .addOutput(ball, 1)
//                .loops(1)
//                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(CMItems.COPPER_BALL_CORE))
//                .addStep(DeployerApplicationRecipe::new, rb -> rb.require(Items.IRON_NUGGET)));
//    }

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
