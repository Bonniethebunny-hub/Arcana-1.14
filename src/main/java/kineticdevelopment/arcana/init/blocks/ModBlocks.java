/**
 * Register all non tainted blocks
 */

package kineticdevelopment.arcana.init.blocks;

import kineticdevelopment.arcana.api.blocks.*;
import kineticdevelopment.arcana.api.blocks.ArcanaDoorBlock;
import kineticdevelopment.arcana.api.blocks.ArcanaSaplingBlock;
import kineticdevelopment.arcana.api.blocks.ArcanaStairsBlock;
import kineticdevelopment.arcana.api.blocks.ArcanaTrapDoorBlock;
import kineticdevelopment.arcana.common.blocks.with_function.Aspect_Bookshelf;
import kineticdevelopment.arcana.common.blocks.with_function.Crucible;
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

        dair_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "dair_log");
        dair_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "dair_planks");
        dair_slab = registerBlock(new SlabBlock(Block.Properties.from(dair_planks)), "dair_slab");
        dair_stairs = registerBlock(new ArcanaStairsBlock(dair_planks.getDefaultState(), Block.Properties.from(dair_planks)), "dair_stairs");
        stripped_dair_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_dair_log");
        dair_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "dair_leaves");
        //dair_trapdoor = registerBlock(new ArcanaTrapDoorBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "dair_trapdoor");
        //dair_door = registerBlock(new ArcanaDoorBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "dair_door");
        //dair_sapling = registerBlock(new ArcanaSaplingBlock(new DairTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "dair_sapling");

        greatwood_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "greatwood_log");
        greatwood_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "greatwood_planks");
        greatwood_slab = registerBlock(new SlabBlock(Block.Properties.from(greatwood_planks)), "greatwood_slab");
        greatwood_stairs = registerBlock(new ArcanaStairsBlock(greatwood_planks.getDefaultState(), Block.Properties.from(greatwood_planks)), "greatwood_stairs");
        stripped_greatwood_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_greatwood_log");
        greatwood_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "greatwood_leaves");
        //greatwood_trapdoor = registerBlock(new ArcanaTrapDoorBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "greatwood_trapdoor");
        //greatwood_door = registerBlock(new ArcanaDoorBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "greatwood_door");
        //greatwood_sapling = registerBlock(new ArcanaSaplingBlock(new DairTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "greatwood_sapling");

        willow_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "willow_log");
        willow_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "willow_planks");
        willow_slab = registerBlock(new SlabBlock(Block.Properties.from(willow_planks)), "willow_slab");
        willow_stairs = registerBlock(new ArcanaStairsBlock(willow_planks.getDefaultState(), Block.Properties.from(willow_planks)), "willow_stairs");
        stripped_willow_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_willow_log");
        willow_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "willow_leaves");
        //willow_trapdoor = registerBlock(new ArcanaTrapDoorBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "willow_trapdoor");
        //willow_door = registerBlock(new ArcanaDoorBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "willow_door");
        //willow_sapling = registerBlock(new ArcanaSaplingBlock(new DairTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "willow_sapling");

        // regular ores
        amber_ore = registerBlock(new OreBlock(Block.Properties.create(Material.ROCK)), "amber_ore");

        //statues
        hear_no_evil = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "hear_no_evil");
        //speak_no_evil = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "speak_no_evil");
        //see_no_evil = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "see_no_evil");

        //mat. blocks
        arcanium_block = registerBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.METAL)), "arcanium_block");
        thaumium_block = registerBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.METAL)), "thaumium_block");
        magical_grass = registerBlock(new Block(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5F, 0.5F).sound(SoundType.GROUND)), "magical_grass");
        magical_forest_grass = registerBlock(new ArcanaFlowerBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F, 0.0F).sound(SoundType.PLANT)), "magical_forest_grass");


        //taint scrubber
        //This is a just place holder to add the models into the game.
        taint_booster = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.METAL)), "taint_booster");
        taint_bore = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.METAL)), "taint_bore");
        taint_scrubber = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.METAL)), "taint_scrubber");
        taint_scrubber_mk2 = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.METAL)), "taint_scrubber_mk2");
        taint_sucker = registerBlock(new ArcanaRotatableBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F,3.0F).sound(SoundType.METAL)), "taint_sucker");

        //objects with function
        crucible = registerBlock(new Crucible(), "crucible");
        aspect_bookshelf = registerBlock(new Aspect_Bookshelf(), "aspect_bookshelf");
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
