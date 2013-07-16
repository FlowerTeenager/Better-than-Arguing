package FlowerTeenager.BetterThanArguing.item.food;

import FlowerTeenager.BetterThanArguing.age.AgeOfVanilla;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CreeperOyster extends Item {
	
	public static double rand;
	private static final int itemID = AgeOfVanilla.creeperOysterID; 

	public CreeperOyster(int id) {
		super(id);
		maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("creeperOyster");
        func_111206_d("betterthanarguing:creeperoyster");
    	GameRegistry.registerItem(this, "Creeper Oyster");
	}
	
	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) {
			rand = Math.random();
			if (event.entityLiving instanceof EntityCreeper) {
				if (rand < 0.13D) {
					event.entityLiving.dropItem(itemID, 1);
				}
			}
		}
	}

}
