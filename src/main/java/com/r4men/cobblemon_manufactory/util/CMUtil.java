package com.r4men.cobblemon_manufactory.util;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;

public class CMUtil {
    public static String getItemName(ItemLike itemLike) {
        return BuiltInRegistries.ITEM.getKey(itemLike.asItem()).getPath();
    }

    public static ResourceLocation modRL(String path) {
        return ResourceLocation.fromNamespaceAndPath(CobblemonManufactory.ID, path);
    }
}
