package de.founntain.founnmod.handlers;

import de.founntain.founnmod.FounnMod;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FounnMod.MOD_ID, value = Dist.CLIENT)
public class PlayerInteractBlockLeftClickEvent {
    public PlayerInteractBlockLeftClickEvent() {
        super();
    }

    @SubscribeEvent
    public static void playerInteractBlockLeftClickEvent(PlayerInteractEvent.LeftClickBlock event){
        printConsoleMessage("Item used: " + event.getItemStack().getTranslationKey());

        if(!event.getItemStack().getTranslationKey().equals("item.founnmod.tnt_pickaxe")) return;

        World world = event.getWorld();
        BlockPos pos = event.getPos();

        world.createExplosion(event.getEntity(), pos.getX(), pos.getY(), pos.getZ(), 5, Explosion.Mode.BREAK);
        // event.getItemStack().damageItem(1, event.getPlayer(), );
    }

    private static void printConsoleMessage(String msg) {
        System.out.println("[LeftClickBlock] " + msg);
    }
}