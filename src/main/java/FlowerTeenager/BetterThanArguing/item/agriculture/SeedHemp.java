package FlowerTeenager.BetterThanArguing.item.agriculture;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import FlowerTeenager.BetterThanArguing.age.AgeOfVanilla;

public class SeedHemp extends ItemSeeds implements IPlantable {

	public static int ID;
	
	public SeedHemp(int id) {
		super(id, AgeOfVanilla.hempBlock.ID, Block.tilledField.blockID);
		maxStackSize = 64;
		setUnlocalizedName("hempSeed");
        func_111206_d("betterthanarguing:hemp_seeds");
    	GameRegistry.registerItem(this, "Hemp Seeds");
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z) {
		return EnumPlantType.Crop;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z) {
		return AgeOfVanilla.hempBlock.blockID;
	}

	@Override
	public int getPlantMetadata(World world, int x, int y, int z) {
		return 0;
	}

}
