package de.founntain.founnmod.items;

import de.founntain.founnmod.FounnMod;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class FoxorbPickaxe extends Item {
    public FoxorbPickaxe() {
        super(new Item.Properties()
            .group(FounnMod.TAB)
            .addToolType(ToolType.PICKAXE, 3)
            .maxStackSize(1)
        );
    }
}