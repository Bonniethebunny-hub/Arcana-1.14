package kineticdevelopment.arcana.api.spells;

import kineticdevelopment.arcana.api.spells.effects.SpellEffectEarth;
import kineticdevelopment.arcana.api.spells.effects.SpellEffectFire;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class SpellEffectHandler {

    private static List<ISpellEffect> effects = new ArrayList<>();


    @Nullable
    public static ISpellEffect getEffect(String effectType) {
        for(ISpellEffect effect : effects) {
            if(effect.getName().toUpperCase().equals(effectType.toUpperCase())) {
                return effect;
            }
        }
        return null;
    }

    public static void init() {
        effects.add(new SpellEffectEarth());
        effects.add(new SpellEffectFire());
    }

}
