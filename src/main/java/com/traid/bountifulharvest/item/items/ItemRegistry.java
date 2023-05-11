package com.traid.bountifulharvest.item.items;

import com.traid.bountifulharvest.BountifulHarvest;
import com.traid.bountifulharvest.BountifulHarvestCreativeTab;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BountifulHarvest.MOD_ID);

    //Food
    public static final RegistryObject<Item> saltFood = ITEMS.register("saltfood",
            () -> new Item(new Item.Properties().tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));
    public static final RegistryObject<Item> doughFood = ITEMS.register("doughfood",
            () -> new Item(new Item.Properties().tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));;

    // Tools
    public static final RegistryObject<Item> skillet = ITEMS.register("skillet",
            () -> new Item(new Item.Properties().tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));;


    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }

}
