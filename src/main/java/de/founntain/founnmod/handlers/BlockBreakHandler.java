package de.founntain.founnmod.handlers;

import de.founntain.founnmod.FounnMod;
import net.minecraft.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FounnMod.MOD_ID, value = Dist.CLIENT)
public class BlockBreakHandler {
    public BlockBreakHandler() {
        super();

        System.out.println("BLOCKBREAK => READY");
    }

    @SubscribeEvent
    public static void onBreakEvent(BlockEvent.BreakEvent event){
        System.out.println("BLOCKBREAK => Player: " + event.getPlayer().getName());

        Block block = event.getState().getBlock();
        System.out.println("BLOCKBREAK => HarvestLevel: " + block.getHarvestLevel(block.getDefaultState()));
        System.out.println("BLOCKBREAK => HarvestTool: " + block.getHarvestTool(block.getDefaultState()).getName());
    }
}