package FlowerTeenager.BetterThanArguing.api.power;

import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public interface IMechanicalPowerProvider {
	
	public void sendRotation(int power, World world, int providerX, int providerY, int providerZ);

}
