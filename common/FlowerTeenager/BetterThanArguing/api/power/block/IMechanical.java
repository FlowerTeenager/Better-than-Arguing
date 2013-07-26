package FlowerTeenager.BetterThanArguing.api.power.block;

import net.minecraftforge.common.ForgeDirection;

public interface IMechanical extends IConnector {
	
	/**
	 * Adds gear rotations to an block. Returns the quantity of mechanical energy that was accepted. This
	 * should always return 0 if the block cannot be externally charged.
	 * 
	 * @param from Orientation the rotations is sent in from.
	 * @param doReceive If false, the charge will only be simulated.
	 * @return Amount of energy that was accepted by the block.
	 */
	public float receiveElectricity(ForgeDirection from, boolean doReceive);

	/**
	 * @return How many rotations does this TileEntity want?
	 */
	public float getRequest(ForgeDirection direction);

	/**
	 * @return How many rotations does this TileEntity want to provide?
	 */
	public float getProvide(ForgeDirection direction);

	/**
	 * Gets the rotations per tick of this TileEntity.
	 * 
	 * @return The amount of rotations per tick. Example: 10 R/t
	 */
	public float getRotations();


}
