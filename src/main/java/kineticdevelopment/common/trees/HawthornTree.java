package kineticdevelopment.common.trees;

import net.minecraft.block.trees.BigTree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class HawthornTree extends BigTree {

    //Not done, playing around with making the trees without structures. For now I've just extended the BigTree
    @Nullable
    @Override
    protected AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
        return null;
    }

    @Nullable
    @Override
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return null;
    }
}
