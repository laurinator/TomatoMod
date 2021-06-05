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
        LootUpdater.init();
        VillagerTrades.init();

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_STAKE_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_GLASS_BLOCK, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILD_TOMATO, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_WHITE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_ORANGE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_MAGENTA_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_LIGHT_BLUE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_YELLOW_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_LIME_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_PINK_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_GRAY_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_LIGHT_GRAY_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_CYAN_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_PURPLE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_BLUE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_GREEN_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_BROWN_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_RED_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_BLACK_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());


    }
}