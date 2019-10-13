package kineticdevelopment.arcana.common.biomes;

import kineticdevelopment.arcana.api.registry.ArcanaBlocks;
import kineticdevelopment.arcana.init.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class TaintBiome extends Biome {

    protected static final SurfaceBuilderConfig taint_biome = new SurfaceBuilderConfig(ArcanaBlocks.tainted_grass_block.getDefaultState(), ArcanaBlocks.tainted_soil.getDefaultState(), ArcanaBlocks.tainted_rock.getDefaultState());

    public TaintBiome()
    {
        super((new Biome.Builder()).surfaceBuilder(new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, taint_biome))
                .precipitation(Biome.RainType.RAIN)
                .category(Category.FOREST)
                .depth(0.125F)
                .scale(0.05F)
                .temperature(9999.0F)
                .downfall(0.4F)
                .waterColor(6684774)
                .waterFogColor(6684774)
                .parent((String)null));
    }

        /*@Override
        public int getSkyColorByTemp(float currentTemperature)
        {
            return 0xE0B041;
        }

         */

}