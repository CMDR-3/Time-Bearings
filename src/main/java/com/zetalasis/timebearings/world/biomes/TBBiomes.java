package com.zetalasis.timebearings.world.biomes;

import com.zetalasis.timebearings.TimeBearings;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class TBBiomes {
    public static ResourceKey<Biome> TARDIS_BIOME_KEY = ResourceKey.create(Registries.BIOME, new ResourceLocation(TimeBearings.MOD_ID, "tardis"));
}
