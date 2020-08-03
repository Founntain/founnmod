package de.founntain.founnmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FoxorbOre extends Block{
    public FoxorbOre() {
        super(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(3.0F, 3.0F)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(2)
            .setRequiresTool()
        );
    }
}