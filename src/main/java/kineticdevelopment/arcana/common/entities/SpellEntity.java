package kineticdevelopment.arcana.common.entities;

import kineticdevelopment.arcana.api.spells.ISpellEffect;
import kineticdevelopment.arcana.api.spells.Spell;
import kineticdevelopment.arcana.common.utils.damagesource.SpellDamage;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class SpellEntity extends ProjectileItemEntity {

    private Spell spell;
    private World world;
    private LivingEntity caster;


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
    public void setWorld(World world) {
        this.world = world;
    }

    public void setCaster(LivingEntity caster) {
        this.caster = caster;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    @Override
    protected void onImpact(RayTraceResult result) {
        if(result instanceof BlockRayTraceResult) {
            BlockRayTraceResult resultBlock = (BlockRayTraceResult) result;
            for(ISpellEffect effect : spell.getEffects()) {
                effect.getEffect(resultBlock.getPos(), world , spell.getPower());
            }
            this.remove();
        }
        if(result instanceof EntityRayTraceResult) {
            EntityRayTraceResult resultEntity = (EntityRayTraceResult) result;
            if(resultEntity.getEntity() instanceof LivingEntity) {
                for(ISpellEffect effect : spell.getEffects()) {
                    effect.getEffect((LivingEntity)resultEntity.getEntity(), spell.getPower());
                    if(effect.isAttack()) {
                        resultEntity.getEntity().attackEntityFrom(new SpellDamage(spell.getName(), caster), 0);
                    }
                }
            }
            this.remove();
        }
    }

    @Override
    public void tick() {

        if(spell == null) {
            this.remove(false);
        }


        Minecraft.getInstance().player.getEntityWorld().addParticle(spell.getEffects()[0].getParticle(), this.getPositionVector().getX(), this.getPositionVector().getY(), this.getPositionVector().getZ(), 0, 0,0);
        super.tick();
    }



    @Override
    protected Item func_213885_i() {
        return Items.DIRT;
    }

}
