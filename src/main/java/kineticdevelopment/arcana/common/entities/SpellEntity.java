package kineticdevelopment.arcana.common.entities;

import kineticdevelopment.arcana.api.spells.Spell;
import kineticdevelopment.arcana.api.spells.SpellEffect;
import kineticdevelopment.arcana.core.Arcana;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.AbstractFireballEntity;
import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;

public class SpellEntity extends ProjectileItemEntity {

    private SpellEffect effect;
    private int power;

    public SpellEntity(EntityType<? extends ProjectileItemEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public SpellEntity(EntityType<? extends ProjectileItemEntity> type, double x, double y, double z, World worldIn) {
        super(type, x, y, z, worldIn);
    }

    public SpellEntity(EntityType<? extends ProjectileItemEntity> type, LivingEntity livingEntityIn, World worldIn) {
        super(type, livingEntityIn, worldIn);
    }



    @Override
    protected void onImpact(RayTraceResult result) {
        if(result instanceof BlockRayTraceResult) {
            BlockRayTraceResult resultBlock = (BlockRayTraceResult) result;
            //effect.getEffect(resultBlock.getPos(), resultBlock.get, power);
        }
        if(result instanceof EntityRayTraceResult) {
            EntityRayTraceResult resultEntity = (EntityRayTraceResult) result;
            if(resultEntity.getEntity() instanceof LivingEntity) {
                effect.getEffect((LivingEntity)resultEntity.getEntity(), power);
            }
        }
    }

    public void setEffect(SpellEffect effect) {
        this.effect = effect;
    }


    @Override
    protected Item func_213885_i() {
        return Items.DIRT;
    }

}
