package com.traid.bountifulharvest.item;

import com.traid.bountifulharvest.BountifulHarvest;

import com.traid.bountifulharvest.BountifulHarvestCreativeTab;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemHarvestFood extends Item {

    private int healAmount;
    private float saturation;

    public ItemHarvestFood(int amount, float saturation, boolean isWolfFood, boolean eatFast, boolean alwaysEdible, String name) {
        super(new Item.Properties().food(createFood(amount, saturation, isWolfFood, eatFast, alwaysEdible, null)).tab(BountifulHarvestCreativeTab.BountifulHarvestTab));
        //this.setRegistryName(BountifulHarvest.MOD_ID, name);
        this.healAmount = amount;
        this.saturation = saturation;
    }

    public static final FoodProperties createFood(int amount, float saturation, boolean isWolfFood, boolean eatFast, boolean alwaysEdible, MobEffects potion) {
        FoodProperties.Builder builder = new FoodProperties.Builder();
        builder.nutrition(amount);
        builder.saturationMod(saturation);
        if (isWolfFood) {
            builder.meat();
        }
        if (eatFast) {
            builder.fast();
        }
        if (alwaysEdible) {
            builder.alwaysEat();
        }
        return builder.build();
    }

    public ItemStack onItemUseFinish(ItemStack stack, Level worldIn, LivingEntity LivingEntity) {
        return stack;
    }

}
