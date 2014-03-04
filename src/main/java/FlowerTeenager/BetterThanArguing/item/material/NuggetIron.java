package FlowerTeenager.BetterThanArguing.item.material;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class NuggetIron extends Item {

	public static int ID;

	public NuggetIron(int id) {
    	super(id);
    	maxStackSize = 64;
    	setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("nuggetIron");
        func_111206_d("betterthanarguing:iron_nugget");
    	GameRegistry.registerItem(this, "Iron Nugget");
	}
	
}
