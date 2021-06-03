package com.laurin.tomatomod;

import com.laurin.tomatomod.registry.ModBlocks;
import com.laurin.tomatomod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TomatoMod implements ModInitializer {

    public static final String MOD_ID = "tom";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_STAKE_BLOCK, RenderLayer.getTranslucent());
    }
}