package FlowerTeenager.BetterThanArguing.api.power;

import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.world.World;

public class MechanicalPowerHandler implements IMechanicalPowerProvider {

	//Handle sending power to other blocks
	@Override
	public void sendRotation(int power, World world, int providerX, int providerY, int providerZ) {
		FMLLog.log(Level.INFO, "Sending " +  power + " mechanical rotation(s) from " + providerX + "," + providerY + "," + providerZ);
	}

}
