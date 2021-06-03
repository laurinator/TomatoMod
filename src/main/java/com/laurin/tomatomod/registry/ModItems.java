package com.laurin.tomatomod.registry;

import com.laurin.tomatomod.TomatoMod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item TOMATO = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())
    );

    public static final Item GREEN_TOMATO = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(1).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*3), 1f).build())
    );


    public static final Item BAMBOO_STAKE_BLOCK = new BlockItem(ModBlocks.BAMBOO_STAKE_BLOCK, new Item.Settings()
            .group(ItemGroup.DECORATIONS)
    );


    public static void registerItems(){

        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "tomato"), TOMATO);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "bamboo_stake"), BAMBOO_STAKE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(TomatoMod.MOD_ID, "green_tomato"), GREEN_TOMATO);

    }

}
