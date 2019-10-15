package kineticdevelopment.arcana.core;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;


public class CommonProxy {

    public CommonProxy(){

    }
    public World getEntityWorld(Entity entity) {
        return entity.getEntityWorld();
    }
}

//Add particles here
