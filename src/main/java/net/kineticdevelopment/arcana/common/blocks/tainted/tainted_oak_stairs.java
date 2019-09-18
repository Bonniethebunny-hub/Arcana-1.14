package net.kineticdevelopment.arcana.common.blocks.tainted;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

    public class tainted_oak_stairs extends StairsBlock {
        public tainted_oak_stairs(Block block) {
            super(block.getDefaultState(), Block.Properties.from(block));
            setRegistryName("tainted_planks_stairs");
        }
    }
