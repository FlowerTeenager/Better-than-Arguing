package FlowerTeenager.BetterThanArguing.item.material;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class IngotDiamond extends Item {
	
    public IngotDiamond(int id) {
    	super(id);
    	maxStackSize = 64;
    	setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("ingotDiamond");
        func_111206_d("betterthanarguing:diamond_ingot");
    	GameRegistry.registerItem(this, "Diamond Ingot");
	}
    
}
