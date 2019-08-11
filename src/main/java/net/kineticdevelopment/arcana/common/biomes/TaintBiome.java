package net.kineticdevelopment.arcana.common.biomes;

import net.kineticdevelopment.arcana.common.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;


public class TaintBiome extends Biome {

        protected static final SurfaceBuilderConfig TaintBiome = new SurfaceBuilderConfig(BlockInit.TAINTEDSOIL.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.CLAY.getDefaultState());

	public TaintBiome()
        {
            super((new Biome.Builder()).surfaceBuilder(new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, TaintBiome)).precipitation(RainType.RAIN).category(Category.FOREST).depth(0.125F).scale(0.05F).temperature(9999.0F).downfall(0.4F).waterColor(6684774).waterFogColor(6684774).parent((String)null));
            //this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(ModEntities.ARCANA_TAINTED_CHICKEN, 0, 0, 0));
        }

        /*@Override
        public int getSkyColorByTemp(float currentTemperature)
        {
            return 0xE0B041;
        }

         */

}
