package FlowerTeenager.BetterThanArguing.item.material;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Dung extends Item {

	public static int ID;

	public Dung(int id) {
		super(id);
		maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("dung");
        func_111206_d("betterthanarguing:dung");
    	GameRegistry.registerItem(this, "Dung");
	}
	
	//TODO Makes Wolves drop me one Minecraft day after they eat and when dropped deplete their hunger.

}
