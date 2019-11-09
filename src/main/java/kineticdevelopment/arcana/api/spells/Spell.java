package kineticdevelopment.arcana.api.spells;

import kineticdevelopment.arcana.api.aspects.Aspect;
import kineticdevelopment.arcana.common.entities.SpellEntity;
import kineticdevelopment.arcana.init.ModEntities;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.command.arguments.EntityAnchorArgument;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;

public class Spell {

    private SpellEffect[] effects;
    private Aspect.AspectType core;
    private String name;
    private int power;

    public Spell(SpellEffect[] effects, Aspect.AspectType core, String name, int power) {
        this.effects = effects;
        this.core = core;
        this.name = name;
        this.power = power;
    }


    public void cast(PlayerEntity player) {
        if(core == Aspect.AspectType.EARTH) {
            for(SpellEffect effect : effects) {
                if(effect == null) {
                    continue;
                }
                if(Minecraft.getInstance().objectMouseOver instanceof BlockRayTraceResult) {
                    if(player.getEntityWorld().getBlockState(((BlockRayTraceResult) Minecraft.getInstance().objectMouseOver).getPos()) != Blocks.AIR.getDefaultState()) {
                        effect.getEffect(((BlockRayTraceResult) Minecraft.getInstance().objectMouseOver).getPos(), player.getEntityWorld(), power);
                    } else {
                        effect.getEffect(player, power);
                    }
                }
                //effect.getEffect(player.getPosition(), player.getEntityWorld(), power);
            }
        }
        if(core == Aspect.AspectType.AIR) {
            SpellEntity entity = new SpellEntity((EntityType<ProjectileItemEntity>) ModEntities.spellProjectile,  player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), player.getEntityWorld());
            entity.setEffects(effects);
            entity.setWorld(player.getEntityWorld());
            entity.setPower(power);
            Vec3d newVel = entity.getLookVec().add(20, -0.4, 20);
            entity.setVelocity(newVel.getX(), newVel.getY(), newVel.getZ());
            player.getEntityWorld().addEntity(entity);
        }
    }

    public CompoundNBT toNBT() {
        CompoundNBT tag = new CompoundNBT();

        StringBuilder effects = new StringBuilder();
        for(SpellEffect effect : this.effects) {
            effects.append(effect.getName()).append(";");
        }

        tag.putString("effects", effects.toString());
        tag.putInt("power", power);
        tag.putString("core", core.toString());
        tag.putString("name", name);


        return tag;
    }

    public static Spell fromNBT(CompoundNBT spell) {
        List<SpellEffect> effects = new ArrayList<>();
        for(String effect : spell.getString("effects").split(";")) {
            effects.add(SpellEffectHandler.getEffect(effect));
        }
        Aspect.AspectType core = Aspect.AspectType.valueOf(spell.getString("core").toUpperCase());
        int power = spell.getInt("power");
        String name = spell.getString("name");

        return new Spell((SpellEffect[]) effects.toArray(), core, name, power);
    }

}
