/**
 Used for stairs as they don't have a public constructor. Please always use this class when making a stair block.
 **/

package kineticdevelopment.common.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;


public class ArcanaStairsBlock extends StairsBlock {
    public ArcanaStairsBlock(BlockState state, Properties properties) {
        super(state, properties);
    }
}
