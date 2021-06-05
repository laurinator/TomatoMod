package com.laurin.tomatomod.registry;

import com.laurin.tomatomod.SparkItem;
import com.laurin.tomatomod.TomatoMod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items

    public static final Item TOMATO = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())
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

    public static void registerItems(){

        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "tomato"), TOMATO);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "bamboo_stake"), BAMBOO_STAKE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "green_tomato"), GREEN_TOMATO);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "spark"), SPARK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "glowing_glass_block"), GLOWING_GLASS_BLOCK);

    }

}
