package de.founntain.founnmod.world.gen;

import de.founntain.founnmod.FounnMod;
import de.founntain.founnmod.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = FounnMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ModOreGen {
    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event){
        for(Biome biome : ForgeRegistries.BIOMES){
            if(biome.getCategory() == Category.NETHER){
                genOre(biome, 30, 0, 5, 200, FillerBlockType.NETHER_ORE_REPLACEABLES, RegistryHandler.FOXGEM_NETHERORE_BLOCK.get().getDefaultState(), 5);
            }else if(biome.getCategory() != Category.THEEND){
                genOre(biome, 12, 5, 0, 60, FillerBlockType.NATURAL_STONE, RegistryHandler.FOXPEARL_ORE_BLOCK.get().getDefaultState(), 5);
                genOre(biome, 6, 5, 0, 30, FillerBlockType.NATURAL_STONE, RegistryHandler.FOXORB_ORE_BLOCK.get().getDefaultState(), 5);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size){
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);

        biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}