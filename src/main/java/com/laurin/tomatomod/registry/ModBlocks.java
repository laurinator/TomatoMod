package com.laurin.tomatomod.registry;

import com.laurin.tomatomod.BambooStakeBlock;
import com.laurin.tomatomod.GlowingGlassBlock;
import com.laurin.tomatomod.GlowingStainedGlassBlock;
import com.laurin.tomatomod.TomatoMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
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

    public static final FlowerBlock WILD_TOMATO = new FlowerBlock(StatusEffects.LUCK, 4, AbstractBlock.Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS));

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

    public static final GlowingStainedGlassBlock GLOWING_WHITE_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.WHITE);

    public static final GlowingStainedGlassBlock GLOWING_ORANGE_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.ORANGE);

    public static final GlowingStainedGlassBlock GLOWING_MAGENTA_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.MAGENTA);

    public static final GlowingStainedGlassBlock GLOWING_LIGHT_BLUE_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.LIGHT_BLUE);

    public static final GlowingStainedGlassBlock GLOWING_YELLOW_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.YELLOW);

    public static final GlowingStainedGlassBlock GLOWING_LIME_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.LIME);

    public static final GlowingStainedGlassBlock GLOWING_PINK_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.PINK);

    public static final GlowingStainedGlassBlock GLOWING_GRAY_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.GRAY);

    public static final GlowingStainedGlassBlock GLOWING_LIGHT_GRAY_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.LIGHT_GRAY);

    public static final GlowingStainedGlassBlock GLOWING_CYAN_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.CYAN);

    public static final GlowingStainedGlassBlock GLOWING_PURPLE_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.PURPLE);

    public static final GlowingStainedGlassBlock GLOWING_BLUE_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.BLUE);

    public static final GlowingStainedGlassBlock GLOWING_BROWN_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.BROWN);

    public static final GlowingStainedGlassBlock GLOWING_GREEN_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.GREEN);

    public static final GlowingStainedGlassBlock GLOWING_RED_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.RED);

    public static final GlowingStainedGlassBlock GLOWING_BLACK_STAINED_GLASS_BLOCK = createGlowingStainedGlassBlock(DyeColor.BLACK);

    public static GlowingStainedGlassBlock createGlowingStainedGlassBlock(DyeColor dyeColor){

        return new GlowingStainedGlassBlock(dyeColor, FabricBlockSettings
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

    }


    private static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "bamboo_stake_block"), BAMBOO_STAKE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "wild_tomato"), WILD_TOMATO);

        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_glass_block"), GLOWING_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_white_stained_glass_block"), GLOWING_WHITE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_orange_stained_glass_block"), GLOWING_ORANGE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_magenta_stained_glass_block"), GLOWING_MAGENTA_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_light_blue_stained_glass_block"), GLOWING_LIGHT_BLUE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_yellow_stained_glass_block"), GLOWING_YELLOW_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_lime_stained_glass_block"), GLOWING_LIME_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_pink_stained_glass_block"), GLOWING_PINK_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_gray_stained_glass_block"), GLOWING_GRAY_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_light_gray_stained_glass_block"), GLOWING_LIGHT_GRAY_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_cyan_stained_glass_block"), GLOWING_CYAN_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_purple_stained_glass_block"), GLOWING_PURPLE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_blue_stained_glass_block"), GLOWING_BLUE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_brown_stained_glass_block"), GLOWING_BROWN_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_green_stained_glass_block"), GLOWING_GREEN_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_red_stained_glass_block"), GLOWING_RED_STAINED_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "glowing_black_stained_glass_block"), GLOWING_BLACK_STAINED_GLASS_BLOCK);


    }

}
