package FlowerTeenager.BetterThanArguing.network;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import FlowerTeenager.BetterThanArguing.gui.ContainerMillStone;
import FlowerTeenager.BetterThanArguing.gui.GuiMillStone;
import FlowerTeenager.BetterThanArguing.tile.TileMillStone;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    //returns an instance of the Container you made earlier
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if(tileEntity instanceof TileMillStone){
                    return new ContainerMillStone(player.inventory, (TileMillStone) tileEntity);
            }
            return null;
    }

    //returns an instance of the Gui you made earlier
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
                    int x, int y, int z) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if(tileEntity instanceof TileMillStone){
                    return new GuiMillStone(player.inventory, (TileMillStone) tileEntity);
            }
            return null;

    }
}