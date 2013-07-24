package FlowerTeenager.BetterThanArguing.age.wood;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import FlowerTeenager.BetterThanArguing.age.AgeOfWood;
import FlowerTeenager.BetterThanArguing.block.mechanical.MillStone;
import FlowerTeenager.BetterThanArguing.item.mechanical.Gear;
import FlowerTeenager.BetterThanArguing.tile.mechanical.TileMillStone;
import FlowerTeenager.BetterThanArguing.utilites.CraftingUtilities;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Tier1 {
	
	//Age Information
	public static final String Age = AgeOfWood.Age + " Tier 1: Basic Mechanical Power";
	public static final String AgeItems = Age + " Items";
	public static final String AgeBlocks = Age + " Blocks";
	public static boolean AgeEnabled;
	
	//Mechanical
	public static Gear gear;
	public static MillStone millStone;
	
	public static void PreInit()
	{
		FMLLog.log(Level.INFO, "Initializing " + Age + " Blocks and Items");
		gear = new Gear(gear.ID);
		millStone = new MillStone(millStone.ID);
	}
	
	public static void Init()
	{
		AddNames();
		RegisterDictionary();
		InitRecipes();
		RegisterTileEntities();
	}

	public static void AddNames()
	{
		LanguageRegistry.addName(gear, "Gear");
		LanguageRegistry.addName(millStone, "Mill Stone");
	}
	
	public static void RegisterDictionary()
	{
		OreDictionary.registerOre("itemGear", gear);
		OreDictionary.registerOre("itemGearWood", gear);
	}
	
	public static void InitRecipes()
	{
		CraftingUtilities.AddRecipe(new ItemStack(gear, 2), " S ", "SPS", " S ", Character.valueOf('S'), "stickWood", Character.valueOf('P'), "plankWood");
		CraftingUtilities.AddRecipe(new ItemStack(millStone), "SSS", "SSS", "SGS", Character.valueOf('S'), Block.stone, Character.valueOf('G'), "itemGear");
		CraftingUtilities.AddMillStoneRecipe(10, new ItemStack(Item.reed), new ItemStack(Item.sugar));
		CraftingUtilities.AddMillStoneRecipe(10, new ItemStack(Item.bone), new ItemStack(Item.dyePowder, 3, 15));
		CraftingUtilities.AddMillStoneRecipe(10, new ItemStack(Item.skull), new ItemStack(Item.dyePowder, 6, 15));
		CraftingUtilities.AddMillStoneRecipe(10, new ItemStack(Block.plantYellow), new ItemStack(Item.dyePowder, 2, 11));
		CraftingUtilities.AddMillStoneRecipe(10, new ItemStack(Block.plantRed), new ItemStack(Item.dyePowder, 2, 1));
	}
	
	public static void RegisterTileEntities()
	{
		GameRegistry.registerTileEntity(TileMillStone.class, "Mill Stone");
	}

}
