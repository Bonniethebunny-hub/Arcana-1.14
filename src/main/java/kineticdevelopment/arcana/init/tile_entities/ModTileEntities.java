/**
 * Register all non tainted blocks
 */

package kineticdevelopment.arcana.init.tile_entities;

import static kineticdevelopment.arcana.api.registry.ArcanaNodes.bright_node;
import static kineticdevelopment.arcana.api.registry.ArcanaNodes.eldritch_node;
import static kineticdevelopment.arcana.api.registry.ArcanaNodes.fading_node;
import static kineticdevelopment.arcana.api.registry.ArcanaNodes.hungry_node;
import static kineticdevelopment.arcana.api.registry.ArcanaNodes.normal_node;
import static kineticdevelopment.arcana.api.registry.ArcanaNodes.pure_node;
import static kineticdevelopment.arcana.api.registry.ArcanaNodes.tainted_node;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.bright_node_entity;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.eldritch_node_entity;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.fading_node_entity;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.hungry_node_entity;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.normal_node_entity;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.pure_node_entity;
import static kineticdevelopment.arcana.api.registry.ArcanaTileEntities.tainted_node_entity;

import kineticdevelopment.arcana.common.tile_entities.BrightNodeTileEntity;
import kineticdevelopment.arcana.common.tile_entities.EldritchNodeTileEntity;
import kineticdevelopment.arcana.common.tile_entities.FadingNodeTileEntity;
import kineticdevelopment.arcana.common.tile_entities.HungryNodeTileEntity;
import kineticdevelopment.arcana.common.tile_entities.NormalNodeTileEntity;
import kineticdevelopment.arcana.common.tile_entities.PureNodeTileEntity;
import kineticdevelopment.arcana.common.tile_entities.TaintedNodeTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTileEntities {

    @SuppressWarnings("unchecked")
	@SubscribeEvent
    public static void RegisterTileEntities(RegistryEvent.Register<TileEntityType<?>> event) {
        event.getRegistry().registerAll
            (
                    bright_node_entity      = (TileEntityType<BrightNodeTileEntity>) TileEntityType.Builder.create(BrightNodeTileEntity::new, bright_node).build(null).setRegistryName("bright_node"),
                    eldritch_node_entity    = (TileEntityType<EldritchNodeTileEntity>) TileEntityType.Builder.create(EldritchNodeTileEntity::new, eldritch_node).build(null).setRegistryName("eldritch_node"),
                    fading_node_entity      = (TileEntityType<FadingNodeTileEntity>) TileEntityType.Builder.create(FadingNodeTileEntity::new, fading_node).build(null).setRegistryName("fading_node"),
                    hungry_node_entity      = (TileEntityType<HungryNodeTileEntity>) TileEntityType.Builder.create(HungryNodeTileEntity::new, hungry_node).build(null).setRegistryName("hungry_node"),
                    normal_node_entity      = (TileEntityType<NormalNodeTileEntity>) TileEntityType.Builder.create(NormalNodeTileEntity::new, normal_node).build(null).setRegistryName("normal_node"),
                    pure_node_entity        = (TileEntityType<PureNodeTileEntity>) TileEntityType.Builder.create(PureNodeTileEntity::new, pure_node).build(null).setRegistryName("pure_node"),
                    tainted_node_entity     = (TileEntityType<TaintedNodeTileEntity>) TileEntityType.Builder.create(TaintedNodeTileEntity::new, tainted_node).build(null).setRegistryName("tainted_node")

            );
    }
}
