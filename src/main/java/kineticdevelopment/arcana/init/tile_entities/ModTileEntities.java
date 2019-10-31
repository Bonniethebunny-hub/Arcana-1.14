/**
 * Register all non tainted blocks
 */

package kineticdevelopment.arcana.init.tile_entities;

import kineticdevelopment.arcana.common.tile_entities.NormalNodeTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static kineticdevelopment.arcana.api.registry.ArcanaNodes.normal_node;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.normal_node_entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTileEntities {

    @SubscribeEvent
    public static void RegisterTileEntities(RegistryEvent.Register<TileEntityType<?>> event) {
        event.getRegistry().registerAll
            (
                    normal_node_entity = (TileEntityType<NormalNodeTileEntity>) TileEntityType.Builder.create(NormalNodeTileEntity::new, normal_node).build(null).setRegistryName("normal_node")
            );
    }
}
