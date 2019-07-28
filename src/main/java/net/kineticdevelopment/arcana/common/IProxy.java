package net.kineticdevelopment.arcana.common;

import net.minecraft.world.World;

public interface IProxy
{
    void init();

    World getClientWorld();
}
