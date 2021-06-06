package com.laurin.tomatomod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

import java.util.ArrayList;

public class PoisonousStewItem extends Item {

    public static ArrayList<StatusEffectInstance> allEffects = new ArrayList<StatusEffectInstance>();

    public static void initEffectList(){
        allEffects.add(new StatusEffectInstance(StatusEffects.POISON, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.LUCK, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.BAD_OMEN, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.GLOWING, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.HASTE, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.HUNGER, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.INVISIBILITY, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.LEVITATION, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.SATURATION, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.SPEED, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.UNLUCK, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.WEAKNESS, 20 * 30, 5));
        allEffects.add(new StatusEffectInstance(StatusEffects.WITHER, 20 * 30, 5));
    }

    public PoisonousStewItem(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        System.out.println("----------------"); //TODO: why is this method called twice if the stew is consumed?

        ItemStack itemStack = super.finishUsing(stack, world, user);

        if(user instanceof PlayerEntity) {

               int index = (int) (Math.random() * allEffects.size());
               user.addStatusEffect(allEffects.get(index));
        }

        return user instanceof PlayerEntity && ((PlayerEntity)user).abilities.creativeMode ? itemStack : new ItemStack(Items.BOWL);

    }

}
