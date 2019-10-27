package kineticdevelopment.arcana.api.spells.effects;

import kineticdevelopment.arcana.api.aspects.Aspect;
import kineticdevelopment.arcana.api.spells.SpellEffect;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpellEffectEarth implements SpellEffect {

    @Override
    public String getName() {
        return "EARTH";
    }

    @Override
    public void getEffect(BlockPos block, World world, int power) {
        world.setBlockState(block, Blocks.GRASS_BLOCK.getDefaultState());
    }


    @Override
    public void getEffect(LivingEntity entity, int power) {
        entity.setHealth(entity.getHealth() + power );
    }

}
