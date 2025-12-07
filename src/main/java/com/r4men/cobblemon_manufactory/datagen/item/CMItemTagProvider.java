package com.r4men.cobblemon_manufactory.datagen.item;

import com.cobblemon.mod.common.CobblemonBlocks;
import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.r4men.cobblemon_manufactory.util.CMTags;
import com.simibubi.create.AllTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CMItemTagProvider extends ItemTagsProvider {
    public CMItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, CobblemonManufactory.ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(CMTags.Items.ANCIENT_BALL_LIDS)
                .add(CMItems.ANCIENT_BLUE_BALL_LID.get())
                .add(CMItems.ANCIENT_YELLOW_BALL_LID.get())
                .add(CMItems.ANCIENT_WHITE_BALL_LID.get())
                .add(CMItems.ANCIENT_RED_BALL_LID.get())
                .add(CMItems.ANCIENT_PINK_BALL_LID.get())
                .add(CMItems.ANCIENT_BLACK_BALL_LID.get())
                .add(CMItems.ANCIENT_GREEN_BALL_LID.get())
                .add(CMItems.TUMBLESTONE_LID.get());

        tag(CMTags.Items.DYEABLE_ANCIENT_BALLS)
                .add(CobblemonItems.ANCIENT_AZURE_BALL)
                .add(CobblemonItems.ANCIENT_CITRINE_BALL)
                .add(CobblemonItems.ANCIENT_IVORY_BALL)
                .add(CobblemonItems.ANCIENT_POKE_BALL)
                .add(CobblemonItems.ANCIENT_ROSEATE_BALL)
                .add(CobblemonItems.ANCIENT_SLATE_BALL)
                .add(CobblemonItems.ANCIENT_VERDANT_BALL);

        tag(CMTags.Items.DYEABLE_POKE_BALLS)
                .add(CobblemonItems.AZURE_BALL)
                .add(CobblemonItems.CITRINE_BALL)
                .add(CobblemonItems.POKE_BALL)
                .add(CobblemonItems.PREMIER_BALL)
                .add(CobblemonItems.ROSEATE_BALL)
                .add(CobblemonItems.SLATE_BALL)
                .add(CobblemonItems.VERDANT_BALL);

        tag(CMTags.Items.POKE_BALL_LIDS)
                .add(CMItems.BLACK_BALL_LID.get())
                .add(CMItems.BLUE_BALL_LID.get())
                .add(CMItems.GREEN_BALL_LID.get())
                .add(CMItems.PINK_BALL_LID.get())
                .add(CMItems.RED_BALL_LID.get())
                .add(CMItems.WHITE_BALL_LID.get())
                .add(CMItems.YELLOW_BALL_LID.get());

        tag(CMTags.Items.UPGRADES_SUPER_POTION)
                .add(CobblemonItems.AGUAV_BERRY)
                .add(CobblemonItems.FIGY_BERRY)
                .add(CobblemonItems.IAPAPA_BERRY)
                .add(CobblemonItems.MAGO_BERRY)
                .add(CobblemonItems.WIKI_BERRY);

        tag(AllTags.AllItemTags.UPRIGHT_ON_BELT.tag)
                .add(CobblemonItems.ANTIDOTE)
                .add(CobblemonItems.AWAKENING)
                .add(CobblemonItems.BURN_HEAL)
                .add(CobblemonItems.ELIXIR)
                .add(CobblemonItems.ETHER)
                .add(CobblemonItems.FULL_HEAL)
                .add(CobblemonItems.FULL_RESTORE)
                .add(CobblemonItems.HYPER_POTION)
                .add(CobblemonItems.ICE_HEAL)
                .add(CobblemonItems.MAX_ELIXIR)
                .add(CobblemonItems.MAX_ETHER)
                .add(CobblemonItems.MAX_POTION)
                .add(CobblemonItems.MEDICINAL_BREW)
                .add(CobblemonItems.PARALYZE_HEAL)
                .add(CobblemonItems.POTION)
                .add(CobblemonItems.SUPER_POTION);

        tag(CMTags.Items.BLACK_TUMBLESTONE_BUDS)
                .add(CobblemonBlocks.SMALL_BUDDING_BLACK_TUMBLESTONE.asItem())
                .add(CobblemonBlocks.MEDIUM_BUDDING_BLACK_TUMBLESTONE.asItem())
                .add(CobblemonBlocks.LARGE_BUDDING_BLACK_TUMBLESTONE.asItem());

        tag(CMTags.Items.SKY_TUMBLESTONE_BUDS)
                .add(CobblemonBlocks.SMALL_BUDDING_SKY_TUMBLESTONE.asItem())
                .add(CobblemonBlocks.MEDIUM_BUDDING_SKY_TUMBLESTONE.asItem())
                .add(CobblemonBlocks.LARGE_BUDDING_SKY_TUMBLESTONE.asItem());

        tag(CMTags.Items.TUMBLESTONE_BUDS)
                .add(CobblemonBlocks.SMALL_BUDDING_TUMBLESTONE.asItem())
                .add(CobblemonBlocks.MEDIUM_BUDDING_TUMBLESTONE.asItem())
                .add(CobblemonBlocks.LARGE_BUDDING_TUMBLESTONE.asItem());
    }
}
