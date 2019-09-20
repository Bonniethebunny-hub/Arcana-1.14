package kineticdevelopment.api.aspects;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class AspectHandler {

    private static List<Aspect> aspects = new ArrayList<>();

    public static class Aspect {
        AspectType type;
        Item item;
        public Aspect(AspectType type, Item item) {
            this.type = type;
            this.item = item;
            AspectHandler.aspects.add(this);
        }

        public AspectType getType() {
            return type;
        }

    }

    public static List<Aspect> getAspects() {
        return aspects;
    }

    public static enum AspectType {
        AIR,
        FIRE,
        WATER,
        EARTH,
        ORDER,
        CHAOS,
        COLD,
        LIGHT,
        MOTION,
        TRANSMUTATION,
        STRENGTH,
        WEATHER,
        VOID,
        POISON,
        LIFE,
        CRYSTAL,
        BEAST,
        GLUTTONY,
        PLANTS,
        JOURNEY,
        SLIME,
        METAL,
        DEATH,
        MANA,
        DARKNESS,
        IMPRISON,
        FLIGHT,
        ELDRITCH,
        NETHER,
        WOOD,
        AURA,
        FLESH,
        UNDEAD,
        SPIRIT,
        TAINT,
        MIND,
        LUST,
        SLOTH,
        SENSES,
        END,
        MAN,
        WRATH,
        ENVY,
        PRIDE,
        TOOL,
        GREED,
        CROP,
        MINE,
        CRAFTING,
        MECHANISM,
        HARVEST,
        FABRIC,
        WEAPON,
        ARMOR
    }
}



