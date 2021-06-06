package com.laurin.tomatomod;

import com.laurin.tomatomod.registry.ModBlocks;
import com.laurin.tomatomod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;


public class TomatoMod implements ModInitializer {

    public static final String MOD_ID = "tom";
    private static final Feature<DefaultFeatureConfig> WILD_TOMATO_FEATURE = new WildTomatoFeature(DefaultFeatureConfig.CODEC);
    public static final ConfiguredFeature<?, ?> WILD_TOMATO_CONFIGURED_FEATURE = WILD_TOMATO_FEATURE.configure(FeatureConfig.DEFAULT)
            .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(5)));

    @Override
    public void onInitialize() {

        PoisonousStewItem.initEffectList();

        Registry.register(Registry.FEATURE, new Identifier(MOD_ID, "wild_tomato"), WILD_TOMATO_FEATURE);

        RegistryKey<ConfiguredFeature<?, ?>> wildTomato = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "wild_tomato"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, wildTomato.getValue(), WILD_TOMATO_CONFIGURED_FEATURE);

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.RAW_GENERATION, wildTomato);  // experimental fabric method may be removed or changed

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