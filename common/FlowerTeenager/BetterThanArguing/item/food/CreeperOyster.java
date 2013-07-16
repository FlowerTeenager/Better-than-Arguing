package FlowerTeenager.BetterThanArguing.item.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class CreeperOyster extends ItemFood {
	
	public CreeperOyster(int id) {
		super(id, 1, false);
		maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("creeperOyster");
        func_111206_d("betterthanarguing:creeperoyster");
    	GameRegistry.registerItem(this, "Creeper Oyster");
	}
	
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		if (player.canEat(false))
        {
            player.setItemInUse(item, this.getMaxItemUseDuration(item));
        }
        return item;
	}
}
