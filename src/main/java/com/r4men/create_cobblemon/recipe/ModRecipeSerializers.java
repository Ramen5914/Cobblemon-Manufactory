package com.r4men.create_cobblemon.recipe;

import com.r4men.create_cobblemon.CreateCobblemon;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, CreateCobblemon.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, DamagingShapelessRecipe.Serializer> DAMAGING_SHAPELESS = RECIPE_SERIALIZERS.register("damaging_shapeless", DamagingShapelessRecipe.Serializer::new);

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
    }
}
