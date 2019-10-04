/**
 * Please only use for tainted blocks and nothing else.
 */

package kineticdevelopment.arcana.init.blocks;

import kineticdevelopment.arcana.api.blocks.*;
import kineticdevelopment.arcana.api.blocks.ArcanaFlowerBlock;
import kineticdevelopment.arcana.api.blocks.ArcanaStairsBlock;
import kineticdevelopment.arcana.api.blocks.TaintedBlock;
import kineticdevelopment.arcana.api.blocks.TaintedSlab;
import kineticdevelopment.arcana.common.blocks.tainted.TraintedJackOLatern;
import kineticdevelopment.arcana.common.blocks.ores.*;
import kineticdevelopment.arcana.common.blocks.tainted.*;
import kineticdevelopment.arcana.common.utils.creativetab.ArcanaItemGroup;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static kineticdevelopment.arcana.api.registry.ArcanaBlocks.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocksUnTainted {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        //Tainted Planks
        untainted_oak_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "untainted_oak_planks");
        untainted_plank_stairs = registerBlock(new ArcanaStairsBlock(untainted_oak_planks.getDefaultState(), Block.Properties.from(untainted_oak_planks)), "untainted_plank_stairs");
        untainted_plank_slab = registerBlock(new SlabBlock(Block.Properties.from(untainted_oak_planks)), "untainted_plank_slab");

        //Tainted Rocks
        untainted_rock = registerBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.STONE)), "untainted_rock");
        untainted_rock_slab = registerBlock(new SlabBlock(Block.Properties.from(untainted_rock)), "untainted_rock_slab");

        //Tainted Other
        untainted_sand = registerBlock(new Block(Block.Properties.create(Material.SAND).hardnessAndResistance(0.1F,0.2F).sound(SoundType.SAND)), "untainted_sand");
        untainted_gravel = registerBlock(new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(0.3F,0.4F).sound(SoundType.SAND)), "untainted_gravel");
        untainted_melon = registerBlock(new Block(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.1F,0.2F).sound(SoundType.SLIME)), "untainted_melon");
        untainted_pumpkin = registerBlock(new Block(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.1F,0.2F).sound(SoundType.SLIME)), "untainted_pumpkin");
        untainted_carved_pumpkin = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.1F,0.2F).sound(SoundType.SLIME)), "untainted_carved_pumpkin");
        untainted_jack_olantern = registerBlock(new TraintedJackOLatern(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.1F,0.2F).sound(SoundType.SLIME)), "untainted_jack_olantern");

        //Tainted Plants
        untainted_fibers = registerBlock(new VineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "untaint_fibers");
        untainted_flower = registerBlock(new ArcanaFlowerBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "untainted_flower");
        untainted_bush = registerBlock(new ArcanaFlowerBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "untainted_bush");
        untainted_mushroom = registerBlock(new ArcanaFlowerBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.PLANT)), "untainted_mushroom");

        //tainted trees
        untainted_willow_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_willow_log");
        untainted_willow_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_willow_planks");
        untainted_willow_slab = registerBlock(new SlabBlock(Block.Properties.from(untainted_willow_planks)), "untainted_willow_slab");
        untainted_willow_stairs = registerBlock(new ArcanaStairsBlock(untainted_willow_planks.getDefaultState(), Block.Properties.from(untainted_willow_planks)), "untainted_willow_stairs");
        stripped_untainted_willow_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_untainted_willow_log");
        untainted_willow_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "untainted_willow_leaves");

        untainted_greatwood_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_greatwood_log");
        untainted_greatwood_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_greatwood_planks");
        untainted_greatwood_slab = registerBlock(new SlabBlock(Block.Properties.from(untainted_greatwood_planks)), "untainted_greatwood_slab");
        untainted_greatwood_stairs = registerBlock(new ArcanaStairsBlock(untainted_greatwood_planks.getDefaultState(), Block.Properties.from(untainted_greatwood_planks)), "untainted_greatwood_stairs");
        stripped_untainted_greatwood_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_untainted_greatwood_log");
        untainted_greatwood_leaves = registerBlock(new Block(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "untainted_greatwood_leaves");

        untainted_hawthorn_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_hawthorn_log");
        untainted_hawthorn_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_hawthorn_planks");
        untainted_hawthorn_slab = registerBlock(new SlabBlock(Block.Properties.from(tainted_hawthorn_planks)), "untainted_hawthorn_slab");
        untainted_hawthorn_stairs = registerBlock(new ArcanaStairsBlock(tainted_hawthorn_planks.getDefaultState(), Block.Properties.from(tainted_greatwood_planks)), "untainted_hawthorn_stairs");
        stripped_untainted_hawthorn_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "stripped_untainted_hawthorn_log");
        untainted_hawthorn_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "untainted_hawthorn_leaves");

        untainted_oak_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_oak_log");
        untainted_oak_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "untainted_oak_leaves");

        untainted_acacia_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_acacia_log");
        untainted_acacia_planks = registerBlock(new TaintedBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_acacia_planks");
        //untainted_acacia_slab = registerBlock(new TaintedSlab(Block.Properties.from(untainted_acacia_planks)), "untainted_acacia_slab");
        untainted_acacia_stairs = registerBlock(new TaintedStairsBlock(tainted_acacia_planks.getDefaultState(), Block.Properties.from(untainted_acacia_planks)), "untainted_acacia_stairs");
        untainted_stripped_acacia_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_stripped_acacia_log");
        untainted_acacia_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "untainted_acacia_leaves");

        untainted_spruce_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_spruce_log");
        untainted_spruce_planks = registerBlock(new TaintedBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_spruce_planks");
        //untainted_spruce_slab = registerBlock(new TaintedSlab(Block.Properties.from(untainted_spruce_planks)), "untainted_spruce_slab");
        untainted_spruce_stairs = registerBlock(new TaintedStairsBlock(tainted_spruce_planks.getDefaultState(), Block.Properties.from(untainted_spruce_planks)), "untainted_spruce_stairs");
        untainted_stripped_spruce_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_stripped_spruce_log");
        untainted_spruce_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "untainted_spruce_leaves");

        untainted_dair_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_dair_log");
        untainted_dair_planks = registerBlock(new TaintedBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_dair_planks");
        //untainted_dair_slab = registerBlock(new TaintedSlab(Block.Properties.from(untainted_dair_planks)), "untainted_dair_slab");
        untainted_dair_stairs = registerBlock(new TaintedStairsBlock(tainted_dair_planks.getDefaultState(), Block.Properties.from(untainted_dair_planks)), "untainted_dair_stairs");
        untainted_stripped_dair_log = registerBlock(new LogBlock(MaterialColor.AIR, Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)), "untainted_stripped_dair_log");
        untainted_dair_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT)), "untainted_dair_leaves");

        //Full mat. blocks
        untainted_redstone_block = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.METAL)), "untainted_redstone_block");
        untainted_thaumium_block = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.METAL)), "untainted_thaumium_block");
        untainted_lapis_block = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.STONE)), "untainted_lapis_block");
        untainted_iron_block = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.METAL)), "untainted_iron_block");
        untainted_gold_block = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.METAL)), "untainted_gold_block");
        untainted_emerald_block = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.METAL)), "untainted_emerald_block");
        untainted_diamond_block = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.METAL)), "untainted_diamond_block");
        untainted_coal_block = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.STONE)), "untainted_coal_block");
        untainted_arcanium_block = registerBlock(new TaintedBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F,6.0F).sound(SoundType.METAL)), "untainted_arcanium_block");
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
