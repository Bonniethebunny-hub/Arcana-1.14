package kineticdevelopment.arcana.api.blocks;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import kineticdevelopment.arcana.common.utils.taint.TaintLevelHandler;
import kineticdevelopment.arcana.common.utils.taint.TaintSpreader;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * All Arcana tainted slab blocks should extend this class
 * @see TaintedBlock
 * @see TaintedLeavesBlock
 * @see TaintedStairsBlock
 */
public class TaintedSlab extends SlabBlock {

	public TaintedSlab(Properties properties) {
		super(properties);
	}
	
	@Override
    public boolean ticksRandomly(BlockState state) {
        return true;
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
    }
}
