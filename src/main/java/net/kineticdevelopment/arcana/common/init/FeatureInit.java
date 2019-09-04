package net.kineticdevelopment.arcana.common.init;

import net.kineticdevelopment.arcana.utilities.structures.DairTreeFeature;
import net.kineticdevelopment.arcana.utilities.structures.GreatwoodFeature;
import net.kineticdevelopment.arcana.utilities.structures.SilverwoodFeature;
import net.minecraftforge.registries.ObjectHolder;

public class FeatureInit {

    @ObjectHolder("arcana:dairfeature")
    public static DairTreeFeature DAIRFEATURE;

    @ObjectHolder("arcana:greatwoodfeature")
    public static GreatwoodFeature GREATWOODFEATURE;

    @ObjectHolder("arcana:silverwoodfeature")
    public static SilverwoodFeature SILVERWOODFEATURE;

}
