package de.founntain.founnmod.handlers;

import de.founntain.founnmod.FounnMod;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FounnMod.MOD_ID, value = Dist.CLIENT)
public class PlayerDeathEvent {
    public PlayerDeathEvent() {
        super();
    }

    @SubscribeEvent
    public static void playerInteractBlockLeftClickEvent(LivingDeathEvent event){
        
    }

    private static void printConsoleMessage(String msg) {
        System.out.println("[LeftClickBlock] " + msg);
    }
}