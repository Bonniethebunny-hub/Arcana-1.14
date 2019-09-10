package net.kineticdevelopment.arcana.common.blocks.tainted;

import net.kineticdevelopment.arcana.common.init.BlockInit;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class tainted_planks_stairs extends StairsBlock {

    public tainted_planks_stairs() {

        super(BlockInit.TAINTEDOAKPLANKS.getDefaultState(), Block.Properties.from(BlockInit.TAINTEDOAKPLANKS));

    }
}
