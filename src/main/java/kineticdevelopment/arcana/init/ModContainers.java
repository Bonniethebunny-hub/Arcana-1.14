package kineticdevelopment.arcana.init;

import kineticdevelopment.arcana.client.container.FociForgeContainer;
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

    @ObjectHolder("arcana:fociforgecontainer")
    public static ContainerType<FociForgeContainer> FOCIFORGE_CONTAINER;

    @SubscribeEvent
    public static void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> event) {
        event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) -> new ThaumonomiconContainer(windowId, inv)).setRegistryName("arcana:thaumonomiconcontainer"));

        event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) -> new FociForgeContainer(windowId, inv)).setRegistryName("arcana:fociforgecontainer"));
    }
}
