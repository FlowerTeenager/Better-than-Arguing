package FlowerTeenager.BetterThanArguing.block.mechanical;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class MillStone extends BlockContainer {

	public static int ID;
	@SideOnly(Side.CLIENT)
    private Icon iconTop;
    @SideOnly(Side.CLIENT)
    private Icon iconBottom;
    @SideOnly(Side.CLIENT)
    private Icon iconSide;

	public MillStone(int id) {
		super(id, Material.piston);
        setCreativeTab(CreativeTabs.tabRedstone);
		setUnlocalizedName("hempBlock");
		func_111022_d("betterthanarguing:mill_stone");
		GameRegistry.registerBlock(this, "Mill Stone");
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.iconTop : (par1 == 0 ? this.iconBottom : (par1 != 2 && par1 != 4 && par1 != 3 && par1 != 5 ? this.blockIcon : this.iconSide));
    }
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconSide = par1IconRegister.registerIcon(this.func_111023_E() + "_side");
        this.iconTop = par1IconRegister.registerIcon(this.func_111023_E() + "_top");
        this.iconBottom = par1IconRegister.registerIcon(this.func_111023_E() + "_bottom");
    }

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}

}
