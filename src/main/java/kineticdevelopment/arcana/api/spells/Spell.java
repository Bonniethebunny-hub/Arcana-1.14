package kineticdevelopment.arcana.api.spells;

import kineticdevelopment.arcana.api.aspects.Aspect;
import net.minecraft.entity.player.PlayerEntity;

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
                effect.getEffect(player, power);
                effect.getEffect(player.getEntityWorld().getBlockState(player.getPosition()), power);
            }
        }
        if(core == Aspect.AspectType.AIR) {

        }
    }


}
