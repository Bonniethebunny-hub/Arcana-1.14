/**
 * To give a block state for block such as logs that need an axis orientation :D

*/

package kineticdevelopment.arcana.common.utils.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.state.IProperty;
import net.minecraft.util.Direction;

import java.util.Collection;

public class BlockUtil {

    public static IProperty getAxisProperty(BlockState log) {

        for (IProperty property : log.getProperties()) {

            Collection allowedValues = property.getAllowedValues();
            if (allowedValues.contains(Direction.Axis.X) && allowedValues.contains(Direction.Axis.Y) && allowedValues.contains(Direction.Axis.Z)) {

                return property;
            }

        }

        return null;
    }
}
