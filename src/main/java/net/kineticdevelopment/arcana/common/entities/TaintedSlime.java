package net.kineticdevelopment.arcana.common.entities;

import net.kineticdevelopment.arcana.common.init.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.world.World;

public class TaintedSlime extends SlimeEntity
{
    @SuppressWarnings("uncleared")
    public TaintedSlime(EntityType<? extends SlimeEntity> type, World worldIn)
    {
        super((EntityType<? extends SlimeEntity>) ModEntities.ARCANA_TAINTED_SLIME, worldIn);
    }

    @Override
    protected void registerGoals()
    {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25d);
    }
}
