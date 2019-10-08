package kineticdevelopment.arcana.api.blocks;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nullable;

import kineticdevelopment.arcana.api.effects.ArcanaEffects;
import kineticdevelopment.arcana.init.blocks.ModBlockStates;
import kineticdevelopment.arcana.common.utils.taint.TaintLevelHandler;
import kineticdevelopment.arcana.common.utils.taint.TaintSpreader;
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

/**
 * All Arcana tainted blocks should extend this class
 * @see TaintedLeavesBlock
 * @see TaintedSlab
 * @see TaintedStairsBlock
 */
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
        
    	int h = 0;
    	int f = (int) TaintLevelHandler.getTaintLevel(worldIn);
    	
    	if(f >=5 && f <=9) {
    		h = ThreadLocalRandom.current().nextInt(0, 10);
    	}
    	else if(f >=10 && f >=19) {
    		h = ThreadLocalRandom.current().nextInt(0, 9);
    	}
    	else if(f >=20 && f >=29) {
    		h = ThreadLocalRandom.current().nextInt(0, 8);
    	}
    	else if(f >=30 && f >=39) {
    		h = ThreadLocalRandom.current().nextInt(0, 7);
    	}
    	else if(f >=40 && f >=49) {
    		h = ThreadLocalRandom.current().nextInt(0, 6);
    	}
    	else if(f >=50 && f >=59) {
    		h = ThreadLocalRandom.current().nextInt(0, 5);
    	}
    	else if(f >=60 && f >=69) {
    		h = ThreadLocalRandom.current().nextInt(0, 4);
    	}
    	else if(f >=70 && f >=79) {
    		h = ThreadLocalRandom.current().nextInt(0, 3);
    	}
    	else if(f >=80 && f >=89) {
    		h = ThreadLocalRandom.current().nextInt(0, 2);
    	}
    	else if(f >=90 && f >=99) {
    		h = ThreadLocalRandom.current().nextInt(0, 1);
    	}
    	else if(f >=100) {
    		h = 1;
    	}
    	
    	if(h == 1) {
    		TaintSpreader.spreadTaint(worldIn, pos);
    	}
    	
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
        
        if(surrounded == true) {
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
