package com.r4men.cobblemon_manufactory.datagen.loot;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class CMLootTableProvider extends LootTableProvider {
    public CMLootTableProvider(PackOutput output, Set<ResourceKey<LootTable>> requiredTables, List<SubProviderEntry> subProviders, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, requiredTables, subProviders, registries);
    }

    @Override
    public @NotNull String getName() {
        return CobblemonManufactory.NAME + "'s Loot Tables";
    }
}
