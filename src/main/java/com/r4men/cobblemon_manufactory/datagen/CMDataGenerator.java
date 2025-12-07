package com.r4men.cobblemon_manufactory.datagen;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.datagen.block.CMBlockLootTableProvider;
import com.r4men.cobblemon_manufactory.datagen.block.CMBlockStateProvider;
import com.r4men.cobblemon_manufactory.datagen.block.CMBlockTagProvider;
import com.r4men.cobblemon_manufactory.datagen.recipe.create.CMSequencedAssemblyRecipeGen;
import com.r4men.cobblemon_manufactory.datagen.fluid.CMFluidTagProvider;
import com.r4men.cobblemon_manufactory.datagen.item.CMItemModelProvider;
import com.r4men.cobblemon_manufactory.datagen.item.CMItemTagProvider;
import com.r4men.cobblemon_manufactory.datagen.lang.CMEnUsLanguageProvider;
import com.r4men.cobblemon_manufactory.datagen.recipe.CMRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = CobblemonManufactory.ID)
public class CMDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        net.minecraft.data.DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new CMRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(),
                new LootTableProvider(packOutput, Collections.emptySet(),
                        List.of(new LootTableProvider.SubProviderEntry(CMBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));

        BlockTagsProvider blockTagsProvider = new CMBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new CMItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new CMFluidTagProvider(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeClient(), new CMItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new CMBlockStateProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeClient(), new CMEnUsLanguageProvider(packOutput));

        generator.addProvider(event.includeServer(), new CMSequencedAssemblyRecipeGen(packOutput, lookupProvider));

        if (event.includeServer()) {
            CMRecipeProvider.registerAllProcessing(generator, packOutput, lookupProvider);
        }
    }
}
