package com.r4men.cobblemon_manufactory;

import com.r4men.cobblemon_manufactory.block.CMBlocks;
import com.r4men.cobblemon_manufactory.item.CMItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CMTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, CobblemonManufactory.ID);

    public static final Supplier<CreativeModeTab> COBBLEMON_MANUFACTORY_TAB = CREATIVE_MODE_TABS.register(
            "cm_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cobblemon_manufactory.cm_tab"))
                    .icon(() -> new ItemStack(CMItems.POKE_BALL_LID.get()))
                    .displayItems((params, output) -> {
                        output.accept(CMItems.ANCIENT_SLATE_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_AZURE_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_FEATHER_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_GIGATON_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_GREAT_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_VERDANT_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_HEAVY_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_JET_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_LEADEN_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_ROSEATE_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_POKE_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_ULTRA_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_IVORY_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_WING_BALL_LID.get());
                        output.accept(CMItems.ANCIENT_CITRINE_BALL_LID.get());
                        output.accept(CMItems.BEAST_BALL_LID.get());
                        output.accept(CMItems.SLATE_BALL_LID.get());
                        output.accept(CMItems.AZURE_BALL_LID.get());
                        output.accept(CMItems.DIVE_BALL_LID.get());
                        output.accept(CMItems.DREAM_BALL_LID.get());
                        output.accept(CMItems.DUSK_BALL_LID.get());
                        output.accept(CMItems.FAST_BALL_LID.get());
                        output.accept(CMItems.FRIEND_BALL_LID.get());
                        output.accept(CMItems.GREAT_BALL_LID.get());
                        output.accept(CMItems.VERDANT_BALL_LID.get());
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
                        output.accept(CMItems.ROSEATE_BALL_LID.get());
                        output.accept(CMItems.QUICK_BALL_LID.get());
                        output.accept(CMItems.POKE_BALL_LID.get());
                        output.accept(CMItems.REPEAT_BALL_LID.get());
                        output.accept(CMItems.SAFARI_BALL_LID.get());
                        output.accept(CMItems.SPORT_BALL_LID.get());
                        output.accept(CMItems.TIMER_BALL_LID.get());
                        output.accept(CMItems.ULTRA_BALL_LID.get());
                        output.accept(CMItems.PREMIER_BALL_LID.get());
                        output.accept(CMItems.CITRINE_BALL_LID.get());

                        output.accept(CMItems.ANCIENT_SLATE_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_AZURE_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_FEATHER_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_GIGATON_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_GREAT_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_VERDANT_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_HEAVY_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_JET_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_LEADEN_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_ROSEATE_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_POKE_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_ULTRA_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_IVORY_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_WING_BALL_BASE.get());
                        output.accept(CMItems.ANCIENT_CITRINE_BALL_BASE.get());
                        output.accept(CMItems.BEAST_BALL_BASE.get());
                        output.accept(CMItems.SLATE_BALL_BASE.get());
                        output.accept(CMItems.AZURE_BALL_BASE.get());
                        output.accept(CMItems.DIVE_BALL_BASE.get());
                        output.accept(CMItems.DREAM_BALL_BASE.get());
                        output.accept(CMItems.DUSK_BALL_BASE.get());
                        output.accept(CMItems.FAST_BALL_BASE.get());
                        output.accept(CMItems.FRIEND_BALL_BASE.get());
                        output.accept(CMItems.GREAT_BALL_BASE.get());
                        output.accept(CMItems.VERDANT_BALL_BASE.get());
                        output.accept(CMItems.HEAL_BALL_BASE.get());
                        output.accept(CMItems.HEAVY_BALL_BASE.get());
                        output.accept(CMItems.LEVEL_BALL_BASE.get());
                        output.accept(CMItems.LOVE_BALL_BASE.get());
                        output.accept(CMItems.LURE_BALL_BASE.get());
                        output.accept(CMItems.LUXURY_BALL_BASE.get());
                        output.accept(CMItems.MASTER_BALL_BASE.get());
                        output.accept(CMItems.MOON_BALL_BASE.get());
                        output.accept(CMItems.NEST_BALL_BASE.get());
                        output.accept(CMItems.NET_BALL_BASE.get());
                        output.accept(CMItems.PARK_BALL_BASE.get());
                        output.accept(CMItems.ROSEATE_BALL_BASE.get());
                        output.accept(CMItems.QUICK_BALL_BASE.get());
                        output.accept(CMItems.POKE_BALL_BASE.get());
                        output.accept(CMItems.REPEAT_BALL_BASE.get());
                        output.accept(CMItems.SAFARI_BALL_BASE.get());
                        output.accept(CMItems.SPORT_BALL_BASE.get());
                        output.accept(CMItems.TIMER_BALL_BASE.get());
                        output.accept(CMItems.ULTRA_BALL_BASE.get());
                        output.accept(CMItems.PREMIER_BALL_BASE.get());
                        output.accept(CMItems.CITRINE_BALL_BASE.get());

                        output.accept(CMItems.CRUSHED_EXP_QUARTZ.get());
                        output.accept(CMItems.EXP_QUARTZ.get());
                        output.accept(CMItems.IRON_BALL_CORE.get());

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
