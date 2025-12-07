package com.r4men.cobblemon_manufactory.block;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import com.r4men.cobblemon_manufactory.item.CMItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CMBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CobblemonManufactory.ID);

    public static final DeferredBlock<Block> EXP_QUARTZ_BLOCK = registerBlock("exp_quartz_block",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.STONE)
                    .sound(SoundType.AMETHYST)
                    .mapColor(MapColor.COLOR_GREEN)));

    public static final DeferredBlock<Block> EXP_QUARTZ_TILES = registerBlock("exp_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.STONE)
                    .sound(SoundType.AMETHYST)
                    .mapColor(MapColor.COLOR_GREEN)));

    public static final DeferredBlock<Block> SMALL_EXP_QUARTZ_TILES = registerBlock("small_exp_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.STONE)
                    .sound(SoundType.AMETHYST)
                    .mapColor(MapColor.COLOR_GREEN)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        CMItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
