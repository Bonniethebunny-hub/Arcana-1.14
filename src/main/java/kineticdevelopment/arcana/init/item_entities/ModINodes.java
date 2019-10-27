/**
 * All items should be listed here.
 */

package kineticdevelopment.arcana.init.item_entities;


import kineticdevelopment.arcana.api.registry.ArcanaNodes;
import kineticdevelopment.arcana.common.utils.creativetab.ArcanaItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static kineticdevelopment.arcana.init.item_entities.ModItems.location;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModINodes {

    /**Nodes will be added as items, and then displayed as holograms. Will also allow players got get there hands on the nodes, so they
     * can add them to their world, if in creative.
     *
     **/

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent<Block> event)
    {
        ArcanaNodes.normal_node = registerBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.METAL)), "normal_node");
    }

    public static Block registerBlock(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(ArcanaItemGroup.instance));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }

    public static Block registerBlock(Block block, BlockItem itemBlock, String name) {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);

        if (itemBlock != null) {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);
        }

        return block;
    }
}
