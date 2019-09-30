package kineticdevelopment.arcana.common.world;


import kineticdevelopment.arcana.api.registry.ArcanaBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

/**
 *
 */
public class OreGeneration {

    /**
     * Sets up the main ore generation in the world.
     */
    public static void setupOreGeneration() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ArcanaBlocks.amber_ore.getDefaultState(), 1), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
        }
    }
}
