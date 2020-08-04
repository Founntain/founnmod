package de.founntain.founnmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class FoxgemNetherOreBlock extends Block{
    public FoxgemNetherOreBlock() {
        super(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(3.0F, 3.0F)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(2)
            .setRequiresTool()
        );
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch){
        return 1;
    }
}