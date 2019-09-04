package net.kineticdevelopment.arcana.common.init;


import net.kineticdevelopment.arcana.common.biomes.MagicalForestBiome;
import net.kineticdevelopment.arcana.common.biomes.TaintBiome;
import net.minecraftforge.registries.ObjectHolder;

public class BiomeInit {

    @ObjectHolder("arcana:taintbiome")
    public static TaintBiome TAINTBIOME;

    @ObjectHolder("arcana:magicalforest")
    public static MagicalForestBiome MAGICALFORESTBIOME;

}
