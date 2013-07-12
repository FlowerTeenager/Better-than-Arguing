package FlowerTeenager.BetterThanArguing.block.mechanical;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class HandCrank extends BlockContainer{

	public HandCrank(int id, Material material) {
		super(id, material);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}

}
