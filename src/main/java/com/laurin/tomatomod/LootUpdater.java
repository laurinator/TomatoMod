package com.laurin.tomatomod;

import com.laurin.tomatomod.registry.ModItems;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;

public class LootUpdater {

    public static void init(){

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            
            if(id.getPath().contains("chests") && (id.getPath().contains("village") || id.getPath().contains("shipwreck"))){

                System.out.println(id.getPath());

                FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
                builder.rolls(UniformLootTableRange.between(0, 5));
                builder.withCondition(RandomChanceLootCondition.builder(0.5f).build());
                builder.withEntry(ItemEntry.builder(ModItems.TOMATO).build());

                supplier.withPool(builder.build());
                
            }
            
        });

    }

}

