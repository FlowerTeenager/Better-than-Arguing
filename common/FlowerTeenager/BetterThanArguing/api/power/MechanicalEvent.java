package FlowerTeenager.BetterThanArguing.api.power;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.Cancelable;
import net.minecraftforge.event.Event;
import FlowerTeenager.BetterThanArguing.api.power.block.IMechanical;

public class MechanicalEvent extends Event {
	
	/**
	 * Call this to have your TileEntity rotate it's "gears"
	 * 
	 * @author FlowerTeenager
	 * 
	 */
	@Cancelable
	public static class MechanicalProduceEvent extends MechanicalEvent
	{
		public World world;
		public IMechanical tileEntity;

		public MechanicalProduceEvent(IMechanical tileEntity)
		{
			this.tileEntity = tileEntity;
			this.world = ((TileEntity) this.tileEntity).worldObj;
		}
	}

	/**
	 * Internal Events
	 * 
	 * @author FlowerTeenager
	 * 
	 */
	@Cancelable
	public static class MechanicalProductionEvent extends MechanicalEvent
	{
		public MechanicalPack mechanicalPack;
		public TileEntity[] ignoreTiles;

		public MechanicalProductionEvent(MechanicalPack mechanicalPack, TileEntity... ignoreTiles)
		{
			this.mechanicalPack = mechanicalPack;
			this.ignoreTiles = ignoreTiles;
		}
	}

	public static class MechanicalRequestEvent extends MechanicalEvent
	{
		public MechanicalPack mechanicalPack;
		public TileEntity[] ignoreTiles;

		public MechanicalRequestEvent(MechanicalPack mechanicalPack, TileEntity... ignoreTiles)
		{
			this.mechanicalPack = mechanicalPack;
			this.ignoreTiles = ignoreTiles;
		}
	}

}
