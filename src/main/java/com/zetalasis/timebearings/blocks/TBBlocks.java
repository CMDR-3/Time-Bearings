package com.zetalasis.timebearings.blocks;

import com.zetalasis.timebearings.TimeBearings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TBBlocks {
    public static final Block CLOCKWORK_TABLE = registerBlock("clockwork_table",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CLOCKWORK_TARDIS_EXTERIOR = registerBlock("clockwork_tardis_exterior",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block YELLOW_ROUNDEL = registerBlock("yellow_roundel",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TimeBearings.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(TimeBearings.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void RegisterBlocks()
    {
        TimeBearings.LOGGER.info("Registering blocks");
    }
}
