package FlowerTeenager.BetterThanArguing.tile.mechanical;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import FlowerTeenager.BetterThanArguing.api.power.block.IMechanical;

public class TileHandCrank extends TileEntity implements IMechanical {

	@Override
	public boolean canConnect(ForgeDirection direction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float receiveElectricity(ForgeDirection from, boolean doReceive) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getRequest(ForgeDirection direction) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getProvide(ForgeDirection direction) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getRotations() {
		// TODO Auto-generated method stub
		return 0;
	}

}
