package com.r4men.cobblemon_manufactory.fluid;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

import java.util.function.Supplier;

public class CMFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = ResourceLocation.parse("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = ResourceLocation.parse("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = ResourceLocation.parse("block/water_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, CobblemonManufactory.ID);

    public static final Supplier<FluidType> ANTIDOTE_FLUID_TYPE = registerSimpleFluidType("antidote", 0xFFFA8D);
    public static final Supplier<FluidType> AWAKENING_FLUID_TYPE = registerSimpleFluidType("awakening", 0x92FAFF);
    public static final Supplier<FluidType> BURN_HEAL_FLUID_TYPE = registerSimpleFluidType("burn_heal", 0x97FFB8);
    public static final Supplier<FluidType> ELIXIR_FLUID_TYPE = registerSimpleFluidType("elixir", 0xF1B097);
    public static final Supplier<FluidType> ETHER_FLUID_TYPE = registerSimpleFluidType("ether", 0xD8A8E0);
    public static final Supplier<FluidType> FULL_HEAL_FLUID_TYPE = registerSimpleFluidType("full_heal", 0xF7EF3F);
    public static final Supplier<FluidType> FULL_RESTORE_FLUID_TYPE = registerSimpleFluidType("full_restore", 0x9BD77F);
    public static final Supplier<FluidType> HYPER_POTION_FLUID_TYPE = registerSimpleFluidType("hyper_potion", 0xF59BDD);
    public static final Supplier<FluidType> ICE_HEAL_FLUID_TYPE = registerSimpleFluidType("ice_heal", 0xFFD0CC);
    public static final Supplier<FluidType> MAX_ELIXIR_FLUID_TYPE = registerSimpleFluidType("max_elixir", 0x97F1E4);
    public static final Supplier<FluidType> MAX_ETHER_FLUID_TYPE = registerSimpleFluidType("max_ether", 0xB9F197);
    public static final Supplier<FluidType> MAX_POTION_FLUID_TYPE = registerSimpleFluidType("max_potion", 0x869EEE);
    public static final Supplier<FluidType> MEDICINAL_BREW_FLUID_TYPE = registerSimpleFluidType("medicinal_brew", 0x2EBCA2);
    public static final Supplier<FluidType> PARALYZE_HEAL_FLUID_TYPE = registerSimpleFluidType("paralyze_heal", 0xEDFF7A);
    public static final Supplier<FluidType> POTION_FLUID_TYPE = registerSimpleFluidType("potion", 0xAB90CE);
    public static final Supplier<FluidType> SUPER_POTION_FLUID_TYPE = registerSimpleFluidType("super_potion", 0xE1978D);

    private static Supplier<FluidType> registerSimpleFluidType(String name, int color) {
        float red = ((color >> 16) & 0xFF) / 255f;
        float green = ((color >> 8) & 0xFF) / 255f;
        float blue = (color & 0xFF) / 255f;

        return FLUID_TYPES.register(name + "_fluid_type",
                () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1000000 + color,
                        new Vector3f(red, green, blue),
                        FluidType.Properties.create()));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
