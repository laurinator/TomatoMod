package com.laurin.tomatomod.registry;

import com.laurin.tomatomod.BambooStakeBlock;
import com.laurin.tomatomod.GlowingGlassBlock;
import com.laurin.tomatomod.TomatoMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class ModBlocks {

    public static final BambooStakeBlock BAMBOO_STAKE_BLOCK = new BambooStakeBlock(FabricBlockSettings
            .of(Material.WOOD)
            .strength( 0.2f, 0.2f)
            .breakByTool(FabricToolTags.AXES, 0)
            .breakByHand(true)
            .sounds(BlockSoundGroup.BAMBOO)
            .noCollision()
            .ticksRandomly()
    );

    public static final GlowingGlassBlock GLOWING_GLASS_BLOCK = new GlowingGlassBlock(FabricBlockSettings
            .of(Material.GLASS)
            .strength(0.3F)
            .sounds(BlockSoundGroup.GLASS)
            .nonOpaque()
            .allowsSpawning(ModBlocks::never)
            .solidBlock(new AbstractBlock.ContextPredicate() {
                @Override
                public boolean test(BlockState state, BlockView world, BlockPos pos) {
                    return false;
                }
            })
            .suffocates(new AbstractBlock.ContextPredicate() {
                @Override
                public boolean test(BlockState state, BlockView world, BlockPos pos) {
                    return false;
                }
            })
            .blockVision(new AbstractBlock.ContextPredicate() {
                @Override
                public boolean test(BlockState state, BlockView world, BlockPos pos) {
                    return false;
                }
            })
            .luminance((state) -> {
                return 15;
            })
    );

    private static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "bamboo_stake_block"), BAMBOO_STAKE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_glass_block"), GLOWING_GLASS_BLOCK);

    }

}
