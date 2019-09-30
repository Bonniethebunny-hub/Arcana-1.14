package kineticdevelopment.arcana.init;

import kineticdevelopment.arcana.client.container.ThaumonomiconContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModContainers
{
    @ObjectHolder("arcana:thaumonomiconcontainer")
    public static ContainerType<ThaumonomiconContainer> THAUMONOMICON_CONTAINER;

    @SubscribeEvent
    public static void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> event) {
        event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) -> {
            return new ThaumonomiconContainer(windowId, inv);
        }).setRegistryName("arcana:thaumonomiconcontainer"));
    }
}
