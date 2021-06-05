package com.laurin.tomatomod;

import net.minecraft.block.Stainable;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.util.DyeColor;

public class GlowingStainedGlassBlock extends StainedGlassBlock implements Stainable {


    public GlowingStainedGlassBlock(DyeColor color, Settings settings) {
        super(color, settings);
    }
}
