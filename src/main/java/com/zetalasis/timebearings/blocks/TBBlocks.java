package com.zetalasis.timebearings.blocks;

import com.zetalasis.timebearings.TimeBearings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class TBBlocks {
    public static final Block CLOCKWORK_TABLE = registerBlock("clockwork_table",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TARDIS_EXTERIOR = registerBlock("tardis_exterior",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    //public static final Block YELLOW_ROUNDEL = registerBlock("yellow_roundel",
            //new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block YELLOW_ROUNDEL = registerBlock("yellow_roundel",
            new TBRoundel(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block GRATE = registerBlock("grate",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).nonOpaque()));

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TimeBearings.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TimeBearings.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void RegisterBlocks()
    {
        TimeBearings.LOGGER.info("Registering blocks");
    }
}
