package com.r4men.create_cobblemon;

import com.mojang.logging.LogUtils;
import com.r4men.create_cobblemon.block.ModBlocks;
import com.r4men.create_cobblemon.fluid.BaseFluidType;
import com.r4men.create_cobblemon.fluid.ModFluidTypes;
import com.r4men.create_cobblemon.fluid.ModFluids;
import com.r4men.create_cobblemon.item.ModItems;
import net.minecraft.core.Holder;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(CreateCobblemon.MOD_ID)
public class CreateCobblemon {
    public static final String MOD_ID = "create_cobblemon";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateCobblemon(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        ModCreativeModeTabs.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = CreateCobblemon.MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

        @SubscribeEvent
        public static void onClientExtensions(RegisterClientExtensionsEvent event) {
            for (var fluid : ModFluidTypes.FLUID_TYPES.getEntries().stream().map(Holder::value).toList()) {
                event.registerFluidType(((BaseFluidType) fluid).getClientFluidTypeExtensions(), fluid);
            }
        }
    }
}
