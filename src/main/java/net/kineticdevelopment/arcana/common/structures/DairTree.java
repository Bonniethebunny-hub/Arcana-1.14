package net.kineticdevelopment.arcana.common.structures;

import net.kineticdevelopment.arcana.common.features.DairTreeFeature;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class DairTree extends Tree {
    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return (AbstractTreeFeature<NoFeatureConfig>) new DairTreeFeature(NoFeatureConfig::deserialize, true);
    }
}
