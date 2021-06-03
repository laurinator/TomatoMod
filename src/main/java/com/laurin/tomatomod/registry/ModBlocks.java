package com.laurin.tomatomod.registry;

import com.laurin.tomatomod.BambooStakeBlock;
import com.laurin.tomatomod.TomatoMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

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

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(TomatoMod.MOD_ID, "bamboo_stake_block"), BAMBOO_STAKE_BLOCK);

    }

}
