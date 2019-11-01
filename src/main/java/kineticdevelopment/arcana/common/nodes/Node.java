package kineticdevelopment.arcana.common.nodes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class Node extends ChestBlock {

    protected TileEntity entity;

    public Node(Properties p_i48440_1_) { super(p_i48440_1_); }

    public void removeEntity() {
        entity.remove();
    }

    @Override
    public BlockRenderType getRenderType(BlockState p_149645_1_) { return BlockRenderType.INVISIBLE; }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.create(0.25d,0.25d,0.25d,0.75d,0.75d,0.75d);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.empty();
    }

    @Override
    public boolean hasTileEntity() {
        return true;
    }

    public TileEntity setEntity(TileEntity tile) {
        entity = tile;
        return entity;
    }
}
