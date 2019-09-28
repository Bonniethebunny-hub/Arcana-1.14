package kineticdevelopment.common.blocks.tainted;

import kineticdevelopment.api.blocks.TaintedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TaintedCrust extends TaintedBlock {
    public TaintedCrust() {
        super(Block.Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
        );

    }
}