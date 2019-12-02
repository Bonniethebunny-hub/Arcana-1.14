package kineticdevelopment.arcana.api.spells;

import kineticdevelopment.arcana.api.aspects.Aspect;
import kineticdevelopment.arcana.common.entities.SpellEntity;
import kineticdevelopment.arcana.init.ModEntities;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.nbt.CompoundNBT;

import java.util.ArrayList;
import java.util.List;

public class Spell {

    private ISpellEffect[] effects;
    private Aspect.AspectType core;
    private String name;
    private int power;

    public Spell(ISpellEffect[] effects, Aspect.AspectType core, String name, int power) {
        this.effects = effects;
        this.core = core;
        this.name = name;
        this.power = power;
    }

    public ISpellEffect[] getEffects() {
        return effects;
    }

    public Aspect.AspectType getCore() {
        return core;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void cast(PlayerEntity player) {

        switch(core) {
            case EARTH:
                for (ISpellEffect effect : effects) {
                    if (effect == null) {
                        continue;
                    }
                    if (player.getEntityWorld().getBlockState(player.getPosition()) != Blocks.AIR.getDefaultState()) {
                        effect.getEffect(player.getPosition(), player.getEntityWorld(), power);
                        effect.getEffect(player, power);
                    } else {
                        effect.getEffect(player, power);
                    }
                    //effect.getEffect(player.getPosition(), player.getEntityWorld(), power);
                }
                break;
            case AIR:
                SpellEntity entity = new SpellEntity((EntityType<ProjectileItemEntity>) ModEntities.spellProjectile, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), player.getEntityWorld());
                entity.setSpell(this);
                entity.setWorld(player.getEntityWorld());
                entity.setCaster(player);
                entity.setPosition(player.posX, player.getBoundingBox().minY + (double) player.getEyeHeight(), player.posZ);
                entity.setNoGravity(true);
                entity.shoot(player, player.rotationPitch, player.rotationYaw, 2.0F, 1.5F, 0.0F);
                player.getEntityWorld().addEntity(entity);
                break;
            case CHAOS:
                List<LivingEntity> nearbyEntities = player.getEntityWorld().getEntitiesWithinAABB(LivingEntity.class, player.getBoundingBox().expand(power, power, power));
                for (LivingEntity ent : nearbyEntities) {
                    if (ent != player) {
                        for (ISpellEffect effect : effects) {
                            effect.getEffect(ent, power);
                        }
                    }
                }
                break;
            case WATER:
                float yaw = player.rotationYaw - 12F;
                for (int i = 0; i < 5; i++) {
                    SpellEntity entity1 = new SpellEntity((EntityType<ProjectileItemEntity>) ModEntities.spellProjectile, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), player.getEntityWorld());
                    entity1.setWorld(player.getEntityWorld());
                    entity1.setSpell(this);
                    entity1.setCaster(player);
                    entity1.setPosition(player.posX, player.getBoundingBox().minY + (double) player.getEyeHeight(), player.posZ);
                    entity1.setNoGravity(true);
                    entity1.shoot(player, player.rotationPitch, yaw, 2.0F, 1.5F, 0.0F);
                    yaw = yaw + 6F;
                    player.getEntityWorld().addEntity(entity1);
                }
                break;
            case ORDER:
                List<LivingEntity> nearbyEntities1 = player.getEntityWorld().getEntitiesWithinAABB(LivingEntity.class, player.getBoundingBox().expand(power, power, power));
                for (LivingEntity ent : nearbyEntities1) {
                    if (ent != player) {
                        for (ISpellEffect effect : effects) {
                            effect.getEffect(ent, power);
                        }
                        break;
                    }
                }
                break;
        }
    }

    public CompoundNBT toNBT() {
        CompoundNBT tag = new CompoundNBT();

        StringBuilder effects = new StringBuilder();
        for (ISpellEffect effect : this.effects) {
            effects.append(effect.getName()).append(";");
        }

        tag.putString("effects", effects.toString());
        tag.putInt("power", power);
        tag.putString("core", core.toString());
        tag.putString("name", name);


        return tag;
    }

    public static Spell fromNBT(CompoundNBT spell) {
        List<ISpellEffect> effects = new ArrayList<>();
        for (String effect : spell.getString("effects").split(";")) {
            effects.add(SpellEffectHandler.getEffect(effect));
        }
        Aspect.AspectType core = Aspect.AspectType.valueOf(spell.getString("core").toUpperCase());
        int power = spell.getInt("power");
        String name = spell.getString("name");

        return new Spell((ISpellEffect[]) effects.toArray(), core, name, power);
    }

}
