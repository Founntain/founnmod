package de.founntain.founnmod.items;

import de.founntain.founnmod.FounnMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Bacon extends Item {
    public Bacon(){
        super(new Item.Properties()
            .group(FounnMod.TAB)
            .food(new Food.Builder()
                .hunger(5)
                .saturation(5)
                .setAlwaysEdible()
                .build()
            )
        );
    }
}