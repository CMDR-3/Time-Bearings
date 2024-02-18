package com.zetalasis.timebearings.items;

import com.zetalasis.timebearings.TimeBearings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class TBItems {
    public static final Item CLOCKWORK_UTILITIES = register("clockwork_utilities", new Item(new FabricItemSettings()));
    public static final Item DEBUG_WAND = register("debug_wand", new Item(new FabricItemSettings()));

    private static Item register(String name, Item item)
    {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TimeBearings.MOD_ID, name), item);
    };

    public static void RegisterItems()
    {
        TimeBearings.LOGGER.info("Setting up items");
    }
}
