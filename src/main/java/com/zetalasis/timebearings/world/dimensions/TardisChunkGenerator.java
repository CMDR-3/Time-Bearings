package com.zetalasis.timebearings.world.dimensions;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.zetalasis.timebearings.world.biomes.TBBiomes;
import net.minecraft.core.*;
import net.minecraft.resources.RegistryOps;
import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.world.level.*;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeManager;
import net.minecraft.world.level.biome.FixedBiomeSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.GenerationStep.Carving;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.blending.Blender;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class TardisChunkGenerator extends ChunkGenerator {

    /**
     * Put chunk in centre of region file. Reduces save file by 4x. If we put in a corner, 3 adjacent regions get loaded
     */
    public static final ChunkPos CHUNKPOS = new ChunkPos(16, 16);
    public static final long CHUNKID = CHUNKPOS.toLong();
    public static final BlockPos CORNER = CHUNKPOS.getWorldPosition();
    public static final BlockPos CENTER = CORNER.offset(7, 7, 7);


    /**
     * We must use RegistryLookupCodec#getLookUpCodec because with SingleBiomeProviders,
     * <br> this prevents intense log spam which occurs when the server's DynamicRegistry list of biomes in the ChunkGenerator do not match with the
     * list present during Mod loading (that resides in WorldGenRegestries)
     * <br> RegistryLookupCodec ensures we are getting the biomes from when the server has already loaded up,
     * which is needed since we want to use this ChunkGenerator for dynamically created dimensions
     */
    public static final Codec<TardisChunkGenerator> CODEC = RecordCodecBuilder.create(builder -> builder.group(
            RegistryOps.retrieveElement(TBBiomes.TARDIS_BIOME_KEY)
    ).apply(builder, builder.stable(TardisChunkGenerator::new)));

    public TardisChunkGenerator(Holder<Biome> biome) {
        super(new FixedBiomeSource(biome));
    }


    @Override
    protected Codec<? extends ChunkGenerator> codec() {
        return CODEC;
    }

    @Override
    public void applyCarvers(WorldGenRegion pLevel, long pSeed, RandomState pRandom, BiomeManager pBiomeManager, StructureManager pStructureManager, ChunkAccess pChunk, Carving pStep) {

    }

    @Override
    public void buildSurface(WorldGenRegion pLevel, StructureManager pStructureManager, RandomState pRandom, ChunkAccess pChunk) {

    }

    @Override
    public int getGenDepth() {
        return 319;// total number of available y-levels (between bottom and top)
    }

    @Override
    public CompletableFuture<ChunkAccess> fillFromNoise(Executor pExecutor, Blender pBlender, RandomState pRandom, StructureManager pStructureManager, ChunkAccess pChunk) {
        return CompletableFuture.completedFuture(pChunk);
    }



    @Override
    public void spawnOriginalMobs(WorldGenRegion region) {
    }

    @Override
    public int getSeaLevel() {
        return 0;
    }

    @Override
    public int getMinY() {
        // the lowest y-level in the dimension
        // debug -> 0
        // flat -> 0
        // noise -> NoiseSettings#minY
        // overworld -> -64
        // nether -> 0
        return -64;
    }

    @Override
    public int getBaseHeight(int pX, int pZ, Types pType, LevelHeightAccessor pLevel, RandomState pRandom) {
        return 0;
    }

    @Override
    public NoiseColumn getBaseColumn(int pX, int pZ, LevelHeightAccessor pHeight, RandomState pRandom) {
        return new NoiseColumn(0, new BlockState[0]);
    }

    @Override
    public void addDebugScreenInfo(List<String> pInfo, RandomState pRandom, BlockPos pPos) {

    }



    @Override
    public int getSpawnHeight(LevelHeightAccessor level) {
        return 1;
    }

}