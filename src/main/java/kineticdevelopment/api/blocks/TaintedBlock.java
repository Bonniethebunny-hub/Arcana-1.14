package kineticdevelopment.api.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import kineticdevelopment.api.effects.ArcanaEffects;
import kineticdevelopment.common.utils.taint.TaintSpreader;
import kineticdevelopment.init.blocks.ModBlockStates;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class TaintedBlock extends Block {
	
	public static final BooleanProperty FULLYTAINTED = ModBlockStates.FULLYTAINTED;

	public TaintedBlock(Properties properties) {
		super(properties);
		this.setDefaultState(this.getDefaultState().with(ModBlockStates.FULLYTAINTED, false));
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
	      builder.add(FULLYTAINTED);
	}
	
	@Override
    public boolean ticksRandomly(BlockState state) {
        if(state.get(ModBlockStates.FULLYTAINTED) == false) {
        	return true;
        }
        else {
        	return false;
        }
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {

        TaintSpreader.spreadTaint(worldIn, pos);
        @SuppressWarnings("unused")
		boolean surrounded = true;
        for (int x = -1; x < 2; x++) {
            for (int y = -1; y < 2; y++) {
                for (int z = -1; z < 2; z++) {
                	BlockPos nPos = pos.add(x, y, z);
                    Block b = worldIn.getBlockState(nPos).getBlock();
                    
                    if(!(b instanceof TaintedBlock) && !(b instanceof TaintedStairsBlock) && !(b instanceof TaintedSlab) && !(b instanceof AirBlock)) {
                    	surrounded = false;
                    }
                }
            }
        }
        
        if(surrounded = true) {
        	worldIn.setBlockState(pos, state.with(ModBlockStates.FULLYTAINTED, true));
        }
    }
    
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof LivingEntity) {
            LivingEntity entity = (LivingEntity) entityIn;

            entity.addPotionEffect(new EffectInstance(ArcanaEffects.tainted_effect, 60, 1, false, true));
        }
    }
    
    
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("This block will spread taint."));
    }
}
