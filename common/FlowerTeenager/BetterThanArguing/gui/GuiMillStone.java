package FlowerTeenager.BetterThanArguing.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import FlowerTeenager.BetterThanArguing.tile.TileMillStone;

public class GuiMillStone extends GuiContainer {

	public GuiMillStone (InventoryPlayer inventoryPlayer, TileMillStone tileEntity) {
		super(new ContainerMillStone(inventoryPlayer, tileEntity));
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
