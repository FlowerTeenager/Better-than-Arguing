package FlowerTeenager.BetterThanArguing.age.wood;

import java.util.logging.Level;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import FlowerTeenager.BetterThanArguing.age.AgeOfWood;
import FlowerTeenager.BetterThanArguing.item.mechanical.Gear;
import FlowerTeenager.BetterThanArguing.utilites.CraftingUtilities;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Tier1 {
	
	//Age Information
	public static final String Age = AgeOfWood.Age + " Tier 1: Basic Mechanical Power";
	public static final String AgeItems = Age + " Items";
	public static final String AgeBlocks = Age + " Blocks";
	public static boolean AgeEnabled;
	
	//Mechanical
	public static Gear gear;
	
	public static void PreInit()
	{
		FMLLog.log(Level.INFO, "Initializing " + Age + " Blocks and Items");
		gear = new Gear(Gear.ID);
	}
	
	public static void Init()
	{
		AddNames();
		RegisterDictionary();
		InitRecipes();
	}
	
	public static void AddNames()
	{
		LanguageRegistry.addName(gear, "Gear");
	}
	
	public static void RegisterDictionary()
	{
		OreDictionary.registerOre("itemGear", gear);
		OreDictionary.registerOre("itemGearWood", gear);
	}
	
	public static void InitRecipes()
	{
		CraftingUtilities.AddRecipe(new ItemStack(gear, 2), " S ", "SPS", " S ", Character.valueOf('S'), "stickWood", Character.valueOf('P'), "plankWood");
	}

}
