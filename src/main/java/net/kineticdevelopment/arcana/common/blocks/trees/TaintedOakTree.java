package net.kineticdevelopment.arcana.common.blocks.trees;

import net.kineticdevelopment.arcana.common.features.DairTreeFeature;
import net.kineticdevelopment.arcana.common.features.TaintedOakTreeFeature;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class TaintedOakTree extends Tree {
    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return (AbstractTreeFeature<NoFeatureConfig>) new TaintedOakTreeFeature(NoFeatureConfig::deserialize, true);
    }
}
