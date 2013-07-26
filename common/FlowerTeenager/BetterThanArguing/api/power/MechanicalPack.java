package FlowerTeenager.BetterThanArguing.api.power;

import java.util.List;

/**
 * A simple way to store electrical data.
 * 
 * @author FlowerTeenager
 * 
 */
public class MechanicalPack implements Cloneable
{
	public float rotations;

	public MechanicalPack(float rotations)
	{
		this.rotations = rotations;
	}

	public MechanicalPack()
	{
		this(0);
	}
}