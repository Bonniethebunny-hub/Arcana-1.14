package net.kineticdevelopment.arcana.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class thaumiumblock extends Block {

    public thaumiumblock() {
        super(Properties.create(Material.IRON)
            .sound(SoundType.METAL)
            .hardnessAndResistance(3.0f)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName("thaumiumblock");
    }
}
