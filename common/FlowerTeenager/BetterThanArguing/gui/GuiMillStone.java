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
	protected void drawGuiContainerForegroundLayer(int param1, int param2) 
	{
		fontRenderer.drawString("Tiny", 8, 6, 4210752);
		fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
		this.mc.renderEngine.func_110577_a(new ResourceLocation("betterthanarguing:textures/gui/millstone.png"));
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.func_110577_a(new ResourceLocation("betterthanarguing:textures/gui/millstone.png"));
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}
}
