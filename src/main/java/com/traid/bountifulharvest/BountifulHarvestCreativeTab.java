package com.traid.bountifulharvest;

import com.traid.bountifulharvest.item.items.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BountifulHarvestCreativeTab {
    public static final CreativeModeTab BountifulHarvestTab = new CreativeModeTab("harvesttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.saltFood.get());
        }
    };
}
