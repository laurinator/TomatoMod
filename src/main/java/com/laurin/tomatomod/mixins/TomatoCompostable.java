package com.laurin.tomatomod.mixins;

import com.laurin.tomatomod.registry.ModItems;
import net.minecraft.block.ComposterBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(ComposterBlock.class)
public class TomatoCompostable {

    @Inject(at = @At("HEAD"), method="registerDefaultCompostableItems()V")
    private static void registerDefaultCompostableItems(CallbackInfo info){
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO.asItem(), 0.65f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.GREEN_TOMATO.asItem(), 0.5f);
    }
}