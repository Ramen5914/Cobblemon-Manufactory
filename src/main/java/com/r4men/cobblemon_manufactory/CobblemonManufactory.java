package com.r4men.cobblemon_manufactory;

import com.mojang.logging.LogUtils;
import com.r4men.cobblemon_manufactory.block.CMBlocks;
import com.r4men.cobblemon_manufactory.crafting.CMRecipes;
import com.r4men.cobblemon_manufactory.fluid.BaseFluidType;
import com.r4men.cobblemon_manufactory.fluid.CMFluidTypes;
import com.r4men.cobblemon_manufactory.fluid.CMFluids;
import com.r4men.cobblemon_manufactory.item.CMItems;
import net.minecraft.core.Holder;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(CobblemonManufactory.ID)
public class CobblemonManufactory {
    public static final String ID = "cobblemon_manufactory";
    public static final String NAME = "Cobblemon Manufactory";

    public static final Logger LOGGER = LogUtils.getLogger();

    public CobblemonManufactory(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        CMItems.register(modEventBus);
        CMBlocks.register(modEventBus);
        CMFluids.register(modEventBus);
        CMFluidTypes.register(modEventBus);

        CMRecipes.register(modEventBus);

        CMTabs.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.SERVER, CMConfig.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("{} initializing!", NAME);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = CobblemonManufactory.ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

        @SubscribeEvent
        public static void onClientExtensions(RegisterClientExtensionsEvent event) {
            for (var fluid : CMFluidTypes.FLUID_TYPES.getEntries().stream().map(Holder::value).toList()) {
                event.registerFluidType(((BaseFluidType) fluid).getClientFluidTypeExtensions(), fluid);
            }
        }
    }
}
