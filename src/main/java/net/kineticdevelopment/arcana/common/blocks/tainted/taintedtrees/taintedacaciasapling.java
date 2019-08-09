package net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees;

import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class taintedacaciasapling extends BushBlock implements IGrowable {
    public static final IntegerProperty STAGE = BlockStateProperties.STAGE_0_1;
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);

    public taintedacaciasapling(Properties properties) {
        super(Properties.create(Material.BAMBOO_SAPLING)
            .sound(SoundType.BAMBOO_SAPLING)
            .hardnessAndResistance(3.0f)
        );
        this.setDefaultState(this.stateContainer.getBaseState().with(STAGE, Integer.valueOf(0)));
        setRegistryName("taintedacaciasapling");
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @SuppressWarnings("deprecation")
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        super.tick(state, worldIn, pos, random);
        if (!worldIn.isAreaLoaded(pos, 1))
            return; // Forge: prevent loading unloaded chunks when checking neighbor's light
        if (worldIn.getLight(pos.up()) >= 9 && random.nextInt(7) == 0) {
            this.grow(worldIn, pos, state, random);
        }

    }

    public void grow(IWorld worldIn, BlockPos pos, BlockState state, Random rand) {
        ServerWorld worldserver = (ServerWorld) worldIn;
        TemplateManager templatemanager = worldserver.getStructureTemplateManager();
        Template template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/dairtree"));

        if (template == null) {
            Constants.LOGGER.error("Could not find structure at " + new ResourceLocation("arcana:structures/trees/silverwoodtree"));
        }
        BlockState iblockstate = worldIn.getBlockState(pos);
        worldserver.notifyBlockUpdate(pos, iblockstate, iblockstate, 3);
        PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
            .setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk(null);

        template.addBlocksToWorld(worldIn, pos.add(-4, 0, -4), placementsettings);
    }

    /**
     * Whether this IGrowable can grow
     */
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return (double) worldIn.rand.nextFloat() < 0.45D;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
        this.grow(worldIn, pos, state, rand);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STAGE);
    }
}
