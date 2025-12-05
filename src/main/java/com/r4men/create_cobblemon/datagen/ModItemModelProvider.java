package com.r4men.create_cobblemon.datagen;

import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateCobblemon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (var item : ModItems.ALL_ITEMS.stream().map(DeferredHolder::get).toList()) {
            basicItem(item);
        }
    }
}
