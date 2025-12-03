package com.r4men.create_cobblemon.fluid;

import com.r4men.create_cobblemon.CreateCobblemon;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFluids {
    public static DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, CreateCobblemon.MOD_ID);

    public static final Supplier<FlowingFluid> SOURCE_ANTIDOTE_WATER = FLUIDS.register("source_antidote_water",
            () -> new BaseFlowingFluid.Source(ModFluids.ANTIDOTE_WATER_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_ANTIDOTE_WATER = FLUIDS.register("flowing_antidote_water",
            () -> new BaseFlowingFluid.Flowing(ModFluids.ANTIDOTE_WATER_PROPERTIES));

    public static final BaseFlowingFluid.Properties ANTIDOTE_WATER_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.ANTIDOTE_WATER_FLUID_TYPE, SOURCE_ANTIDOTE_WATER, FLOWING_ANTIDOTE_WATER)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(1);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
