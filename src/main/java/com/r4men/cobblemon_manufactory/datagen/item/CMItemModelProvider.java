package com.r4men.cobblemon_manufactory.datagen.item;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.component.CMDataComponentTypes;
import com.r4men.cobblemon_manufactory.item.CMItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

public class CMItemModelProvider extends ItemModelProvider {
    public CMItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CobblemonManufactory.ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (var item : CMItems.ALL_ITEMS.stream().map(DeferredHolder::get).toList()) {
            basicItem(item);
        }

        basicItem(CMItems.INCOMPLETE_POKE_BALL.get())
                .override()
                .predicate(CMDataComponentTypes.STEP.getId(), 1f)
                .model(new ModelFile.UncheckedModelFile(modLoc("item/incomplete_poke_ball_1")))
                .end();

        basicItem(ResourceLocation.fromNamespaceAndPath(CobblemonManufactory.ID, "incomplete_poke_ball_1"));
    }
}
