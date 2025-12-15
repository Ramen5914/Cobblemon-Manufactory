package com.r4men.cobblemon_manufactory.datagen.lang;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.fluid.CMFluidTypes;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.r4men.cobblemon_manufactory.util.CMTags;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.fluids.FluidType;

public class CMEnUsLanguageProvider extends LanguageProvider {
    public CMEnUsLanguageProvider(PackOutput output) {
        super(output, CobblemonManufactory.ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        for (Item item : CMItems.ITEMS.getEntries().stream().map(Holder::value).toList()) {
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

        add("itemGroup.cobblemon_manufactory.cm_tab", "Cobblemon Manufactory");

        addTag(() -> CMTags.Items.NO_MECHANICAL_CRAFTING, "No Mechanical Crafting");
    }
}
