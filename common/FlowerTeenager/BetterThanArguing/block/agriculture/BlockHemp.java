package FlowerTeenager.BetterThanArguing.block.agriculture;

import java.util.Random;

import FlowerTeenager.BetterThanArguing.age.AgeOfVanilla;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockHemp extends BlockCrops {

	public static int ID;
	
	public BlockHemp(int id) {
		super(id);
		setUnlocalizedName("hempBlock");
		func_111022_d("betterthanarguing:hemp");
		GameRegistry.registerBlock(this, "Hemp Crop");
	}
	
	@Override
	public int getCropItem()
    {
        return AgeOfVanilla.hempItem.itemID;
    }
	
	@Override
	public int getSeedItem()
    {
        return AgeOfVanilla.hempSeed.itemID;
    }

}
