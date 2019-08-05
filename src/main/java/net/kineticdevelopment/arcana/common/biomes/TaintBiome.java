package net.kineticdevelopment.arcana.common.biomes;

import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.kineticdevelopment.arcana.common.init.ModEntities;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;


public class TaintBiome extends Biome {

        protected static final SurfaceBuilderConfig TaintBiome = new SurfaceBuilderConfig(ModBlocks.TAINTEDSOIL.getDefaultState(), Blocks.PODZOL.getDefaultState(), Blocks.CLAY.getDefaultState());

	public TaintBiome()
        {
            super((new Biome.Builder()).surfaceBuilder(new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, TaintBiome)).precipitation(Biome.RainType.NONE).category(Biome.Category.DESERT).depth(0.125F).scale(0.05F).temperature(1000.8F).downfall(0.4F).waterColor(4159204).waterFogColor(329011).parent((String)null));
            this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(ModEntities.ARCANA_TAINTED_CHICKEN, 100, 4, 4));
        }

        @Override
        public int getSkyColorByTemp(float currentTemperature)
        {
            return 0xE0B041;
        }

}
