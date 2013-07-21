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
		xSize = 175;
		ySize = 185;
	}
	
	@Override
	public void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		fontRenderer.drawString("Mill Stone", 8, 6, 0x404040);
		fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	    this.mc.renderEngine.func_110577_a(new ResourceLocation("betterthanarguing:textures/gui/mill_stone.png"));
	    int x = (width - xSize) / 2;
	    int y = (height - ySize) / 2;
	    this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}
}
