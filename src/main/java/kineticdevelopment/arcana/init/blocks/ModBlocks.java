/**
 * Register all non tainted blocks
 */

package kineticdevelopment.arcana.init.blocks;

import kineticdevelopment.arcana.api.blocks.*;
import kineticdevelopment.arcana.api.blocks.ArcanaDoorBlock;
import kineticdevelopment.arcana.api.blocks.ArcanaSaplingBlock;
import kineticdevelopment.arcana.api.blocks.ArcanaStairsBlock;
import kineticdevelopment.arcana.api.blocks.ArcanaTrapDoorBlock;
import kineticdevelopment.arcana.common.trees.HawthornTree;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import kineticdevelopment.arcana.common.utils.creativetab.ArcanaItemGroup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static kineticdevelopment.arcana.api.registry.ArcanaBlocks.*;

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
        dead_slab = registerBlock(new SlabBlock(Block.Properties.from(dead_planks)), "dead_slab");
        dead_stairs = registerBlock(new ArcanaStairsBlock(dead_planks.getDefaultState(), Block.Properties.from(dead_planks)), "dead_stairs");

        trypophobius_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "trypophobius_log");
        trypophobius_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "trypophobius_planks");
        trypophobius_slab = registerBlock(new SlabBlock(Block.Properties.from(trypophobius_planks)), "trypophobius_slab");
        trypophobius_stairs = registerBlock(new ArcanaStairsBlock(trypophobius_planks.getDefaultState(), Block.Properties.from(trypophobius_planks)), "trypophobius_stairs");

        hawthorn_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "hawthorn_log");
        hawthorn_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "hawthorn_planks");
        hawthorn_slab = registerBlock(new SlabBlock(Block.Properties.from(hawthorn_planks)), "hawthorn_slab");
        hawthorn_stairs = registerBlock(new ArcanaStairsBlock(hawthorn_planks.getDefaultState(), Block.Properties.from(hawthorn_planks)), "hawthorn_stairs");
        stripped_hawthorn_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_hawthorn_log");
        hawthorn_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "hawthorn_leaves");
        hawthorn_trapdoor = registerBlock(new ArcanaTrapDoorBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "hawthorn_trapdoor");
        hawthorn_door = registerBlock(new ArcanaDoorBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "hawthorn_door");
        hawthorn_sapling = registerBlock(new ArcanaSaplingBlock(new HawthornTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "hawthorn_sapling");

        // regular ores
        amber_ore = registerBlock(new OreBlock(Block.Properties.create(Material.ROCK)), "amber_ore");

        //statues
        hear_no_evil = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "hear_no_evil");
        speak_no_evil = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "speak_no_evil");
        see_no_evil = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "see_no_evil");

        //node
        bright_node = registerBlock(new ArcanaFlowerBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "bright_node");
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
