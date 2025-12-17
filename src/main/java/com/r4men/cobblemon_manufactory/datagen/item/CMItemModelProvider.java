package com.r4men.cobblemon_manufactory.datagen.item;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.component.CMDataComponentTypes;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.r4men.cobblemon_manufactory.util.CMUtil;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

public class CMItemModelProvider extends ItemModelProvider {
    public CMItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CobblemonManufactory.ID, existingFileHelper);
    }

    @Override
    public @NotNull String getName() {
        return CobblemonManufactory.NAME + "'s Item Models";
    }

    @Override
    protected void registerModels() {
        for (var item : CMItems.ALL_ITEMS.stream().map(DeferredHolder::get).toList()) {
            basicItem(item);
        }

        steppedItem(CMItems.INCOMPLETE_ANCIENT_AZURE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_CITRINE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_FEATHER_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_GIGATON_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_GREAT_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_HEAVY_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_IVORY_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_JET_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_LEADEN_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_POKE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_ROSEATE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_SLATE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_ULTRA_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_VERDANT_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ANCIENT_WING_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_AZURE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_BEAST_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_CHERISH_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_CITRINE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_DIVE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_DREAM_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_DUSK_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_FAST_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_FRIEND_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_GREAT_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_HEAL_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_HEAVY_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_LEVEL_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_LOVE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_LURE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_LUXURY_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_MASTER_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_MOON_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_NEST_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_NET_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_PARK_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_POKE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_PREMIER_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_QUICK_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_REPEAT_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ROSEATE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_SAFARI_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_SLATE_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_SPORT_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_TIMER_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_ULTRA_BALL, 2);
        steppedItem(CMItems.INCOMPLETE_VERDANT_BALL, 2);

        steppedItem(CMItems.INCOMPLETE_MASTER_BALL_LID, 2);
    }

    private void steppedItem(ItemLike item, int steps) {
        String name = CMUtil.getItemName(item);

        for (int i = 0; i < (steps - 1); i++) {
            basicItem(CMUtil.modRL(name + "_" + (i + 1)));
        }

        ItemModelBuilder model = basicItem(item.asItem());
        for (int i = 0; i < (steps - 1); i++) {
            model.override()
                    .predicate(CMDataComponentTypes.STEP.getId(), (float) (i + 1))
                    .model(new ModelFile.ExistingModelFile(modLoc("item/" + name + "_" + (i + 1)), existingFileHelper))
                    .end();
        }
    }
}
