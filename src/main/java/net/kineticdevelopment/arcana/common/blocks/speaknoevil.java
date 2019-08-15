package net.kineticdevelopment.arcana.common.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class speaknoevil extends Block {
    public speaknoevil() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(3.0f)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName("speaknoevil");
    }

    @Override
    public boolean isSolid(BlockState state) {
        return false;
    }
}
