package com.r4men.cobblemon_manufactory.datagen.lang;

import com.r4men.cobblemon_manufactory.CMConfig;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.fluid.CMFluidTypes;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.r4men.cobblemon_manufactory.util.CMTags;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.fluids.FluidType;

public class CMEnUsLanguageProvider extends LanguageProvider {
    public CMEnUsLanguageProvider(PackOutput output) {
        super(output, CobblemonManufactory.ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Items
        for (var item : CMItems.ITEMS.getEntries().stream().map(Holder::value).toList()) {
            String itemName = item.toString().split(":")[1];
            String[] words = itemName.split("_");
            StringBuilder capitalizedName = new StringBuilder();

            for (String word : words) {
                if (!word.isEmpty()) {
                    capitalizedName.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1))
                            .append(" ");
                }
            }

            String finalName = capitalizedName.toString().trim();
            add(item, finalName);
        }

        // Fluids
        for (FluidType fluid : CMFluidTypes.FLUID_TYPES.getEntries().stream().map(Holder::value).toList()) {
            String fluidName = fluid.toString().split(":")[1];
            String[] words = fluidName.split("_");

            StringBuilder capitalizedName = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty() && !word.equals("fluid") && !word.equals("type")) {
                    capitalizedName.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1))
                            .append(" ");
                }
            }
            String finalName = capitalizedName.toString().trim();

            add(fluid.getDescriptionId(), finalName);
        }

        // Creative Mode Tabs
        add("itemGroup.cobblemon_manufactory.cm_tab", "Cobblemon Manufactory");

        // Tags
        // # Item Tags
        addTag(() -> CMTags.Items.ANCIENT_BALL_LIDS, "Ancient Ball Lids");
        addTag(() -> CMTags.Items.DYEABLE_ANCIENT_BALLS, "Dyeable Ancient Balls");
        addTag(() -> CMTags.Items.DYEABLE_POKE_BALLS, "Dyeable Poké Balls");
        addTag(() -> CMTags.Items.POKE_BALL_LIDS, "Poké Ball Lids");
        addTag(() -> CMTags.Items.UPGRADES_SUPER_POTION, "Upgrades Super Potion");
        addTag(() -> CMTags.Items.BLACK_TUMBLESTONE_BUDS, "Black Tumblestone Buds");
        addTag(() -> CMTags.Items.SKY_TUMBLESTONE_BUDS, "Sky Tumblestone Buds");
        addTag(() -> CMTags.Items.TUMBLESTONE_BUDS,"Tumblestone Buds");
        addTag(() -> CMTags.Items.NO_MECHANICAL_CRAFTING, "No Mechanical Crafting");
        // # Fluid Tags
        addTag(() -> CMTags.Fluids.UPGRADES_TO_FULL_HEAL, "Upgrades to Full Heal");

        addConfiguration(CMConfig.REMOVE_MECHANICAL_CRAFTER_RECIPES, "Remove Mechanical Crafter Recipes");
    }

    private void addConfiguration(ModConfigSpec.ConfigValue<?> configValue, String name) {
        add(CobblemonManufactory.ID + ".configuration." + configValue.getPath().getFirst(), name);
    }
}
