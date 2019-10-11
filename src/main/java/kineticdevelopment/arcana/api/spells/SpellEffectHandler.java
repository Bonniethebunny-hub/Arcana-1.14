package kineticdevelopment.arcana.api.spells;

import java.util.ArrayList;
import java.util.List;

import kineticdevelopment.arcana.api.spells.effects.SpellEffectEarth;

public class SpellEffectHandler {

    List<SpellEffect> effects = new ArrayList<>();


    public void getEffect(String effectName) {

    }

    public void init() {
        new SpellEffectEarth();
    }

}
