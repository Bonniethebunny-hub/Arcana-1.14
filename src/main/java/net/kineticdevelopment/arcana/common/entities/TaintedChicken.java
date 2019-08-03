package net.kineticdevelopment.arcana.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TaintedChicken extends ChickenEntity
{
	
    public TaintedChicken(EntityType<? extends ChickenEntity> type, World worldIn)
    {
        super(type, worldIn);
    }

    @Override
    protected void registerGoals()
    {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.2d));
        this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25d);
    }
    
    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }

}
