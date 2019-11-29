package kineticdevelopment.arcana.common.items.wand;

public enum CapType {

    ERROR(0,0,0),
    IRON(2, 25, 1),
    GOLD(3, 40, 2),
    THAUMIUM(6, 50, 4),
    VOID(8, 75, 4),
    COPPER(2, 30, 1),
    ELEMENTIUM(4, 40, 3),
    MANASTEEL(4, 90, 1),
    TERRASTEEL(7, 70, 3);


    private int maxPower, maxVis, maxEffects;

    CapType(int maxPower, int maxVis, int maxEffects) {
        this.maxPower = maxPower;
        this.maxVis = maxVis;
        this.maxEffects = maxEffects;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public int getMaxVis() {
        return maxVis;
    }

    public int getMaxEffects() {
        return maxEffects;
    }
}
