package net.kineticdevelopment.arcana.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class silverwoodplanks extends Block {

    public silverwoodplanks() {
        super(Properties.create(Material.WOOD)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(3.0f)
        );
        setRegistryName("silverwoodplanks");
    }
}
