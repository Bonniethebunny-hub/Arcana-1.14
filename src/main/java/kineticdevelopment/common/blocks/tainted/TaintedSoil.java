package kineticdevelopment.common.blocks.tainted;

//import kineticdevelopment.api.effects.ArcanaEffects;
import kineticdevelopment.common.utils.taint.TaintSpreader;
import kineticdevelopment.init.ModEffects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class TaintedSoil extends Block {
   // Biome[] tainted = {BiomeInit.TAINTBIOME};
    public TaintedSoil() {
        super(Block.Properties.create(Material.SAND)
                .sound(SoundType.GROUND)
                .hardnessAndResistance(3.0f)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL)
                .tickRandomly()
        );

    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
        return true;
    }

    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        TaintSpreader.spreadTaint(worldIn, pos);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof LivingEntity) {
            LivingEntity entity = (LivingEntity) entityIn;

            //entity.addPotionEffect(new EffectInstance(ArcanaEffects.tainted_effect, 60, 1, false, true));
        }
    }
}
