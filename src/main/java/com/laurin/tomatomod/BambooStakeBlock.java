package com.laurin.tomatomod;

import com.laurin.tomatomod.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;


public class BambooStakeBlock extends Block {

    public static final IntProperty AGE = IntProperty.of("age", 0, 6);

    public BambooStakeBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(AGE, 0));
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.down());
        if (blockState.getBlock() == this) {
            return true;
        } else
            return blockState.isOf(Blocks.GRASS_BLOCK) || blockState.isOf(Blocks.DIRT) || blockState.isOf(Blocks.COARSE_DIRT) || blockState.isOf(Blocks.FARMLAND);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int age = state.get(AGE);
        ItemStack s = player.getStackInHand(hand);
        BlockState blockState = world.getBlockState(pos.down());

        if (age == 0 && s.getItem().toString().equals("tomato") && (blockState.isOf(Blocks.GRASS_BLOCK) || blockState.isOf(Blocks.DIRT) || blockState.isOf(Blocks.COARSE_DIRT) || blockState.isOf(Blocks.FARMLAND))) {


            world.setBlockState(pos, state.with(AGE, 1));
            s.decrement(1);

        } else if (age >= 1 && age <= 5 && s.getItem().toString().equals("bone_meal")) {

            world.setBlockState(pos, state.with(AGE, age + 1));
            s.decrement(1);

        } else if(s.getItem().toString().equals("shears") && age != 0) {

            dropStack(world, pos, new ItemStack(ModItems.TOMATO));
            world.setBlockState(pos, state.with(AGE, 0));

            s.damage(1, player, (playerEntity) -> {
                playerEntity.sendToolBreakStatus(hand);
            });

        } else if (age == 5) {

            int j = 1 + world.random.nextInt(3);
            dropStack(world, pos, new ItemStack(ModItems.GREEN_TOMATO, j));
            world.setBlockState(pos, state.with(AGE, 3));

        } else if (age == 6) {

            int j = 1 + world.random.nextInt(3);
            dropStack(world, pos, new ItemStack(ModItems.TOMATO, j));
            world.setBlockState(pos, state.with(AGE, 3));

        } else {

            return ActionResult.FAIL;

        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        boolean canGrow = world.getBaseLightLevel(pos.up(), 0) <= 9;

        int age = state.get(AGE);
        if (canGrow && 0 < age && age < 6 && random.nextInt(5) == 0) {  // jeder 5te random tick
            world.setBlockState(pos, state.with(AGE, age + 1));
        }

        BlockState blockState = world.getBlockState(pos.down());
        if (canGrow && age == 0 && blockState.isOf(this) && blockState.get(AGE) >= 4) {
            world.setBlockState(pos, state.with(AGE, 1));
        }
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (!state.canPlaceAt(world, pos)) {
            world.getBlockTickScheduler().schedule(pos, this, 1);
        }
        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }

    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0.4f, 0f, 0.4f, 0.6f, 1f, 0.6f);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0.4f, 0f, 0.4f, 0.6f, 1f, 0.6f);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

}