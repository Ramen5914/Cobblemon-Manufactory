package com.r4men.cobblemon_manufactory.mixin;

import com.r4men.cobblemon_manufactory.util.CMTags;
import com.simibubi.create.compat.jei.CreateJEI;
import net.minecraft.client.Minecraft;
import net.minecraft.core.RegistryAccess;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.function.Predicate;

@Mixin(CreateJEI.class)
public class CreateJEIMixin {
    @ModifyArg(
            method = "loadCategories",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/simibubi/create/compat/jei/category/CreateRecipeCategory$Builder;addTypedRecipesIf(Ljava/util/function/Supplier;Ljava/util/function/Predicate;)Lcom/simibubi/create/compat/jei/category/CreateRecipeCategory$Builder;",
                    ordinal = 0
            ),
            index = 1
    )
    private Predicate<RecipeHolder<?>> filterPokeballRecipes(Predicate<RecipeHolder<?>> original) {
        return recipe -> {
            if (!original.test(recipe)) {
                return false;
            }

            if (Minecraft.getInstance().level == null) {
                return true;
            }
            RegistryAccess registryAccess = Minecraft.getInstance().level.registryAccess();
            ItemStack result = recipe.value().getResultItem(registryAccess);

            if (!result.isEmpty()) {
                return !result.is(CMTags.Items.NO_MECHANICAL_CRAFTING);
            }

            return true;
        };
    }
}
