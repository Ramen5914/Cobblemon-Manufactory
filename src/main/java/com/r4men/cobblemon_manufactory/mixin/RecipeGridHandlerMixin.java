package com.r4men.cobblemon_manufactory.mixin;

import com.r4men.cobblemon_manufactory.CMConfig;
import com.r4men.cobblemon_manufactory.util.CMTags;
import com.simibubi.create.content.kinetics.crafter.RecipeGridHandler;
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
        if (CMConfig.REMOVE_MECHANICAL_CRAFTER_RECIPES.get()) {
            if (result != null && !result.isEmpty()) {
                if (result.is(CMTags.Items.NO_MECHANICAL_CRAFTING)) {
                    return null;
                }
            }
        }
        return result;
    }
}
