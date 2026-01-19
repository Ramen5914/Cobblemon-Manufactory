package com.r4men.cobblemon_manufactory;

import com.r4men.cobblemon_manufactory.block.CMBlocks;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.r4men.cobblemon_manufactory.util.CMTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CMTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, CobblemonManufactory.ID);

    public static final Supplier<CreativeModeTab> COBBLEMON_MANUFACTORY_TAB = CREATIVE_MODE_TABS.register(
            "cm_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cobblemon_manufactory.cm_tab"))
                    .displayItems((params, output) -> {
                        output.accept(CMItems.ANCIENT_BLACK_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_BLUE_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_FEATHER_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_GIGATON_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_GREAT_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_GREEN_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_HEAVY_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_JET_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_LEADEN_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_PINK_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_RED_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_ULTRA_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_WHITE_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_WING_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_YELLOW_BALL_LID.get());
                        output.accept(CMItems.BEAST_BALL_LID.get());
                        output.accept(CMItems.BLACK_BALL_LID.get());
                        output.accept(CMItems.BLACK_TUMBLESTONE_LID.get());
                        output.accept(CMItems.BLUE_BALL_LID.get());
                        output.accept(CMItems.DIVE_BALL_LID.get());
                        output.accept(CMItems.DREAM_BALL_LID.get());
                        output.accept(CMItems.DUSK_BALL_LID.get());
                        output.accept(CMItems.FAST_BALL_LID.get());
                        output.accept(CMItems.FRIEND_BALL_LID.get());
                        output.accept(CMItems.GREAT_BALL_LID.get());
                        output.accept(CMItems.GREEN_BALL_LID.get());
                        output.accept(CMItems.HEAL_BALL_LID.get());
                        output.accept(CMItems.HEAVY_BALL_LID.get());
                        output.accept(CMItems.LEVEL_BALL_LID.get());
                        output.accept(CMItems.LOVE_BALL_LID.get());
                        output.accept(CMItems.LURE_BALL_LID.get());
                        output.accept(CMItems.LUXURY_BALL_LID.get());
                        output.accept(CMItems.MASTER_BALL_LID.get());
                        output.accept(CMItems.MOON_BALL_LID.get());
                        output.accept(CMItems.NEST_BALL_LID.get());
                        output.accept(CMItems.NET_BALL_LID.get());
                        output.accept(CMItems.PARK_BALL_LID.get());
                        output.accept(CMItems.PINK_BALL_LID.get());
                        output.accept(CMItems.QUICK_BALL_LID.get());
                        output.accept(CMItems.RED_BALL_LID.get());
                        output.accept(CMItems.REPEAT_BALL_LID.get());
                        output.accept(CMItems.SAFARI_BALL_LID.get());
                        output.accept(CMItems.SKY_TUMBLESTONE_LID.get());
                        output.accept(CMItems.SPORT_BALL_LID.get());
                        output.accept(CMItems.TIMER_BALL_LID.get());
                        output.accept(CMItems.TUMBLESTONE_LID.get());
                        output.accept(CMItems.ULTRA_BALL_LID.get());
                        output.accept(CMItems.WHITE_BALL_LID.get());
                        output.accept(CMItems.YELLOW_BALL_LID.get());

                        output.accept(CMItems.CRUSHED_EXP_QUARTZ.get());
                        output.accept(CMItems.EXP_QUARTZ.get());
                        output.accept(CMItems.IRON_BALL_BASE.get());

                        output.accept(CMBlocks.EXP_QUARTZ_BLOCK.get());
                        output.accept(CMBlocks.EXP_QUARTZ_TILES.get());
                        output.accept(CMBlocks.SMALL_EXP_QUARTZ_TILES.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
