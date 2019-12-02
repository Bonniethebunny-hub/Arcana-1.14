package kineticdevelopment.arcana.common.items.wand.wands;

import kineticdevelopment.arcana.api.spells.Spell;
import kineticdevelopment.arcana.common.items.wand.CapType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

public class ItemWand extends Item {


    public ItemWand(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity player, Hand handIn) {
        if(worldIn.isRemote) {
            return ActionResult.newResult(ActionResultType.PASS, player.getHeldItem(handIn));
        }
        if(handIn == Hand.MAIN_HAND) {
            ItemStack item = player.getHeldItem(handIn);
            if(item.hasTag()) {
                if(!item.getTag().getCompound("foci").isEmpty()) {
                    Spell spell = Spell.fromNBT(item.getTag().getCompound("foci"));
                    spell.cast(player);
                }
            }
        }

        return ActionResult.newResult(ActionResultType.PASS, player.getHeldItem(handIn));
    }


   public CapType getCapType(ItemStack is) {
        CapType type = CapType.ERROR;
        if(is.getTag() != null) {
            try {
                type = CapType.valueOf(is.getTag().getString("capType").toUpperCase());
            } catch(IllegalArgumentException ex) {
                return type;
            }
        }
        return type;
   }

   public void updateModel(ItemStack is) {

   }


   private void registerModels() {
       ModelLoader.addSpecialModel(new ResourceLocation("arcana", ""));
   }


}
