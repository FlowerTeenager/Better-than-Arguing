package FlowerTeenager.BetterThanArguing.item.agriculture;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Hemp extends Item {

	public Hemp(int par1) {
		super(par1);
		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("hemp");
        func_111206_d("betterthanarguing:hemp");
    	GameRegistry.registerItem(this, "Hemp");
	}

}
