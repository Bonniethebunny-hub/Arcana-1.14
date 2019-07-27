package net.kineticdevelopment.arcana.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class taintedsoil extends Block{
    public taintedsoil() {
        super(Block.Properties.create(Material.IRON).sound(SoundType.STONE).hardnessAndResistance(3.0f));
        setRegistryName("taintedsoil");
    }
}
