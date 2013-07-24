package FlowerTeenager.BetterThanArguing.block.mechanical;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import FlowerTeenager.BetterThanArguing.api.power.IMechanicalPowerProvider;
import FlowerTeenager.BetterThanArguing.tile.mechanical.TileHandCrank;
import cpw.mods.fml.common.registry.GameRegistry;

public class HandCrank extends BlockContainer {

	public static int ID;

	public HandCrank(int id) {
		super(id, Material.rock);
        setCreativeTab(CreativeTabs.tabRedstone);
		setUnlocalizedName("handCrank");
		GameRegistry.registerBlock(this, "Hand Crank");
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileHandCrank();
	}
	
	@Override
    public int getRenderType() {
            return -1;
    }
    
    @Override
    public boolean isOpaqueCube() {
            return false;
    }
    
    public boolean renderAsNormalBlock() {
            return false;
    }

}
