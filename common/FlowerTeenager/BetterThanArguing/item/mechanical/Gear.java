package FlowerTeenager.BetterThanArguing.item.mechanical;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Gear extends Item {

	public static int ID;

	public Gear(int id) {
		super(id);
		maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("gear");
        func_111206_d("betterthanarguing:gear");
    	GameRegistry.registerItem(this, "Gear");
	}

}
