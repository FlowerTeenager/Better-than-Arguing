package FlowerTeenager.BetterThanArguing.block.mechanical;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import FlowerTeenager.BetterThanArguing.BetterThanArguingMod;
import FlowerTeenager.BetterThanArguing.api.power.IMechanicalPowerReciever;
import FlowerTeenager.BetterThanArguing.tile.mechanical.TileMillStone;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MillStone extends BlockContainer {

	public static int ID;
	@SideOnly(Side.CLIENT)
    private Icon iconTop;
    @SideOnly(Side.CLIENT)
    private Icon iconBottom;
    @SideOnly(Side.CLIENT)
    private Icon iconSide;

	public MillStone(int id) {
		super(id, Material.rock);
        setCreativeTab(CreativeTabs.tabRedstone);
		setUnlocalizedName("millStone");
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
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int idk, float what, float these, float are) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if (tileEntity == null || player.isSneaking()) {
                    return false;
            }
            player.openGui(BetterThanArguingMod.instance, 0, world, x, y, z);
            return true;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, int par5, int par6) {
            dropItems(world, x, y, z);
            super.breakBlock(world, x, y, z, par5, par6);
    }

    private void dropItems(World world, int x, int y, int z){
            Random rand = new Random();

            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if (!(tileEntity instanceof IInventory)) {
                    return;
            }
            IInventory inventory = (IInventory) tileEntity;

            for (int i = 0; i < inventory.getSizeInventory(); i++) {
                    ItemStack item = inventory.getStackInSlot(i);

                    if (item != null && item.stackSize > 0) {
                            float rx = rand.nextFloat() * 0.8F + 0.1F;
                            float ry = rand.nextFloat() * 0.8F + 0.1F;
                            float rz = rand.nextFloat() * 0.8F + 0.1F;

                            EntityItem entityItem = new EntityItem(world,
                                            x + rx, y + ry, z + rz,
                                            new ItemStack(item.itemID, item.stackSize, item.getItemDamage()));

                            if (item.hasTagCompound()) {
                                    entityItem.getEntityItem().setTagCompound((NBTTagCompound) item.getTagCompound().copy());
                            }

                            float factor = 0.05F;
                            entityItem.motionX = rand.nextGaussian() * factor;
                            entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
                            entityItem.motionZ = rand.nextGaussian() * factor;
                            world.spawnEntityInWorld(entityItem);
                            item.stackSize = 0;
                    }
            }
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
            return new TileMillStone();
    }

}
