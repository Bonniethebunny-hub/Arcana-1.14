package net.kineticdevelopment.arcana.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class amberblock extends Block {

    public amberblock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
                .lightValue(2)
        );
        setRegistryName("amberblock");
    }
}
