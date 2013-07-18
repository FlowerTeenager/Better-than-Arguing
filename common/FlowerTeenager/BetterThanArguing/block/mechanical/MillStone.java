package FlowerTeenager.BetterThanArguing.block.mechanical;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MillStone extends Block {

	public static int ID;

	public MillStone(int id) {
		super(id, Material.piston);
        setCreativeTab(CreativeTabs.tabRedstone);
		setUnlocalizedName("hempBlock");
		func_111022_d("betterthanarguing:mill_stone");
		GameRegistry.registerBlock(this, "Mill Stone");
	}

}
