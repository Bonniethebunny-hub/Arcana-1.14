package kineticdevelopment.arcana.api.spells;

import kineticdevelopment.arcana.api.aspects.Aspect;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;

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
                effect.getEffect(player, power);
                effect.getEffect(player.getPosition(), player.getEntityWorld(), power);
            }
        }
        if(core == Aspect.AspectType.AIR) {

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
