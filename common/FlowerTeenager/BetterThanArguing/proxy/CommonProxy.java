package FlowerTeenager.BetterThanArguing.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import FlowerTeenager.BetterThanArguing.gui.ContainerMillStone;
import FlowerTeenager.BetterThanArguing.tile.TileMillStone;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler {
	
	public static CommonProxy proxy;
	
	public void registerRenderers() {
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile = world.getBlockTileEntity(x, y, z);
        if (tile != null && tile instanceof TileMillStone)
        {
            TileMillStone millStone = (TileMillStone) tile;
            return new ContainerMillStone(player.inventory, millStone);
        }
        else
        {
            return null;
        }
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

}
