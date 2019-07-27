package net.kineticdevelopment.arcana.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class taintedrock extends Block {
    public taintedrock() {
        super(Block.Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName("taintedrock");
    }
}
