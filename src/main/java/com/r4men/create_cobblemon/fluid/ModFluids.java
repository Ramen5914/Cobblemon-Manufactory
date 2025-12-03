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

    public static final Supplier<FlowingFluid> ANTIDOTE = createFluid("antidote", ModFluidTypes.ANTIDOTE_FLUID_TYPE);
    public static final Supplier<FlowingFluid> AWAKENING = createFluid("awakening", ModFluidTypes.AWAKENING_FLUID_TYPE);
    public static final Supplier<FlowingFluid> BURN_HEAL = createFluid("burn_heal", ModFluidTypes.BURN_HEAL_FLUID_TYPE);
    public static final Supplier<FlowingFluid> ELIXIR = createFluid("elixir", ModFluidTypes.ELIXIR_FLUID_TYPE);
    public static final Supplier<FlowingFluid> ETHER = createFluid("ether", ModFluidTypes.ETHER_FLUID_TYPE);
    public static final Supplier<FlowingFluid> FULL_HEAL = createFluid("full_heal", ModFluidTypes.FULL_HEAL_FLUID_TYPE);
    public static final Supplier<FlowingFluid> FULL_RESTORE = createFluid("full_restore", ModFluidTypes.FULL_RESTORE_FLUID_TYPE);
    public static final Supplier<FlowingFluid> HYPER_POTION = createFluid("hyper_potion", ModFluidTypes.HYPER_POTION_FLUID_TYPE);
    public static final Supplier<FlowingFluid> ICE_HEAL = createFluid("ice_heal", ModFluidTypes.ICE_HEAL_FLUID_TYPE);
    public static final Supplier<FlowingFluid> MAX_ELIXIR = createFluid("max_elixir", ModFluidTypes.MAX_ELIXIR_FLUID_TYPE);
    public static final Supplier<FlowingFluid> MAX_ETHER = createFluid("max_ether", ModFluidTypes.MAX_ETHER_FLUID_TYPE);
    public static final Supplier<FlowingFluid> MAX_POTION = createFluid("max_potion", ModFluidTypes.MAX_POTION_FLUID_TYPE);
    public static final Supplier<FlowingFluid> MEDICINAL_BREW = createFluid("medicinal_brew", ModFluidTypes.MEDICINAL_BREW_FLUID_TYPE);
    public static final Supplier<FlowingFluid> PARALYZE_HEAL = createFluid("paralyze_heal", ModFluidTypes.PARALYZE_HEAL_FLUID_TYPE);
    public static final Supplier<FlowingFluid> POTION = createFluid("potion", ModFluidTypes.POTION_FLUID_TYPE);
    public static final Supplier<FlowingFluid> SUPER_POTION = createFluid("super_potion", ModFluidTypes.SUPER_POTION_FLUID_TYPE);

    private static Supplier<FlowingFluid> createFluid(String name, Supplier<? extends net.neoforged.neoforge.fluids.FluidType> fluidType) {
        BaseFlowingFluid.Properties[] propertiesHolder = new BaseFlowingFluid.Properties[1];

        Supplier<FlowingFluid> source = FLUIDS.register("source_" + name,
                () -> new BaseFlowingFluid.Source(propertiesHolder[0]));
        Supplier<FlowingFluid> flowing = FLUIDS.register("flowing_" + name,
                () -> new BaseFlowingFluid.Flowing(propertiesHolder[0]));

        propertiesHolder[0] = new BaseFlowingFluid.Properties(fluidType, source, flowing);

        return source;
    }

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
