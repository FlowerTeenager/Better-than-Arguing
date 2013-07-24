package FlowerTeenager.BetterThanArguing.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import FlowerTeenager.BetterThanArguing.gui.GuiMillStone;
import FlowerTeenager.BetterThanArguing.tile.mechanical.TileMillStone;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		
	}
	
	@Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tile = world.getBlockTileEntity(x, y, z);
        if (tile != null && tile instanceof TileMillStone)
        {
            return new GuiMillStone(player.inventory, (TileMillStone) tile);
        }
        else
        {
            return null;
        }
    }

}
