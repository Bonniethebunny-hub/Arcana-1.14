package kineticdevelopment.arcana.api.spells;

import java.util.ArrayList;
import java.util.List;

import kineticdevelopment.arcana.api.spells.effects.SpellEffectEarth;

import javax.annotation.Nullable;

public class SpellEffectHandler {

    private static List<SpellEffect> effects = new ArrayList<>();


    @Nullable
    public static SpellEffect getEffect(String effectType) {
        for(SpellEffect effect : effects) {
            if(effect.getType().toString().toUpperCase().equals(effectType.toUpperCase())) {
                return effect;
            }
        }
        return null;
    }

    public void init() {
        effects.add(new SpellEffectEarth());
    }

}
