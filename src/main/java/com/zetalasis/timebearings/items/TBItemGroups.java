package com.zetalasis.timebearings.items;

import com.zetalasis.timebearings.TimeBearings;
import com.zetalasis.timebearings.blocks.TBBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TBItemGroups {
    public static final ItemGroup TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TimeBearings.MOD_ID, "tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tools"))
                    .icon(() -> new ItemStack(TBItems.CLOCKWORK_UTILITIES)).entries((displayContext, entries) -> {
                        entries.add(TBItems.CLOCKWORK_UTILITIES);
                        entries.add(TBBlocks.CLOCKWORK_TABLE);
                    }).build());

    public static final ItemGroup EXTERIORS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TimeBearings.MOD_ID, "exteriors"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.exteriors"))
                    .icon(() -> new ItemStack(TBBlocks.CLOCKWORK_TARDIS_EXTERIOR)).entries((displayContext, entries) -> {
                        entries.add(TBBlocks.CLOCKWORK_TARDIS_EXTERIOR);
                    }).build());

    public static void RegisterItemGroups()
    {
        TimeBearings.LOGGER.info("Creating item groups");
    }
}
