package com.r4men.cobblemon_manufactory.util;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class CMTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(CMUtil.modRL(name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ANCIENT_BALL_LIDS = createTag("ancient_ball_lids");
        public static final TagKey<Item> DYEABLE_ANCIENT_BALLS = createTag("dyeable_ancient_balls");
        public static final TagKey<Item> DYEABLE_POKE_BALLS = createTag("dyeable_poke_balls");
        public static final TagKey<Item> POKE_BALL_LIDS = createTag("poke_ball_lids");
        public static final TagKey<Item> UPGRADES_SUPER_POTION = createTag("upgrades_super_potion");

        public static final TagKey<Item> BLACK_TUMBLESTONE_BUDS = createTag("black_tumblestone_buds");
        public static final TagKey<Item> SKY_TUMBLESTONE_BUDS = createTag("sky_tumblestone_buds");
        public static final TagKey<Item> TUMBLESTONE_BUDS = createTag("tumblestone_buds");

        public static final TagKey<Item> NO_MECHANICAL_CRAFTING = createTag("no_mechanical_crafting");

        public static final TagKey<Item> BALL_BASES = createTag("ball_bases");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(CMUtil.modRL(name));
        }
    }

    public static class Fluids {
        public static final TagKey<Fluid> UPGRADES_TO_FULL_HEAL = createTag("upgrades_to_full_heal");

        private static TagKey<Fluid> createTag(String name) {
            return FluidTags.create(CMUtil.modRL(name));
        }
    }
}
