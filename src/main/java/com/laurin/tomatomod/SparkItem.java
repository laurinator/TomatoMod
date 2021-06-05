package com.laurin.tomatomod;

import com.laurin.tomatomod.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
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

        Block toSet = ModBlocks.GLOWING_GLASS_BLOCK; //set this to correct Block later (glowing glass)
        Block toReplace = Blocks.GLASS;

        if(blockState.isOf(Blocks.WHITE_STAINED_GLASS)){
            world.setBlockState(blockPos, ModBlocks.GLOWING_WHITE_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.ORANGE_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_ORANGE_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.MAGENTA_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_MAGENTA_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.LIGHT_BLUE_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_LIGHT_BLUE_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.YELLOW_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_YELLOW_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.LIME_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_LIME_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.PINK_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_PINK_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.GRAY_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_GRAY_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.LIGHT_GRAY_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_LIGHT_GRAY_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.CYAN_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_CYAN_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.PURPLE_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_PURPLE_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.BLUE_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_BLUE_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.BROWN_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_BROWN_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.GREEN_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_GREEN_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.RED_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_RED_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.BLACK_STAINED_GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_BLACK_STAINED_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else if(blockState.isOf(Blocks.GLASS)) {
            world.setBlockState(blockPos, ModBlocks.GLOWING_GLASS_BLOCK.getDefaultState());
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            return ActionResult.SUCCESS;
        } else return ActionResult.PASS;

    }

}
