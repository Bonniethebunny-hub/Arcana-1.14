package kineticdevelopment.arcana.api.spells;

import kineticdevelopment.arcana.api.spells.effects.SpellEffectEarth;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class SpellEffectHandler {

    List<SpellEffect> effects = new ArrayList<>();


    public void getEffect(String effectName) {

    }

    public void init() {
        new SpellEffectEarth();
    }

}
