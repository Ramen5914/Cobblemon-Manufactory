package com.r4men.cobblemon_manufactory.datagen.recipe.create;

import com.cobblemon.mod.common.CobblemonBlocks;
import com.cobblemon.mod.common.CobblemonItems;
import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import com.r4men.cobblemon_manufactory.util.CMTags;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class CMCrushingRecipeGen extends CrushingRecipeGen {
    GeneratedRecipe ASSAULT_VEST_RECYCLING = create(
            "assault_vest_recycling", b -> b
                    .require(CobblemonItems.ASSAULT_VEST)
                    .duration(150)
                    .output(Items.COPPER_INGOT, 2)
                    .output(AllItems.COPPER_NUGGET, 6)
                    .output(Items.STRING, 3)
                    .output(Items.LEATHER, 1)
                    .output(Items.GRANITE, 3));

    GeneratedRecipe BLACK_TUMBLESTONE_BLOCK = createTumblestoneBlock(
            "black_tumblestone_block",
            CobblemonBlocks.BLACK_TUMBLESTONE_BLOCK,
            CobblemonItems.BLACK_TUMBLESTONE);

    GeneratedRecipe BLACK_TUMBLESTONE_CLUSTER = createTumblestoneCluster(
            "black_tumblestone_cluster",
            CobblemonBlocks.BLACK_TUMBLESTONE_CLUSTER,
            CobblemonItems.BLACK_TUMBLESTONE);

    GeneratedRecipe SKY_TUMBLESTONE_BLOCK = createTumblestoneBlock(
            "sky_tumblestone_block",
            CobblemonBlocks.SKY_TUMBLESTONE_BLOCK,
            CobblemonItems.SKY_TUMBLESTONE);

    GeneratedRecipe SKY_TUMBLESTONE_CLUSTER = createTumblestoneCluster(
            "sky_tumblestone_cluster",
            CobblemonBlocks.SKY_TUMBLESTONE_CLUSTER,
            CobblemonItems.SKY_TUMBLESTONE);

    GeneratedRecipe TUMBLESTONE_BLOCK = createTumblestoneBlock(
            "tumblestone_block",
            CobblemonBlocks.TUMBLESTONE_BLOCK,
            CobblemonItems.TUMBLESTONE);

    GeneratedRecipe TUMBLESTONE_CLUSTER = createTumblestoneCluster(
            "tumblestone_cluster",
            CobblemonBlocks.TUMBLESTONE_CLUSTER,
            CobblemonItems.TUMBLESTONE);

    GeneratedRecipe BLACK_TUMBLESTONE_BUDS = create(
            "black_tumblestone_buds", b -> b
                    .require(CMTags.Items.BLACK_TUMBLESTONE_BUDS)
                    .duration(150)
                    .output(CobblemonItems.BLACK_TUMBLESTONE)
                    .output(.75f, CobblemonItems.BLACK_TUMBLESTONE));

    GeneratedRecipe SKY_TUMBLESTONE_BUDS = create(
            "sky_tumblestone_buds", b -> b
                    .require(CMTags.Items.SKY_TUMBLESTONE_BUDS)
                    .duration(150)
                    .output(CobblemonItems.SKY_TUMBLESTONE)
                    .output(.75f, CobblemonItems.SKY_TUMBLESTONE));

    GeneratedRecipe TUMBLESTONE_BUDS = create(
            "tumblestone_buds", b -> b
                    .require(CMTags.Items.TUMBLESTONE_BUDS)
                    .duration(150)
                    .output(CobblemonItems.TUMBLESTONE)
                    .output(.75f, CobblemonItems.TUMBLESTONE));

    GeneratedRecipe CHARCOAL_RECYCLING = create(
            "charcoal_stick_recycling", b -> b
                    .require(CobblemonItems.CHARCOAL)
                    .duration(150)
                    .output(Items.CHARCOAL)
                    .output(.5f, Items.CHARCOAL)
                    .output(.05f, CobblemonItems.FIRE_STONE));

    GeneratedRecipe DAWN_STONE_ORE = createStone(
            "dawn_stone_ore",
            CobblemonBlocks.DAWN_STONE_ORE,
            CobblemonItems.DAWN_STONE);

    GeneratedRecipe DEEPSLATE_DAWN_STONE_ORE = createDeepslateStone(
            "deepslate_dawn_stone_ore",
            CobblemonBlocks.DEEPSLATE_DAWN_STONE_ORE,
            CobblemonItems.DAWN_STONE);

    GeneratedRecipe DUSK_STONE_ORE = createStone(
            "dusk_stone_ore",
            CobblemonBlocks.DUSK_STONE_ORE,
            CobblemonItems.DUSK_STONE);

    GeneratedRecipe DEEPSLATE_DUSK_STONE_ORE = createDeepslateStone(
            "deepslate_dusk_stone_ore",
            CobblemonBlocks.DEEPSLATE_DUSK_STONE_ORE,
            CobblemonItems.DUSK_STONE);

    GeneratedRecipe FIRE_STONE_ORE = createStone(
            "fire_stone_ore",
            CobblemonBlocks.FIRE_STONE_ORE,
            CobblemonItems.FIRE_STONE);

    GeneratedRecipe DEEPSLATE_FIRE_STONE_ORE = createDeepslateStone(
            "deepslate_fire_stone_ore",
            CobblemonBlocks.DEEPSLATE_FIRE_STONE_ORE,
            CobblemonItems.FIRE_STONE);

    GeneratedRecipe NETHER_FIRE_STONE_ORE = create(
            "nether_fire_stone_ore", b -> b
                    .require(CobblemonBlocks.NETHER_FIRE_STONE_ORE)
                    .duration(350)
                    .output(CobblemonItems.FIRE_STONE)
                    .output(.75f, CobblemonItems.FIRE_STONE)
                    .output(.75f, AllItems.EXP_NUGGET)
                    .output(.125f, Blocks.NETHERRACK));

    GeneratedRecipe ICE_STONE_ORE = createStone(
            "ice_stone_ore",
            CobblemonBlocks.ICE_STONE_ORE,
            CobblemonItems.ICE_STONE);

    GeneratedRecipe DEEPSLATE_ICE_STONE_ORE = createDeepslateStone(
            "deepslate_ice_stone_ore",
            CobblemonBlocks.DEEPSLATE_ICE_STONE_ORE,
            CobblemonItems.ICE_STONE);

    GeneratedRecipe LEAF_STONE_ORE = createStone(
            "leaf_stone_ore",
            CobblemonBlocks.LEAF_STONE_ORE,
            CobblemonItems.LEAF_STONE);

    GeneratedRecipe DEEPSLATE_LEAF_STONE_ORE = createDeepslateStone(
            "deepslate_leaf_stone_ore",
            CobblemonBlocks.DEEPSLATE_LEAF_STONE_ORE,
            CobblemonItems.LEAF_STONE);

    GeneratedRecipe MOON_STONE_ORE = createStone(
            "moon_stone_ore",
            CobblemonBlocks.MOON_STONE_ORE,
            CobblemonItems.MOON_STONE);

    GeneratedRecipe DEEPSLATE_MOON_STONE_ORE = createDeepslateStone(
            "deepslate_moon_stone_ore",
            CobblemonBlocks.DEEPSLATE_MOON_STONE_ORE,
            CobblemonItems.MOON_STONE);

    GeneratedRecipe SHINY_STONE_ORE = createStone(
            "shiny_stone_ore",
            CobblemonBlocks.SHINY_STONE_ORE,
            CobblemonItems.SHINY_STONE);

    GeneratedRecipe DEEPSLATE_SHINY_STONE_ORE = createDeepslateStone(
            "deepslate_shiny_stone_ore",
            CobblemonBlocks.DEEPSLATE_SHINY_STONE_ORE,
            CobblemonItems.SHINY_STONE);

    GeneratedRecipe SUN_STONE_ORE = createStone(
            "sun_stone_ore",
            CobblemonBlocks.SUN_STONE_ORE,
            CobblemonItems.SUN_STONE);

    GeneratedRecipe DEEPSLATE_SUN_STONE_ORE = createDeepslateStone(
            "deepslate_sun_stone_ore",
            CobblemonBlocks.DEEPSLATE_SUN_STONE_ORE,
            CobblemonItems.SUN_STONE);

    GeneratedRecipe TERRACOTTA_SUN_STONE_ORE = create(
            "terracotta_sun_stone_ore", b -> b
                    .require(CobblemonBlocks.TERRACOTTA_SUN_STONE_ORE)
                    .duration(350)
                    .output(CobblemonItems.SUN_STONE)
                    .output(.75f, CobblemonItems.SUN_STONE)
                    .output(.75f, AllItems.EXP_NUGGET)
                    .output(.5f, Blocks.RED_SAND));

    GeneratedRecipe THUNDER_STONE_ORE = createStone(
            "thunder_stone_ore",
            CobblemonBlocks.THUNDER_STONE_ORE,
            CobblemonItems.THUNDER_STONE);

    GeneratedRecipe DEEPSLATE_THUNDER_STONE_ORE = createDeepslateStone(
            "deepslate_thunder_stone_ore",
            CobblemonBlocks.DEEPSLATE_THUNDER_STONE_ORE,
            CobblemonItems.THUNDER_STONE);

    GeneratedRecipe WATER_STONE_ORE = createStone(
            "water_stone_ore",
            CobblemonBlocks.WATER_STONE_ORE,
            CobblemonItems.WATER_STONE);

    GeneratedRecipe DEEPSLATE_WATER_STONE_ORE = createDeepslateStone(
            "deepslate_water_stone_ore",
            CobblemonBlocks.DEEPSLATE_WATER_STONE_ORE,
            CobblemonItems.WATER_STONE);

    GeneratedRecipe EXP_QUARTZ = create(
            "exp_quartz", b -> b
                    .require(CMItems.EXP_QUARTZ)
                    .duration(250)
                    .output(CMItems.CRUSHED_EXP_QUARTZ, 2)
                    .output(.5f, AllItems.EXP_NUGGET)
                    .output(.125f, Items.REDSTONE));

    GeneratedRecipe EXPERIENCE_CANDY_XL = create(
            "experience_candy_xl", b -> b
                    .require(CobblemonItems.EXPERIENCE_CANDY_XL)
                    .duration(300)
                    .output(CobblemonItems.EXPERIENCE_CANDY_L, 2)
                    .output(CobblemonItems.EXPERIENCE_CANDY_M, 1)
                    .output(.375f, CobblemonItems.EXPERIENCE_CANDY_M));

    GeneratedRecipe EXPERIENCE_CANDY_L = create(
            "experience_candy_l", b -> b
                    .require(CobblemonItems.EXPERIENCE_CANDY_L)
                    .duration(250)
                    .output(CobblemonItems.EXPERIENCE_CANDY_M, 2)
                    .output(CobblemonItems.EXPERIENCE_CANDY_S, 1)
                    .output(.375f, CobblemonItems.EXPERIENCE_CANDY_S));

    GeneratedRecipe EXPERIENCE_CANDY_M = create(
            "experience_candy_m", b -> b
                    .require(CobblemonItems.EXPERIENCE_CANDY_M)
                    .duration(200)
                    .output(CobblemonItems.EXPERIENCE_CANDY_S, 2)
                    .output(.375f, CobblemonItems.EXPERIENCE_CANDY_XS));

    GeneratedRecipe EXPERIENCE_CANDY_S = create(
            "experience_candy_s", b -> b
                    .require(CobblemonItems.EXPERIENCE_CANDY_S)
                    .duration(150)
                    .output(CobblemonItems.EXPERIENCE_CANDY_XS)
                    .output(.5f, CobblemonItems.EXPERIENCE_CANDY_XS)
                    .output(.25f, Items.REDSTONE));

    GeneratedRecipe EXPERIENCE_CANDY_XS = create(
            "experience_candy_xs", b -> b
                    .require(CobblemonItems.EXPERIENCE_CANDY_XS)
                    .duration(100)
                    .output(.5f, Items.REDSTONE));

    GeneratedRecipe DUBIOUS_DISC_RECYCLING = create(
            "dubious_disc_recycling", b -> b
                    .require(CobblemonItems.DUBIOUS_DISC)
                    .duration(150)
                    .output(Items.AMETHYST_SHARD)
                    .output(Items.PRISMARINE_CRYSTALS, 3));

    GeneratedRecipe ELECTIRIZER_RECYCLING = create(
            "electirizer_recycling", b -> b
                    .require(CobblemonItems.ELECTIRIZER)
                    .duration(150)
                    .output(Items.IRON_NUGGET, 5)
                    .output(Items.REDSTONE)
                    .output(Items.GLOWSTONE_DUST, 3));

    GeneratedRecipe KINGS_ROCK_RECYCLING = create(
            "kings_rock_recycling", b -> b
                    .require(CobblemonItems.KINGS_ROCK)
                    .duration(150)
                    .output(Blocks.SAND, 3)
                    .output(AllItems.CRUSHED_GOLD, 2));

    GeneratedRecipe APPLE = create(
            "apple", b -> b
                    .require(Items.APPLE)
                    .duration(20)
                    .output(CobblemonItems.LEFTOVERS));

    GeneratedRecipe LINK_CABLE_RECYCLING = create(
            "link_cable_recycling", b -> b
                    .require(CobblemonItems.LINK_CABLE)
                    .duration(150)
                    .output(Items.IRON_NUGGET, 4)
                    .output(AllItems.COPPER_NUGGET));

    GeneratedRecipe MAGMARIZER_RECYCLING = create(
            "magmarizer_recycling", b -> b
                    .require(CobblemonItems.MAGMARIZER)
                    .duration(150)
                    .output(Items.IRON_NUGGET, 8)
                    .output(Items.BLAZE_POWDER));

    GeneratedRecipe METAL_COAT_RECYCLING = create(
            "metal_coat_recycling", b -> b
                    .require(CobblemonItems.METAL_COAT)
                    .duration(150)
                    .output(Items.IRON_NUGGET, 12)
                    .output(Items.CLAY_BALL));

    GeneratedRecipe PEAT_BLOCK_RECYCLING = create(
            "peak_block_recycling", b -> b
                    .require(CobblemonItems.PEAT_BLOCK)
                    .duration(150)
                    .output(Blocks.DIRT)
                    .output(Items.CLAY_BALL, 5)
                    .output(Items.BONE_MEAL));

    GeneratedRecipe POWER_ANKLET_RECYCLING = createPowerItemRecycling(
            "power_anklet",
            CobblemonItems.POWER_ANKLET,
            CobblemonItems.GREEN_MINT_SEEDS);

    GeneratedRecipe POWER_BAND_RECYCLING = createPowerItemRecycling(
            "power_band",
            CobblemonItems.POWER_BAND,
            CobblemonItems.PINK_MINT_SEEDS);

    GeneratedRecipe POWER_BELT_RECYCLING = createPowerItemRecycling(
            "power_belt",
            CobblemonItems.POWER_BELT,
            CobblemonItems.BLUE_MINT_SEEDS);

    GeneratedRecipe POWER_BRACER_RECYCLING = createPowerItemRecycling(
            "power_bracer",
            CobblemonItems.POWER_BRACER,
            CobblemonItems.RED_MINT_SEEDS);

    GeneratedRecipe POWER_LENS_RECYCLING = createPowerItemRecycling(
            "power_lens",
            CobblemonItems.POWER_LENS,
            CobblemonItems.CYAN_MINT_SEEDS);

    GeneratedRecipe POWER_WEIGHT_RECYCLING = createPowerItemRecycling(
            "power_weight",
            CobblemonItems.POWER_WEIGHT,
            CobblemonItems.WHITE_MINT_SEEDS);

    GeneratedRecipe PROTECTOR_RECYCLING = create(
            "protector_recycling", b -> b
                    .require(CobblemonItems.PROTECTOR)
                    .duration(150)
                    .output(Items.COPPER_INGOT)
                    .output(AllItems.COPPER_NUGGET, 5)
                    .output(Blocks.GRANITE, 2));

    GeneratedRecipe REAPER_CLOTH_RECYCLING = create(
            "reaper_cloth_recycling", b -> b
                    .require(CobblemonItems.REAPER_CLOTH)
                    .duration(150)
                    .output(Items.PHANTOM_MEMBRANE)
                    .output(Blocks.GRAY_WOOL, 2));

    GeneratedRecipe SACHET_RECYCLING = create(
            "sachet_recycling", b -> b
                    .require(CobblemonItems.SACHET)
                    .duration(150)
                    .output(Items.STRING)
                    .output(Items.PINK_DYE, 2));

    GeneratedRecipe UPGRADE_RECYCLING = create(
            "upgrade_recycling", b -> b
                    .require(CobblemonItems.UPGRADE)
                    .duration(150)
                    .output(Items.AMETHYST_SHARD)
                    .output(AllItems.COPPER_NUGGET, 4)
                    .output(Items.REDSTONE));

    GeneratedRecipe VIVICHOKE = create(
            "vivichoke", b -> b
                    .require(CobblemonItems.VIVICHOKE)
                    .duration(70)
                    .output(CobblemonItems.VIVICHOKE_SEEDS, 3));

    GeneratedRecipe WHIPPED_DREAM_RECYCLING = create(
            "whipped_dream_recycling", b -> b
                    .require(CobblemonItems.WHIPPED_DREAM)
                    .duration(150)
                    .output(Items.SUGAR, 4)
                    .output(Items.SWEET_BERRIES));

    public CMCrushingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CobblemonManufactory.ID);
    }

    @Override
    public @NotNull String getName() {
        return CobblemonManufactory.NAME + "'s Crushing Recipes";
    }

    private GeneratedRecipe createTumblestoneBlock(String name, ItemLike tumblestoneBlock, ItemLike tumblestoneItem) {
        return create(name, b -> b
                .require(tumblestoneBlock)
                .duration(150)
                .output(tumblestoneItem, 3)
                .output(.5f, tumblestoneItem));
    }

    private GeneratedRecipe createTumblestoneCluster(String name, ItemLike tumblestoneCluster, ItemLike tumblestoneItem) {
        return create(name, b -> b
                .require(tumblestoneCluster)
                .duration(150)
                .output(tumblestoneItem, 7)
                .output(.5f, tumblestoneItem));
    }

    private GeneratedRecipe createPowerItemRecycling(String name, ItemLike powerItem, ItemLike seed) {
        return create(name, b -> b
                .require(powerItem)
                .duration(150)
                .output(Blocks.GRANITE, 2)
                .output(Items.DIAMOND)
                .output(seed));
    }

    private GeneratedRecipe createStone(String name, ItemLike ore, ItemLike stone) {
        return create(name + "_recycling", b -> b
                .require(ore)
                .duration(350)
                .output(stone)
                .output(.75f, stone)
                .output(.75f, AllItems.EXP_NUGGET)
                .output(.125f, Blocks.COBBLESTONE));
    }

    private GeneratedRecipe createDeepslateStone(String name, ItemLike deepslateOre, ItemLike stone) {
        return create(name, b -> b
                .require(deepslateOre)
                .duration(450)
                .output(stone, 2)
                .output(.25f, stone)
                .output(.75f, AllItems.EXP_NUGGET)
                .output(.125f, Blocks.COBBLED_DEEPSLATE));
    }
}
