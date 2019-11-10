package kineticdevelopment.arcana.common.nodes;

import kineticdevelopment.arcana.client.helpers.ArcanaHelper;
import net.minecraft.block.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.server.management.PlayerInteractionManager;
import net.minecraft.stats.Stat;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.*;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

public abstract class Node extends ContainerBlock {

    protected TileEntity entity;
    protected VoxelShape shape = VoxelShapes.create(0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.75d);

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
        return shape;
    }

    public void hitboxOff() {
        this.shape = VoxelShapes.empty();
    }

    public void hitboxOn() {
        this.shape = VoxelShapes.create(0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.75d);
    }

    public void setHitboxShape(VoxelShape shape) {
        this.shape = shape;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.empty();
    }

    @Override
    public boolean hasTileEntity() {
        return true;
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        removeEntity();
        worldIn.playEvent(player, 2001, pos, getStateId(state));
    }

    public TileEntity setEntity(TileEntity tile) {
        entity = tile;
        return entity;
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return null;
    }

    public boolean onBlockActivated(BlockState p_220051_1_, World p_220051_2_, BlockPos p_220051_3_, PlayerEntity p_220051_4_, Hand p_220051_5_, BlockRayTraceResult p_220051_6_) {
        if (p_220051_2_.isRemote) {
            return true;
        } else if(ArcanaHelper.playerCanSeeNodes()){
            INamedContainerProvider lvt_7_1_ = this.getContainer(p_220051_1_, p_220051_2_, p_220051_3_);
            if (lvt_7_1_ != null) {
                p_220051_4_.openContainer(lvt_7_1_);
                p_220051_4_.addStat(this.getOpenStat());
            }

            return true;
        }
        return true;
    }

    protected Stat<ResourceLocation> getOpenStat() {
        return Stats.CUSTOM.get(Stats.OPEN_CHEST);
    }
}
