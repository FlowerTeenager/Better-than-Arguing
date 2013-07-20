package FlowerTeenager.BetterThanArguing.age;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.oredict.OreDictionary;
import FlowerTeenager.BetterThanArguing.block.agriculture.BlockHemp;
import FlowerTeenager.BetterThanArguing.block.decoration.BlockWicker;
import FlowerTeenager.BetterThanArguing.block.decoration.PackedEarth;
import FlowerTeenager.BetterThanArguing.block.decoration.SlabWicker;
import FlowerTeenager.BetterThanArguing.block.rail.DetectorSoulforgedSteel;
import FlowerTeenager.BetterThanArguing.block.rail.DetectorStone;
import FlowerTeenager.BetterThanArguing.block.rail.DetectorWood;
import FlowerTeenager.BetterThanArguing.block.utility.LightningRod;
import FlowerTeenager.BetterThanArguing.item.agriculture.Bark;
import FlowerTeenager.BetterThanArguing.item.agriculture.Hemp;
import FlowerTeenager.BetterThanArguing.item.agriculture.SeedHemp;
import FlowerTeenager.BetterThanArguing.item.food.CreeperOyster;
import FlowerTeenager.BetterThanArguing.item.food.MuttonCooked;
import FlowerTeenager.BetterThanArguing.item.food.MuttonRaw;
import FlowerTeenager.BetterThanArguing.item.food.WolfchopCooked;
import FlowerTeenager.BetterThanArguing.item.food.WolfchopRaw;
import FlowerTeenager.BetterThanArguing.item.material.Dung;
import FlowerTeenager.BetterThanArguing.item.material.IngotDiamond;
import FlowerTeenager.BetterThanArguing.item.material.LeatherCut;
import FlowerTeenager.BetterThanArguing.item.material.Nitre;
import FlowerTeenager.BetterThanArguing.item.material.NuggetIron;
import FlowerTeenager.BetterThanArguing.item.utility.Grate;
import FlowerTeenager.BetterThanArguing.item.utility.Wicker;
import FlowerTeenager.BetterThanArguing.item.weapon.ArrowRotted;
import FlowerTeenager.BetterThanArguing.utilites.CraftingUtilities;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class AgeOfVanilla {
	
	public static double rand;
	
	//Age Information
	public static final String Age = "The Age of Vanilla";
	public static final String AgeItems = Age + " Items";
	public static final String AgeBlocks = Age + " Blocks";
	public static boolean AgeEnabled; 
	
	//Material
	public static Dung dung;
	public static Bark bark;
	public static IngotDiamond ingotDiamond;
	public static Nitre nitre;
	public static LeatherCut cutLeather;
	public static NuggetIron nuggetIron;
	
	//Agriculture
	public static SeedHemp hempSeed;
	public static Hemp hempItem;
	public static BlockHemp hempBlock;
	
	//Food
	public static CreeperOyster creeperOyster;
	public static MuttonRaw muttonRaw;
	public static MuttonCooked muttonCooked;
	public static WolfchopRaw wolfchopRaw;
	public static WolfchopCooked wolfchopCooked;
	
	//Utility
	public static LightningRod lightningRod;
	public static Wicker wickerItem;
	public static Grate grate;
	
	//Weapon
	public static ArrowRotted rottedArrow;
	
	//Decoration
	public static BlockWicker wickerBlock;
	public static SlabWicker wickerSlab;
	public static PackedEarth packedEarth;
	
	//Rails
	public static DetectorWood woodDetectorRail;
	public static DetectorStone stoneDetectorRail;
	public static DetectorSoulforgedSteel soulforgedSteelDetectorRail;
	
	public static void PreInit() {
		FMLLog.log(Level.INFO, "Initializing " + Age + " Blocks and Items");
		dung = new Dung(dung.ID);
		creeperOyster = new CreeperOyster(creeperOyster.ID);
		ingotDiamond = new IngotDiamond(ingotDiamond.ID);
		muttonRaw = new MuttonRaw(muttonRaw.ID);
		muttonCooked = new MuttonCooked(muttonCooked.ID);
		wolfchopRaw = new WolfchopRaw(wolfchopRaw.ID);
		wolfchopCooked = new WolfchopCooked(wolfchopCooked.ID);
		hempSeed = new SeedHemp(hempSeed.ID);
		hempItem = new Hemp(hempItem.ID);
		hempBlock = new BlockHemp(hempBlock.ID);
		nuggetIron = new NuggetIron(nuggetIron.ID);
	}
	
	public static void Init() {
		AddNames();
		RegisterDictionary();
		InitRecipes();
	}
	
	public static void AddNames() {
		 LanguageRegistry.addName(dung, "Dung");
		 LanguageRegistry.addName(creeperOyster, "Creeper Oyster");
		 LanguageRegistry.addName(ingotDiamond, "Diamond Ingot");
		 LanguageRegistry.addName(muttonRaw, "Raw Mutton");
		 LanguageRegistry.addName(muttonCooked, "Cooked Mutton");
		 LanguageRegistry.addName(wolfchopRaw, "Raw Wolfchop");
		 LanguageRegistry.addName(wolfchopCooked, "Cooked Wolfchop");
		 LanguageRegistry.addName(hempSeed, "Hemp Seeds");
		 LanguageRegistry.addName(hempItem, "Hemp");
		 LanguageRegistry.addName(nuggetIron, "Iron Nugget");
	}
	
	public static void RegisterDictionary()
	{
		//You never know when you might need an extra layer of compatibility for Vanilla.
		OreDictionary.registerOre("gemDiamond", Item.diamond);
		OreDictionary.registerOre("ingotIron", Item.ingotIron);
		OreDictionary.registerOre("ingotGold", Item.ingotGold);
		OreDictionary.registerOre("nuggetGold", Item.goldNugget);
		OreDictionary.registerOre("crystalQuartz", Item.netherQuartz);
		
		OreDictionary.registerOre("ingotDiamond", ingotDiamond);
		OreDictionary.registerOre("seedHemp", hempSeed);
		OreDictionary.registerOre("itemSeed", hempSeed);
		OreDictionary.registerOre("itemHempSeed", hempSeed);
		OreDictionary.registerOre("cropHemp", hempItem);
		OreDictionary.registerOre("nuggetIron", nuggetIron);
	}
	
	public static void InitRecipes() {
		//Everything related to the Diamond Ingot
		CraftingUtilities.AddShapelessRecipe(new ItemStack(ingotDiamond), "gemDiamond", "ingotIron", creeperOyster);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.swordDiamond));
		CraftingUtilities.AddRecipe(new ItemStack(Item.swordDiamond), "I", "I", "S", Character.valueOf('I'), "ingotDiamond", Character.valueOf('S'), "stickWood");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.shovelDiamond));
		CraftingUtilities.AddRecipe(new ItemStack(Item.shovelDiamond), "I", "S", "S", Character.valueOf('I'), "ingotDiamond", Character.valueOf('S'), "stickWood");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.pickaxeDiamond));
		CraftingUtilities.AddRecipe(new ItemStack(Item.pickaxeDiamond), "III", " S ", " S ", Character.valueOf('I'), "ingotDiamond", Character.valueOf('S'), "stickWood");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.axeDiamond));
		CraftingUtilities.AddRecipe(new ItemStack(Item.axeDiamond), "I ", "IS", " S", Character.valueOf('I'), "ingotDiamond", Character.valueOf('S'), "stickWood");
		CraftingUtilities.AddRecipe(new ItemStack(Item.axeDiamond), " I", "SI", "S ", Character.valueOf('I'), "ingotDiamond", Character.valueOf('S'), "stickWood");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.hoeDiamond));
		CraftingUtilities.AddRecipe(new ItemStack(Item.hoeDiamond), "II", "S ", "S ", Character.valueOf('I'), "ingotDiamond", Character.valueOf('S'), "stickWood");
		CraftingUtilities.AddRecipe(new ItemStack(Item.hoeDiamond), "II", " S", " S", Character.valueOf('I'), "ingotDiamond", Character.valueOf('S'), "stickWood");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.helmetDiamond));
		CraftingUtilities.AddRecipe(new ItemStack(Item.helmetDiamond), "III", "I I", Character.valueOf('I'), "ingotDiamond");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.plateDiamond));
		CraftingUtilities.AddRecipe(new ItemStack(Item.plateDiamond), "I I", "III", "III", Character.valueOf('I'), "ingotDiamond");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.legsDiamond));
		CraftingUtilities.AddRecipe(new ItemStack(Item.legsDiamond), "III", "I I", "I I", Character.valueOf('I'), "ingotDiamond");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.bootsDiamond));
		CraftingUtilities.AddRecipe(new ItemStack(Item.bootsDiamond), "I I", "I I", Character.valueOf('I'), "ingotDiamond");
		
		//The changes made to axes
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.axeWood));
		CraftingUtilities.AddRecipe(new ItemStack(Item.axeWood), "M ", "MS", " S", Character.valueOf('M'), "plankWood", Character.valueOf('S'), "stickWood");
		CraftingUtilities.AddRecipe(new ItemStack(Item.axeWood), " M", "SM", "S ", Character.valueOf('M'), "plankWood", Character.valueOf('S'), "stickWood");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.axeStone));
		CraftingUtilities.AddRecipe(new ItemStack(Item.axeStone), "M ", "MS", " S", Character.valueOf('M'), Block.cobblestone, Character.valueOf('S'), "stickWood");
		CraftingUtilities.AddRecipe(new ItemStack(Item.axeStone), " M", "SM", "S ", Character.valueOf('M'), Block.cobblestone, Character.valueOf('S'), "stickWood");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.axeIron));
		CraftingUtilities.AddRecipe(new ItemStack(Item.axeIron), "M ", "MS", " S", Character.valueOf('M'), "ingotIron", Character.valueOf('S'), "stickWood");
		CraftingUtilities.AddRecipe(new ItemStack(Item.axeIron), " M", "SM", "S ", Character.valueOf('M'), "ingotIron", Character.valueOf('S'), "stickWood");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.axeGold));
		CraftingUtilities.AddRecipe(new ItemStack(Item.axeGold), "M ", "MS", " S", Character.valueOf('M'), "ingotGold", Character.valueOf('S'), "stickWood");
		CraftingUtilities.AddRecipe(new ItemStack(Item.axeGold), " M", "SM", "S ", Character.valueOf('M'), "ingotGold", Character.valueOf('S'), "stickWood");
		
		//Smelt that meat!
		GameRegistry.addSmelting(muttonRaw.itemID, new ItemStack(muttonCooked), 5);
		GameRegistry.addSmelting(wolfchopRaw.itemID, new ItemStack(wolfchopCooked), 5);
		
		//Metal Ore Balancing
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.ingotGold));
		CraftingUtilities.AddRecipe(new ItemStack(Item.ingotGold), "GGG", "GGG", "GGG", Character.valueOf('G'), "nuggetGold");
		CraftingUtilities.AddShapelessRecipe(new ItemStack(Item.ingotGold, 9), Block.blockGold);
		GameRegistry.addSmelting(Block.oreGold.blockID, new ItemStack(Item.goldNugget), 5);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.pocketSundial));
		CraftingUtilities.AddRecipe(new ItemStack(Item.pocketSundial), " G ", "GQG", " G ", Character.valueOf('G'), "nuggetGold", Character.valueOf('Q'), "crystalQuartz");
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.ingotIron));
		CraftingUtilities.AddRecipe(new ItemStack(Item.ingotIron), "III", "III", "III", Character.valueOf('I'), "nuggetIron");
		CraftingUtilities.AddShapelessRecipe(new ItemStack(Item.ingotIron, 9), Block.blockIron);
		GameRegistry.addSmelting(Block.oreIron.blockID, new ItemStack(nuggetIron), 5);
		CraftingUtilities.RemoveRecipe(new ItemStack(Item.flintAndSteel));
		CraftingUtilities.AddShapelessRecipe(new ItemStack(Item.flintAndSteel), "nuggetIron", Item.flint);
		CraftingUtilities.RemoveRecipe(new ItemStack(Item.compass));
		CraftingUtilities.AddRecipe(new ItemStack(Item.compass), " I ", "IRI", " I ", Character.valueOf('I'), "nuggetIron", Character.valueOf('R'), Item.redstone);
		CraftingUtilities.RemoveRecipe(new ItemStack(Item.bucketEmpty));
		CraftingUtilities.AddRecipe(new ItemStack(Item.bucketEmpty), "I I", "I I", "III", Character.valueOf('I'), "nuggetIron");
		CraftingUtilities.RemoveRecipe(new ItemStack(Item.fishingRod));
		CraftingUtilities.AddRecipe(new ItemStack(Item.fishingRod), "  s", " Ss", "S I", Character.valueOf('s'), Item.silk, Character.valueOf('S'), Item.stick, Character.valueOf('I'), "nuggetIron");
	}
	
	@ForgeSubscribe
    public void onEntityDrop(LivingDropsEvent event) {
		rand = Math.random();
		if (event.entityLiving instanceof EntityCreeper) {
			if (rand < 0.13D) {
				event.entityLiving.dropItem(AgeOfVanilla.creeperOyster.itemID , 1);
			}
		}
		if (event.entityLiving instanceof EntityWolf) {
			event.entityLiving.dropItem(AgeOfVanilla.wolfchopRaw.itemID, 1);
		}
		if (event.entityLiving instanceof EntitySheep) {
			event.entityLiving.dropItem(AgeOfVanilla.muttonRaw.itemID, 1);
		}
	}
}
