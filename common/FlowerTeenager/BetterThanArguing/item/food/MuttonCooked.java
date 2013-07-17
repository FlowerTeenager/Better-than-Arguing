package FlowerTeenager.BetterThanArguing.item.food;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MuttonCooked extends ItemFood {

	public MuttonCooked(int id) {
		super(id, 1, false);
		maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("muttonCooked");
        func_111206_d("betterthanarguing:cooked_mutton");
    	GameRegistry.registerItem(this, "Cooked Mutton");
	}
	
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		PotionEffect potion;
		if (player.canEat(false))
        {
            player.setItemInUse(item, this.getMaxItemUseDuration(item));
        }
        return item;
	}

}
