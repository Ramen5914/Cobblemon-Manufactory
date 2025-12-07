package com.r4men.cobblemon_manufactory.datagen.item;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
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
    }
}
