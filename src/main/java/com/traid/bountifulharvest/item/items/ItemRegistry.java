package com.traid.bountifulharvest.item.items;

import com.traid.bountifulharvest.BountifulHarvest;
import com.traid.bountifulharvest.BountifulHarvestCreativeTab;
import com.traid.bountifulharvest.item.custom.MixingBowlItem;
import com.traid.bountifulharvest.item.custom.MortarAndPestleItem;
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
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties().tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));

    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties().tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));

    // Tools
    public static final RegistryObject<Item> SKILLET = ITEMS.register("skillet",
            () -> new Item(new Item.Properties().tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));

    public static final RegistryObject<Item> MIXING_BOWL = ITEMS.register("mixing_bowl",
            () -> new MixingBowlItem(new Item.Properties().stacksTo(1).tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));

    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle",
            () -> new MortarAndPestleItem(new Item.Properties().stacksTo(1).tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));

    public static final RegistryObject<Item> MORTAR = ITEMS.register("mortar",
            () -> new Item(new Item.Properties().stacksTo(1).tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));

    public static final RegistryObject<Item> PESTLE = ITEMS.register("pestle",
            () -> new Item(new Item.Properties().stacksTo(1).tab(BountifulHarvestCreativeTab.BountifulHarvestTab)));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }

}
