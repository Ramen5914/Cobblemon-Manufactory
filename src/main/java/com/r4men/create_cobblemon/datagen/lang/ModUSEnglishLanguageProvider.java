package com.r4men.create_cobblemon.datagen.lang;

import com.r4men.create_cobblemon.CreateCobblemon;
import com.r4men.create_cobblemon.fluid.ModFluidTypes;
import com.r4men.create_cobblemon.fluid.ModFluids;
import com.r4men.create_cobblemon.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.fluids.FluidType;

public class ModUSEnglishLanguageProvider extends LanguageProvider {
    public ModUSEnglishLanguageProvider(PackOutput output) {
        super(output, CreateCobblemon.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        for (Item item : ModItems.ITEMS.getEntries().stream().map(Holder::value).toList()) {
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

        for (FluidType fluid : ModFluidTypes.FLUID_TYPES.getEntries().stream().map(Holder::value).toList()) {
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
    }
}
