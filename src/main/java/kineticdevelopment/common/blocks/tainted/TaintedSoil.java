package kineticdevelopment.common.blocks.tainted;

import java.util.Random;

import kineticdevelopment.common.utils.taint.TaintSpreader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class TaintedSoil extends Block {
    public TaintedSoil() {
        super(Block.Properties.create(Material.EARTH)
                .sound(SoundType.WET_GRASS)
                .hardnessAndResistance(0.1f)
        );

    }
    
    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
       return true;
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