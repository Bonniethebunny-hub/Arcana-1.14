package net.kineticdevelopment.arcana.common.blocks.tainted.ores;

import net.kineticdevelopment.arcana.utilities.taint.TaintSpreader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class taintedgoldore extends Block {

    public taintedgoldore() {
        super(Properties.create(Material.IRON)
            .sound(SoundType.STONE)
            .hardnessAndResistance(3.0f)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName("taintedgoldore");
    }

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

    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {

        TaintSpreader.spreadTaint(worldIn, pos);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        worldIn.playEvent(player, 2001, pos, getStateId(state));
        if (!player.isCreative()) {
            int h = ThreadLocalRandom.current().nextInt(1, 9);
            switch (h) {
                case 1:
                    if (h == 1) {
                        spawnAsEntity(worldIn, pos, new ItemStack(Items.GOLD_NUGGET));
                    }
                    break;
                case 2:
                    if (h == 2) {
                        spawnAsEntity(worldIn, pos, new ItemStack(Items.GOLD_NUGGET, 2));
                    }
                    break;
                case 3:
                    if (h == 3) {
                        spawnAsEntity(worldIn, pos, new ItemStack(Items.GOLD_NUGGET, 3));
                    }
                    break;
                case 4:
                    if (h == 4) {
                        spawnAsEntity(worldIn, pos, new ItemStack(Items.GOLD_NUGGET, 4));
                    }
                    break;
                case 5:
                    if (h == 5) {
                        spawnAsEntity(worldIn, pos, new ItemStack(Items.GOLD_NUGGET, 5));
                    }
                    break;
                case 6:
                    if (h == 6) {
                        spawnAsEntity(worldIn, pos, new ItemStack(Items.GOLD_NUGGET, 6));
                    }
                    break;
                case 7:
                    if (h == 7) {
                        spawnAsEntity(worldIn, pos, new ItemStack(Items.GOLD_NUGGET, 7));
                    }
                    break;
                case 8:
                    if (h == 8) {
                        spawnAsEntity(worldIn, pos, new ItemStack(Items.GOLD_NUGGET, 8));
                    }
                    break;
                case 9:
                    if (h == 9) {
                        spawnAsEntity(worldIn, pos, new ItemStack(Items.GOLD_NUGGET, 9));
                    }
                    break;
                default:
                    if (h == 1) {
                        spawnAsEntity(worldIn, pos, new ItemStack(Items.GOLD_NUGGET));
                    }
                    break;
            }
        }
    }
}
