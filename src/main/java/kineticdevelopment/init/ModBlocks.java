/**
 * Register all non tainted blocks
 */

package kineticdevelopment.init;

import kineticdevelopment.common.blocks.ArcanaStairsBlock;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.Tree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import kineticdevelopment.common.utils.creativetab.ArcanaItemGroup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static kineticdevelopment.api.blocks.ArcanaBlocks.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        //arcane stone
        arcane_stone = registerBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.STONE)), "arcane_stone");
        arcane_stone_slab = registerBlock(new SlabBlock(Block.Properties.from(arcane_stone)), "arcane_stone_slab");
        arcane_stone_stairs = registerBlock(new ArcanaStairsBlock(arcane_stone.getDefaultState(), Block.Properties.from(arcane_stone)), "arcane_stone_stairs");
        arcane_stone_bricks = registerBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.STONE)),"arcane_stone_bricks");
        arcane_stone_bricks_slab = registerBlock(new SlabBlock(Block.Properties.from(arcane_stone_bricks)), "arcane_stone_bricks_slab");
        arcana_stone_bricks_stairs = registerBlock(new ArcanaStairsBlock(arcane_stone_bricks.getDefaultState(), Block.Properties.from(arcane_stone_bricks)), "arcane_stone_bricks_stairs");
        infusion_arcane_stone = registerBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.STONE).lightValue(10)), "infusion_arcane_stone");

        //trees
        dead_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "dead_log");
        dead_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "dead_planks");

        trypophobius_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "trypophobius_log");
        trypophobius_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "trypophobius_planks");

        tainted_willow_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_willow_log");
        tainted_willow_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_willow_planks");
        stripped_tainted_willow_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_tainted_willow_log");
        tainted_willow_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES)), "tainted_willow_leaves");

        tainted_greatwood_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_greatwood_log");
        tainted_greatwood_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_greatwood_planks");
        stripped_tainted_greatwood_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_tainted_greatwood_log");
        tainted_greatwood_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES)), "tainted_greatwood_leaves");
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
