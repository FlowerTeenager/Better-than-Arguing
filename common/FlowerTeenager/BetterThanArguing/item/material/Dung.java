package FlowerTeenager.BetterThanArguing.item.material;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Dung extends Item {

	public Dung(int id) {
		super(id);
		maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("dung");
        func_111206_d("betterthanarguing:dung");
	}
	
	//TODO Makes Wolves drop me one Minecraft day after they eat and when dropped deplete their hunger.

}
