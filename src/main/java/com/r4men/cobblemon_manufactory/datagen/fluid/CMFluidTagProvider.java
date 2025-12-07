package com.r4men.cobblemon_manufactory.datagen.fluid;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.fluid.CMFluids;
import com.r4men.cobblemon_manufactory.util.CMTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CMFluidTagProvider extends FluidTagsProvider {
    public CMFluidTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, CobblemonManufactory.ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(CMTags.Fluids.UPGRADES_TO_FULL_HEAL)
                .add(CMFluids.ANTIDOTE.get())
                .add(CMFluids.AWAKENING.get())
                .add(CMFluids.BURN_HEAL.get())
                .add(CMFluids.ICE_HEAL.get())
                .add(CMFluids.MEDICINAL_BREW.get())
                .add(CMFluids.PARALYZE_HEAL.get());
    }
}
