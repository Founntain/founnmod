package de.founntain.founnmod.handlers;

import de.founntain.founnmod.FounnMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FounnMod.MOD_ID, value = Dist.CLIENT)
public class LivingHurtEventHandler {
    public LivingHurtEventHandler() {
        super();
    }

    @SubscribeEvent
    public static void onLivingHurtEvent(LivingHurtEvent event){
        Entity entity = event.getEntity();

        if(event.getSource().getTrueSource() != null){
            if(event.getSource().getTrueSource() instanceof PlayerEntity){
                printConsoleMessage("Playername: " + event.getSource().getTrueSource().getName().getUnformattedComponentText());
            }
        }

        if(event.getSource().getDamageType() != "player") return;

        printConsoleMessage(event.getSource().getDamageType());

        World world = entity.getEntityWorld();

        BlockPos pos = entity.getPosition();

        printConsoleMessage("GetImmediateSource: " + event.getSource().getImmediateSource().getType().toString());

        world.createExplosion(event.getSource().getTrueSource().getEntity(), pos.getX(), pos.getY(), pos.getZ(), 10, Explosion.Mode.BREAK);
    }

    private static void printConsoleMessage(String msg) {
        System.out.println("[LivingHurtEvent] " + msg);
    }
}