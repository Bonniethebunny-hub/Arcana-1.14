package net.kineticdevelopment.arcana.common.blocks;

import net.kineticdevelopment.arcana.client.gui.GuiThaumonomicon;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

public class arcaneworktable extends Block {

    public arcaneworktable() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
                .lightValue(2)
                .harvestTool(ToolType.AXE)
        );
        setRegistryName("arcaneworktable");
    }
    
    public static boolean isOpaque(VoxelShape shape) {
    	return false;
    }
    
    public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return false;
     }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {
            // TODO Change the "new GuiThaumonomicon()" to another custom mode GUI for the Arcane Workbench!! (Was set to GUITHAUMONICON just for TESTING)
            NetworkHooks.openGui((ServerPlayerEntity) player, (INamedContainerProvider) new GuiThaumonomicon());
        }

        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
}
