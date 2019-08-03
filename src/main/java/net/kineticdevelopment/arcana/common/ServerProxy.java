package net.kineticdevelopment.arcana.common;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {
    public void preInit() {

    }

    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this on the client!");
    }
}
