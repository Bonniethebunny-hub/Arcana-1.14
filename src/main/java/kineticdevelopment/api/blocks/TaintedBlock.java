package kineticdevelopment.api.blocks;

import java.util.Random;

import kineticdevelopment.api.effects.ArcanaEffects;
import kineticdevelopment.common.utils.taint.TaintSpreader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TaintedBlock extends Block {

	public TaintedBlock(Properties properties) {
		super(properties);
	}
	
	@Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {

        TaintSpreader.spreadTaint(worldIn, pos);
    }
    
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof LivingEntity) {
            LivingEntity entity = (LivingEntity) entityIn;

            //entity.addPotionEffect(new EffectInstance(ArcanaEffects.tainted_effect, 60, 1, false, true));
        }
    }
}
