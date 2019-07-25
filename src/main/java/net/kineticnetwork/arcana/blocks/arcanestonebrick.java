package net.kineticnetwork.arcana.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class arcanestonebrick extends Block {

    public arcanestonebrick() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
        );
        setRegistryName("arcanestonebrick");
    }
}
