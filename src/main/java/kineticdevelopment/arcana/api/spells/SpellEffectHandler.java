package kineticdevelopment.arcana.api.spells;

import java.util.ArrayList;
import java.util.List;

import kineticdevelopment.arcana.api.spells.effects.SpellEffectEarth;

import javax.annotation.Nullable;

public class SpellEffectHandler {

    List<SpellEffect> effects = new ArrayList<>();


    @Nullable
    public SpellEffect getEffect(String effectType) {
        for(SpellEffect effect : effects) {
            if(effect.getType().toString().toLowerCase().equals(effectType.toLowerCase())) {
                return effect;
            }
        }
        return null;
    }

    public void init() {
        effects.add(new SpellEffectEarth());
    }

}
