package FlowerTeenager.BetterThanArguing.block.mechanical;

import java.util.logging.Level;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import FlowerTeenager.BetterThanArguing.tile.mechanical.TileHandCrank;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;

public class HandCrank extends BlockContainer {

	public static int ID;
	public TileHandCrank tile;

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
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float par7, float par8, float par9) {
    	if (player.isSneaking()) {
    		return false;
    	}
    	else
    	{
    		
    	}
    	return false;
    }

}
