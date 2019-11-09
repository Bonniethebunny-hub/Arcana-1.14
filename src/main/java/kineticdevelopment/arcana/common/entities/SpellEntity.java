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
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;

public class SpellEntity extends ProjectileItemEntity {

    private SpellEffect[] effects;
    private int power;
    private World world;

    public SpellEntity(EntityType<? extends ProjectileItemEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public SpellEntity(EntityType<? extends ProjectileItemEntity> type, double x, double y, double z, World worldIn) {
        super(type, x, y, z, worldIn);
    }

    public SpellEntity(EntityType<? extends ProjectileItemEntity> type, LivingEntity livingEntityIn, World worldIn) {
        super(type, livingEntityIn, worldIn);
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void setWorld(World world) {
        this.world = world;
    }

    @Override
    protected void onImpact(RayTraceResult result) {
        if(result instanceof BlockRayTraceResult) {
            BlockRayTraceResult resultBlock = (BlockRayTraceResult) result;
            for(SpellEffect effect : effects) {
                effect.getEffect(resultBlock.getPos(), world , power);
            }
            this.remove();
        }
        if(result instanceof EntityRayTraceResult) {
            EntityRayTraceResult resultEntity = (EntityRayTraceResult) result;
            if(resultEntity.getEntity() instanceof LivingEntity) {
                for(SpellEffect effect : effects) {
                    effect.getEffect((LivingEntity)resultEntity.getEntity(), power);
                }
            }
            this.remove();
        }
    }

    @Override
    public void tick() {


        super.tick();
    }

    public void setEffects(SpellEffect[] effects) {
        this.effects = effects;
    }


    @Override
    protected Item func_213885_i() {
        return Items.DIRT;
    }

}
