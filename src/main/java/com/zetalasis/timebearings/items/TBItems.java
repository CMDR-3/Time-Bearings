package com.zetalasis.timebearings.items;

import com.zetalasis.timebearings.TimeBearings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TBItems {
    public static final Item CLOCKWORK_UTILITIES = register("clockwork_utilities", new Item(new FabricItemSettings()));
    public static final Item DEBUG_WAND = register("debug_wand", new Item(new FabricItemSettings()));

    private static Item register(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(TimeBearings.MOD_ID, name), item);
    };

    public static void RegisterItems()
    {
        TimeBearings.LOGGER.info("Setting up items");
    }
}
