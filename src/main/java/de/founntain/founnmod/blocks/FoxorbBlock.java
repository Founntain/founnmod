package de.founntain.founnmod.blocks;

import de.founntain.founnmod.enums.HarvestLevel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FoxorbBlock extends Block{
    public FoxorbBlock() {
        super(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(5.0F, 6.0F)
            .sound(SoundType.METAL)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(HarvestLevel.IRON.getValue())
            .setRequiresTool()
        );
    }
}