package com.laurin.tomatomod;

import com.laurin.tomatomod.registry.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;

public class WildTomatoFeature extends Feature<DefaultFeatureConfig> {
    public WildTomatoFeature(Codec<DefaultFeatureConfig> config) {
        super(config);
    }

    @Override
    public boolean generate(StructureWorldAccess world, ChunkGenerator generator, Random random, BlockPos pos,
                            DefaultFeatureConfig config) {
        BlockPos top = world.getTopPosition(Heightmap.Type.WORLD_SURFACE, pos);
        if (world.getBlockState(top.down()).getBlock() == Blocks.GRASS_BLOCK) {
            world.setBlockState(top, ModBlocks.WILD_TOMATO.getDefaultState(), 1);
            return true;
        } else {
            return false;
        }
    }
}