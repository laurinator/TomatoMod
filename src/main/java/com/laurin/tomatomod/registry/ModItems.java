package com.laurin.tomatomod.registry;

import com.laurin.tomatomod.SparkItem;
import com.laurin.tomatomod.TomatoMod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items

    public static final Item TOMATO = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())
    );

    public static final MushroomStewItem TOMATO_SALAD = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .maxCount(1)
            .food(new FoodComponent.Builder().hunger(9).saturationModifier(6).build())
    );

    public static final Item GREEN_TOMATO = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(1).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*3), 1f).build())
    );

    public static final Item SPARK = new SparkItem(new Item.Settings()
            .group(ItemGroup.MISC)
    );

    //BlockItems

    public static final Item BAMBOO_STAKE_BLOCK = new BlockItem(ModBlocks.BAMBOO_STAKE_BLOCK, new Item.Settings()
            .group(ItemGroup.DECORATIONS)
    );

    public static final Item GLOWING_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_GLASS_BLOCK, new Item.Settings()
            .group(ItemGroup.BUILDING_BLOCKS)
    );

    public static final Item GLOWING_WHITE_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_WHITE_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_ORANGE_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_ORANGE_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_MAGENTA_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_MAGENTA_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_LIGHT_BLUE_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_LIGHT_BLUE_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_YELLOW_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_YELLOW_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_LIME_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_LIME_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_PINK_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_PINK_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_GRAY_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_GRAY_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_LIGHT_GRAY_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_LIGHT_GRAY_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_CYAN_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_CYAN_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_PURPLE_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_PURPLE_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_BLUE_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_BLUE_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_BROWN_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_BROWN_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_GREEN_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_GREEN_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_RED_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_RED_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item GLOWING_BLACK_STAINED_GLASS_BLOCK = new BlockItem(ModBlocks.GLOWING_BLACK_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems(){

        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "tomato"), TOMATO);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "bamboo_stake"), BAMBOO_STAKE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "green_tomato"), GREEN_TOMATO);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "spark"), SPARK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "tomato_salad"), TOMATO_SALAD);

        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_glass_block"), GLOWING_GLASS_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_white_stained_glass_block"), GLOWING_WHITE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_orange_stained_glass_block"), GLOWING_ORANGE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_magenta_stained_glass_block"), GLOWING_MAGENTA_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_light_blue_stained_glass_block"), GLOWING_LIGHT_BLUE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_yellow_stained_glass_block"), GLOWING_YELLOW_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_lime_stained_glass_block"), GLOWING_LIME_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_pink_stained_glass_block"), GLOWING_PINK_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_gray_stained_glass_block"), GLOWING_GRAY_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_light_gray_stained_glass_block"), GLOWING_LIGHT_GRAY_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_cyan_stained_glass_block"), GLOWING_CYAN_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_purple_stained_glass_block"), GLOWING_PURPLE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_blue_stained_glass_block"), GLOWING_BLUE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_brown_stained_glass_block"), GLOWING_BROWN_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_green_stained_glass_block"), GLOWING_GREEN_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_red_stained_glass_block"), GLOWING_RED_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_black_stained_glass_block"), GLOWING_BLACK_STAINED_GLASS_BLOCK);

    }

}
