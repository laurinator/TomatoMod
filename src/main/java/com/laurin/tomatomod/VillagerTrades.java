package com.laurin.tomatomod;

import com.laurin.tomatomod.registry.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;


public class VillagerTrades {

    public static void init() {

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(new ItemStack(ModItems.TOMATO, 15), new ItemStack(Items.EMERALD, 1), 16, 2, .05f));
        });

    }

}