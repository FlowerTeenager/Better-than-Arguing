package FlowerTeenager.BetterThanArguing.item.agriculture;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Bark extends Item {

	public Bark(int id) {
		super(id);
		maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("bark");
	}
}
