package FlowerTeenager.BetterThanArguing.block.mechanical;

import java.util.logging.Level;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import FlowerTeenager.BetterThanArguing.api.power.IMechanicalPowerProvider;
import FlowerTeenager.BetterThanArguing.tile.mechanical.TileHandCrank;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;

public class HandCrank extends BlockContainer implements IMechanicalPowerProvider {

	//Block related init fields
	public static int ID;
	
	//Hand Crank information, might make these config options at some point in the future.
	public final int powerSentPerTick = 1; //How many gear rotations are sent by the Hand Crank each time a rotation is finished.
	public final int gearSpinTime = 4; //When the Mill Stone is activated how many seconds should it stay in an active position before allowing the player to activate in again. Kinda like a cool down period.
	public final int exhaustionTimer = 10; //How many activations will it take for the player to feel exhaustion.

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
    		sendRotation(powerSentPerTick, world, x, y, z);
    		return true;
    	}
    }

	@Override
	public void sendRotation(int power, World world, int providerX, int providerY, int providerZ) {
		FMLLog.log(Level.INFO, "Sending " +  power + " mechanical rotation(s) from " + providerX + "," + providerY + "," + providerZ);
	}

}
