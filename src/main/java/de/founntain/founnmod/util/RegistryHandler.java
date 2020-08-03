package de.founntain.founnmod.util;

import de.founntain.founnmod.FounnMod;
import de.founntain.founnmod.blocks.*;
import de.founntain.founnmod.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
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
    public static final RegistryObject<Item> FOXORB = ITEMS.register("foxorb", Foxorb::new);

    //Blocks
    public static final RegistryObject<Block> FOXORB_ORE = BLOCKS.register("foxorb_ore", FoxorbOre::new);

    //BlockItems
    public static final RegistryObject<Item> BACON_BLOCK_ITEM = ITEMS.register("foxorb_ore", () -> new BlockItemBase(FOXORB_ORE.get()));
}