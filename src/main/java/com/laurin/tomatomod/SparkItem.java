package com.laurin.tomatomod;

import com.google.common.collect.ImmutableMap;
import com.laurin.tomatomod.registry.ModBlocks;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SparkItem extends Item {

    public SparkItem(Settings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {

        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);

        System.out.println(blockState.toString());

        Block toSet = ModBlocks.GLOWING_GLASS_BLOCK; //set this to correct Block later (glowing glass)
        Block toReplace = Blocks.GLASS;

        if(blockState.isOf(toReplace)) {

            world.setBlockState(blockPos, toSet.getDefaultState());
            return ActionResult.SUCCESS;

        }

        return ActionResult.PASS;

    }

}
