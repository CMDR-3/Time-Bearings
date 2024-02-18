package com.zetalasis.timebearings.items;

import com.zetalasis.timebearings.TimeBearings;
import com.zetalasis.timebearings.blocks.TBBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TBItemGroups {
    public static final CreativeModeTab TOOLS_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            new ResourceLocation(TimeBearings.MOD_ID, "tools"),
            FabricItemGroup.builder().title(Component.translatable("itemgroup.tools"))
                    .icon(() -> new ItemStack(TBItems.CLOCKWORK_UTILITIES)).displayItems((displayContext, entries) -> {
                        entries.accept(TBItems.CLOCKWORK_UTILITIES);
                        entries.accept(TBBlocks.CLOCKWORK_TABLE);
                    }).build());

    public static final CreativeModeTab EXTERIORS_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            new ResourceLocation(TimeBearings.MOD_ID, "exteriors"),
            FabricItemGroup.builder().title(Component.translatable("itemgroup.exteriors"))
                    .icon(() -> new ItemStack(TBBlocks.TARDIS_EXTERIOR)).displayItems((displayContext, entries) -> {
                        entries.accept(TBBlocks.TARDIS_EXTERIOR);
                    }).build());

    public static void RegisterItemGroups()
    {
        TimeBearings.LOGGER.info("Creating item groups");
    }
}
