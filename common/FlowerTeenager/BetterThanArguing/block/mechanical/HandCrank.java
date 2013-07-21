package FlowerTeenager.BetterThanArguing.block.mechanical;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import FlowerTeenager.BetterThanArguing.api.power.IMechanicalPowerProvider;

public class HandCrank extends BlockContainer implements IMechanicalPowerProvider{

	public HandCrank(int id, Material material) {
		super(id, material);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}

}
