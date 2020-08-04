package de.founntain.founnmod.util;

import de.founntain.founnmod.FounnMod;
import de.founntain.founnmod.blocks.*;
import de.founntain.founnmod.items.*;
import de.founntain.founnmod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FounnMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FounnMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> BACON = ITEMS.register("bacon", Bacon::new);
    public static final RegistryObject<Item> FOXORB = ITEMS.register("foxorb", Foxgem::new);
    public static final RegistryObject<Item> FOXPEARL = ITEMS.register("foxpearl", Foxgem::new);
    public static final RegistryObject<Item> FOXGEM = ITEMS.register("foxgem", Foxgem::new);

    //Tools
    public static final RegistryObject<SwordItem> FOXORB_SWORD = ITEMS.register("foxorb_sword", () -> 
        new SwordItem(ModItemTier.FOXORB, 0, -2.4F, new Item.Properties().group(FounnMod.TAB))
    );
    public static final RegistryObject<PickaxeItem> FOXORB_PICKAXE = ITEMS.register("foxorb_pickaxe", () -> 
        new PickaxeItem(ModItemTier.FOXORB, 0, 0.0F, new Item.Properties().group(FounnMod.TAB))
    );
    public static final RegistryObject<AxeItem> FOXORB_AXE = ITEMS.register("foxorb_axe", () -> 
        new AxeItem(ModItemTier.FOXORB, 0, 0.0F, new Item.Properties().group(FounnMod.TAB))
    );
    public static final RegistryObject<ShovelItem> FOXORB_SHOVEL = ITEMS.register("foxorb_shovel", () -> 
        new ShovelItem(ModItemTier.FOXORB, 0, 0.0F, new Item.Properties().group(FounnMod.TAB))
    );
    public static final RegistryObject<HoeItem> FOXORB_HOE = ITEMS.register("foxorb_hoe", () -> 
        new HoeItem(ModItemTier.FOXORB, 0, 0.0F, new Item.Properties().group(FounnMod.TAB))
    );

    public static final RegistryObject<PickaxeItem> TNT_PICKAXE = ITEMS.register("tnt_pickaxe", () -> 
        new PickaxeItem(ModItemTier.FOXORB, 0, 0.0F, new Item.Properties().group(FounnMod.TAB))
    );

    //Blocks
    public static final RegistryObject<Block> FOXORB_ORE_BLOCK = BLOCKS.register("foxorb_ore", FoxorbOreBlock::new);
    public static final RegistryObject<Block> FOXPEARL_ORE_BLOCK = BLOCKS.register("foxpearl_ore", FoxpearlOreBlock::new);
    public static final RegistryObject<Block> FOXGEM_NETHERORE_BLOCK = BLOCKS.register("foxgem_netherore", FoxgemNetherOreBlock::new);
    public static final RegistryObject<Block> FOXORB_BLOCK = BLOCKS.register("foxorb_block", FoxorbBlock::new);

    //BlockItems
    public static final RegistryObject<Item> FOXORB_ORE_ITEM = ITEMS.register("foxorb_ore", () -> new BlockItemBase(FOXORB_ORE_BLOCK.get()));
    public static final RegistryObject<Item> FOXPEARL_ORE_ITEM = ITEMS.register("foxpearl_ore", () -> new BlockItemBase(FOXPEARL_ORE_BLOCK.get()));
    public static final RegistryObject<Item> FOXGEM_NETHERORE_ITEM = ITEMS.register("foxgem_netherore", () -> new BlockItemBase(FOXGEM_NETHERORE_BLOCK.get()));
    public static final RegistryObject<Item> FOXORB_BLOCK_ITEM = ITEMS.register("foxorb_block", () -> new BlockItemBase(FOXORB_BLOCK.get()));
}