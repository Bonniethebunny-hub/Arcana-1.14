package kineticdevelopment.init;

import kineticdevelopment.common.blocks.ArcanaStairsBlock;
import kineticdevelopment.common.utils.ArcanaItemGroup;
import kineticdevelopment.common.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;



import static kineticdevelopment.api.blocks.ArcanaBlocks.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocksTainted {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        //Tainted Tree Blocks
        tainted_oak_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "tainted_oak_planks");
        tainted_plank_stairs = registerBlock(new ArcanaStairsBlock(tainted_oak_planks.getDefaultState(), Block.Properties.from(tainted_oak_planks)), "tainted_plank_stairs");
        tainted_plank_slab = registerBlock(new SlabBlock(Block.Properties.from(tainted_oak_planks)), "tainted_plank_slab");

        //Tainted
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
