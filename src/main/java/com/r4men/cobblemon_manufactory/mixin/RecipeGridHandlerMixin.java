package com.r4men.cobblemon_manufactory.mixin;

import com.simibubi.create.content.kinetics.crafter.RecipeGridHandler;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(RecipeGridHandler.class)
public abstract class RecipeGridHandlerMixin {
    @ModifyVariable(
            method = "tryToApplyRecipe",
            at = @At(
                    value = "STORE",
                    ordinal = 1
            ),
            name = "result"
    )
    private static ItemStack blockPokeballRecipes(ItemStack result) {
        if (result != null && !result.isEmpty()) {
            ResourceLocation id = BuiltInRegistries.ITEM.getKey(result.getItem());

            if (id.getNamespace().equals("cobblemon") && id.getPath().endsWith("_ball")) {
                return null;
            }
        }
        return result;
    }
}
