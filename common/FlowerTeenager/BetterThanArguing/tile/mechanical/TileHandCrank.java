package FlowerTeenager.BetterThanArguing.tile.mechanical;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import FlowerTeenager.BetterThanArguing.api.power.IMechanicalPowerProvider;

public class TileHandCrank extends TileEntity implements IMechanicalPowerProvider {

	@Override
	public void sendRotation(int power, World world, int providerX,
			int providerY, int providerZ, ForgeDirection direction) {
		// TODO Auto-generated method stub
		
	}

}
