package com.r4men.cobblemon_manufactory.util;

import com.r4men.cobblemon_manufactory.component.CMDataComponentTypes;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.simibubi.create.AllDataComponents;
import net.minecraft.client.renderer.item.ItemProperties;

public class CMItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(CMItems.INCOMPLETE_POKE_BALL.get(), CMDataComponentTypes.STEP.getId(),
                (stack, level, entity, seed) -> {
                    var sequencedAssembly = stack.get(AllDataComponents.SEQUENCED_ASSEMBLY);
                    return sequencedAssembly != null ? ((float) sequencedAssembly.step()) : 0f;
                });
    }
}
