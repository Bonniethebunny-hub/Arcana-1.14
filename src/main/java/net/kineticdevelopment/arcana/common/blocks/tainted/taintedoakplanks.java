package net.kineticdevelopment.arcana.common.blocks.tainted;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class taintedoakplanks extends Block {

    public taintedoakplanks() {
        super(Properties.create(Material.IRON)
            .sound(SoundType.STONE)
            .hardnessAndResistance(3.0f)
            .lightValue(2)
            .harvestTool(ToolType.AXE)
        );
        setRegistryName("taintedoakplanks");
    }
}
