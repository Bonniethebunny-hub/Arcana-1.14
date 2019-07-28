package net.kineticdevelopment.arcana.common.init;

import net.kineticdevelopment.arcana.client.container.ThaumonomiconContainer;
import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.registries.ObjectHolder;

public class ModContainer
{
    @ObjectHolder("arcana:thaumonomiconcontainer")
    public static ContainerType<ThaumonomiconContainer> THAUMONOMICON_CONTAINER;
}
