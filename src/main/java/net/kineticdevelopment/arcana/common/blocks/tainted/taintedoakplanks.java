package net.kineticdevelopment.arcana.common.blocks.tainted;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class taintedoakplanks extends Block {

    public taintedoakplanks() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
                .lightValue(2)
                .harvestTool(ToolType.AXE)
        );
        setRegistryName("taintedoakplanks");
    }
<<<<<<< HEAD


    public static void spawnAsEntity(World worldIn, BlockPos pos, ItemStack stack) {
        if (!worldIn.isRemote && !stack.isEmpty() && worldIn.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && !worldIn.restoringBlockSnapshots) { // do not drop items while restoring blockstates, prevents item dupe
            double d0 = (double) (worldIn.rand.nextFloat() * 0.5F) + 0.25D;
            double d1 = (double) (worldIn.rand.nextFloat() * 0.5F) + 0.25D;
            double d2 = (double) (worldIn.rand.nextFloat() * 0.5F) + 0.25D;
            ItemEntity itementity = new ItemEntity(worldIn, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, stack);
            itementity.setDefaultPickupDelay();
            worldIn.addEntity(itementity);
        }
    }

=======
    
>>>>>>> parent of 316aa72... Reformat code to be consistent, remove debugging taint conversion
    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        worldIn.playEvent(player, 2001, pos, getStateId(state));
        if(!player.isCreative()) {
        	spawnAsEntity(worldIn, pos, new ItemStack(this));
        }
    }
    
    public static void spawnAsEntity(World worldIn, BlockPos pos, ItemStack stack) {
        if (!worldIn.isRemote && !stack.isEmpty() && worldIn.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && !worldIn.restoringBlockSnapshots) { // do not drop items while restoring blockstates, prevents item dupe
           double d0 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           double d1 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           double d2 = (double)(worldIn.rand.nextFloat() * 0.5F) + 0.25D;
           ItemEntity itementity = new ItemEntity(worldIn, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack);
           itementity.setDefaultPickupDelay();
           worldIn.addEntity(itementity);
        }
    }
}
