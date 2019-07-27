package net.kineticdevelopment.arcana.common.blocks.trees;

import java.util.Random;

import javax.annotation.Nullable;

import net.kineticdevelopment.arcana.common.features.GreatwoodTreeFeature;
import net.kineticdevelopment.arcana.common.features.SilverwoodTreeFeature;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class SilverwoodTree extends Tree {
	@Nullable
	protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
		return (AbstractTreeFeature<NoFeatureConfig>) new SilverwoodTreeFeature(NoFeatureConfig::deserialize, true);
	}
}
