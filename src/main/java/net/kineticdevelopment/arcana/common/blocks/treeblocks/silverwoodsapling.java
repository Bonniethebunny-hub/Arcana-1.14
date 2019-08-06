package net.kineticdevelopment.arcana.common.blocks.treeblocks;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;


public class silverwoodsapling extends BushBlock implements IGrowable {
	public static final IntegerProperty STAGE = BlockStateProperties.STAGE_0_1;
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    
    public silverwoodsapling(Block.Properties properties) {
        super(Block.Properties.create(Material.BAMBOO_SAPLING)
                .sound(SoundType.BAMBOO_SAPLING)
                .hardnessAndResistance(3.0f)
                .doesNotBlockMovement()
        );
        this.setDefaultState(this.stateContainer.getBaseState().with(STAGE, Integer.valueOf(0)));
        setRegistryName("silverwoodsapling");
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
       return SHAPE;
    }

    @SuppressWarnings("deprecation")
	public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
       super.tick(state, worldIn, pos, random);
       if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light
       if (worldIn.getLight(pos.up()) >= 9 && random.nextInt(7) == 0) {
          this.grow(worldIn, pos, state, random);
       }

    }

    public void grow(IWorld worldIn, BlockPos pos, BlockState state, Random rand) {
    	if (state.get(STAGE) == 0) {
            worldIn.setBlockState(pos, state.cycle(STAGE), 4);
         } else {
            if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(worldIn, rand, pos)) return;
            ServerWorld worldserver = (ServerWorld) worldIn;
        	TemplateManager templatemanager = worldserver.getStructureTemplateManager();
        	Template template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood0"));;
        	int h = ThreadLocalRandom.current().nextInt(0, 7);
        	if(h==1) {template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood1"));}
        	if(h==2) {template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood2"));}
        	if(h==3) {template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood3"));}
        	if(h==4) {template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood4"));}
        	if(h==5) {template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood5"));}
        	if(h==6) {template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood6"));}
        	if(h==7) {template = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/silverwood/silverwood7"));}

        	if(template == null) {
        		Constants.LOGGER.error("Could not find structure at "+(new ResourceLocation("arcana", "trees/silverwoodtree")));
        	}
        	BlockState iblockstate = worldIn.getBlockState(pos);
        	worldserver.notifyBlockUpdate(pos, iblockstate, iblockstate, 3);
        	PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
        			.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null);

        	template.addBlocksToWorld(worldIn, pos.add(-3, -1, -3), placementsettings);
         }
    }

    /**
     * Whether this IGrowable can grow
     */
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
       return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
       return (double)worldIn.rand.nextFloat() < 0.45D;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
       this.grow(worldIn, pos, state, rand);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
       builder.add(STAGE);
    }
    
    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        worldIn.playEvent(player, 2001, pos, getStateId(state));
        if(!player.isCreative()) {
        	spawnAsEntity(worldIn, pos, new ItemStack(this));
        }
    }
    
    public static void spawnAsEntity(World worldIn, BlockPos pos, ItemStack stack) {
        if (!worldIn.isRemote && !stack.isEmpty() && worldIn.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && !worldIn.restoringBlockSnapshots) { // do not drop items while restoring blockstates, prevents item dupe
           double d0 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           double d1 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           double d2 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           ItemEntity itementity = new ItemEntity(worldIn, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack);
           itementity.setDefaultPickupDelay();
           worldIn.addEntity(itementity);
        }
    }
}
