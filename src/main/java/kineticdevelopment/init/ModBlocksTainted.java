/**
 * Please only use for tainted blocks and nothing else.
 */

package kineticdevelopment.init;

import kineticdevelopment.api.blocks.TaintedBlock;
import kineticdevelopment.api.blocks.TaintedSlab;
import kineticdevelopment.api.blocks.TaintedStairsBlock;
import kineticdevelopment.common.blocks.ores.TaintedAmberOre;
import kineticdevelopment.common.blocks.ores.TaintedArcaniumOre;
import kineticdevelopment.common.blocks.ores.TaintedCinnabarOre;
import kineticdevelopment.common.blocks.ores.TaintedCoalOre;
import kineticdevelopment.common.blocks.ores.TaintedDiamondOre;
import kineticdevelopment.common.blocks.ores.TaintedEmeraldOre;
import kineticdevelopment.common.blocks.ores.TaintedGoldOre;
import kineticdevelopment.common.blocks.ores.TaintedIronOre;
import kineticdevelopment.common.blocks.ores.TaintedLapisOre;
import kineticdevelopment.common.blocks.ores.TaintedRubyOre;
import kineticdevelopment.common.blocks.ores.TaintedSilverOre;
import kineticdevelopment.common.blocks.tainted.TaintedCrust;
import kineticdevelopment.common.blocks.tainted.TaintedGoo;
import kineticdevelopment.common.blocks.tainted.TaintedSoil;
import kineticdevelopment.common.utils.creativetab.ArcanaItemGroup;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static kineticdevelopment.api.blocks.ArcanaBlocks.*;

import kineticdevelopment.api.blocks.ArcanaFlowerBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocksTainted {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        //Tainted Planks
        tainted_oak_planks = registerBlock(new TaintedBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "tainted_oak_planks");
        tainted_plank_stairs = registerBlock(new TaintedStairsBlock(tainted_oak_planks.getDefaultState(), Block.Properties.from(tainted_oak_planks)), "tainted_plank_stairs");
        tainted_plank_slab = registerBlock(new TaintedSlab(Block.Properties.from(tainted_oak_planks)), "tainted_plank_slab");

        //Tainted Rocks
        tainted_crust = registerBlock(new TaintedCrust(), "tainted_crust");
        tainted_crust_slab =registerBlock(new TaintedSlab(Block.Properties.from(tainted_crust)),"tainted_crust_slab");
        tainted_rock = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.STONE)), "tainted_rock");
        tainted_rock_slab = registerBlock(new TaintedSlab(Block.Properties.from(tainted_rock)), "tainted_rock_slab");
        tainted_soil = registerBlock(new TaintedSoil(), "tainted_soil");

        //Tainted Other
        tainted_sand = registerBlock(new TaintedBlock(Block.Properties.create(Material.SAND).hardnessAndResistance(0.1F,0.2F).sound(SoundType.SAND)), "tainted_sand");
        tainted_gravel = registerBlock(new TaintedBlock(Block.Properties.create(Material.CLAY).hardnessAndResistance(0.3F,0.4F).sound(SoundType.SAND)), "tainted_gravel");
        tainted_goo = registerBlock(new TaintedGoo(), "tainted_goo");
        tainted_melon = registerBlock(new Block(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.1F,0.2F).sound(SoundType.SLIME)), "tainted_melon");
        tainted_pumpkin = registerBlock(new Block(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.1F,0.2F).sound(SoundType.SLIME)), "tainted_pumpkin");
        tainted_carved_pumpkin = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.1F,0.2F).sound(SoundType.SLIME)), "tainted_carved_pumpkin");
        tainted_jack_olantern = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.1F,0.2F).sound(SoundType.SLIME)), "tainted_jack_olantern");

        //Tainted Plants
        tainted_fibers = registerBlock(new VineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "taint_fibers");
        tainted_flower = registerBlock(new ArcanaFlowerBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "tainted_flower");
        tainted_bush = registerBlock(new ArcanaFlowerBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "tainted_bush");
        tainted_mushroom = registerBlock(new ArcanaFlowerBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "tainted_mushroom");

        //Tainted Ore
        tainted_cinnabar_ore = registerBlock(new TaintedCinnabarOre(), "tainted_cinnabar_ore");
        tainted_amber_ore = registerBlock(new TaintedAmberOre(), "tainted_amber_ore");
        tainted_arcanium_ore = registerBlock(new TaintedArcaniumOre(), "tainted_arcanium_ore");
        tainted_coal_ore = registerBlock(new TaintedCoalOre(), "tainted_coal_ore");
        tainted_diamond_ore = registerBlock(new TaintedDiamondOre(), "tainted_diamond_ore");
        tainted_iron_ore = registerBlock(new TaintedIronOre(), "tainted_iron_ore");
        tainted_silver_ore = registerBlock(new TaintedSilverOre(), "tainted_silver_ore");
        tainted_ruby_ore = registerBlock(new TaintedRubyOre(), "tainted_ruby_ore");
        tainted_emerald_ore = registerBlock(new TaintedEmeraldOre(), "tainted_emerald_ore");
        tainted_gold_ore = registerBlock(new TaintedGoldOre(), "tainted_gold_ore");
        tainted_lapis_lazuli_ore = registerBlock(new TaintedLapisOre(), "tainted_lapis_ore");
        tainted_redstone_ore = registerBlock(new TaintedLapisOre(), "tainted_redstone_ore");
        tainted_destroyed_ore = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.1F, 0.2F).sound(SoundType.STONE)), "tainted_destroyed_ore");

        //tainted trees
        tainted_willow_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_willow_log");
        tainted_willow_planks = registerBlock(new TaintedBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_willow_planks");
        tainted_willow_slab = registerBlock(new TaintedSlab(Block.Properties.from(tainted_willow_planks)), "tainted_willow_slab");
        tainted_willow_stairs = registerBlock(new TaintedStairsBlock(tainted_willow_planks.getDefaultState(), Block.Properties.from(tainted_willow_planks)), "tainted_willow_stairs");
        stripped_tainted_willow_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_tainted_willow_log");
        tainted_willow_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "tainted_willow_leaves");

        tainted_greatwood_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_greatwood_log");
        tainted_greatwood_planks = registerBlock(new TaintedBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_greatwood_planks");
        tainted_greatwood_slab = registerBlock(new TaintedSlab(Block.Properties.from(tainted_greatwood_planks)), "tainted_greatwood_slab");
        tainted_greatwood_stairs = registerBlock(new TaintedStairsBlock(tainted_greatwood_planks.getDefaultState(), Block.Properties.from(tainted_greatwood_planks)), "tainted_greatwood_stairs");
        stripped_tainted_greatwood_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_tainted_greatwood_log");
        tainted_greatwood_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "tainted_greatwood_leaves");

        tainted_hawthorn_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_hawthorn_log");
        tainted_hawthorn_planks = registerBlock(new TaintedBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_hawthorn_planks");
        tainted_hawthorn_slab = registerBlock(new TaintedSlab(Block.Properties.from(tainted_hawthorn_planks)), "tainted_hawthorn_slab");
        tainted_hawthorn_stairs = registerBlock(new TaintedStairsBlock(tainted_hawthorn_planks.getDefaultState(), Block.Properties.from(tainted_greatwood_planks)), "tainted_hawthorn_stairs");
        stripped_tainted_hawthorn_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_tainted_hawthorn_log");
        tainted_hawthorn_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "tainted_hawthorn_leaves");

        tainted_oak_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "tainted_oak_log");
        tainted_oak_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "tainted_oak_leaves");
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
