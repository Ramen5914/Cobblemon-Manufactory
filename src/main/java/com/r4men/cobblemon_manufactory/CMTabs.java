package com.r4men.cobblemon_manufactory;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
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
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
