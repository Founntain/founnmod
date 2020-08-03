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
    }

    @SubscribeEvent
    public static void onBreakEvent(BlockEvent.BreakEvent event){
        printConsoleMessage("Player: " + event.getPlayer().getName().toString());

        Block block = event.getState().getBlock();
        printConsoleMessage("HarvestLevel: " + block.getHarvestLevel(block.getDefaultState()));
        printConsoleMessage("HarvestTool: " + block.getHarvestTool(block.getDefaultState()).getName());
    }

    private static void printConsoleMessage(String msg) {
        System.out.println("[BlockEvent.BreakEvent] " + msg);
    }
}