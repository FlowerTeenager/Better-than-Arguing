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
import FlowerTeenager.BetterThanArguing.BetterThanArguingMod;
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
import FlowerTeenager.BetterThanArguing.item.utility.Grate;
import FlowerTeenager.BetterThanArguing.item.utility.Wicker;
import FlowerTeenager.BetterThanArguing.item.weapon.ArrowRotted;
import FlowerTeenager.BetterThanArguing.utilites.CraftingUtilities;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class AgeOfVanilla {
	
	public static double rand;
	
	//Material
	public static Dung dung;
	public static int dungID;
	public static Bark bark;
	public static int barkID;
	public static IngotDiamond ingotDiamond;
	public static int ingotDiamondID;
	public static Nitre nitre;
	public static int nitreID;
	public static LeatherCut cutLeather;
	public static int cutLeatherID;
	
	//Agriculture
	public static SeedHemp hempSeed;
	public static int hempSeedID;
	public static Hemp hempItem;
	public static int hempItemID;
	public static BlockHemp hempBlock;
	public static int hempBlockID;
	
	//Food
	public static CreeperOyster creeperOyster;
	public static int creeperOysterID;
	public static MuttonRaw muttonRaw;
	public static int muttonRawID;
	public static MuttonCooked muttonCooked;
	public static int muttonCookedID;
	public static WolfchopRaw wolfchopRaw;
	public static int wolfchopRawID;
	public static WolfchopCooked wolfchopCooked;
	public static int wolfchopCookedID;
	
	//Utility
	public static LightningRod lightningRod;
	public static int lightningRodID;
	public static Wicker wickerItem;
	public static int wickerItemID;
	public static Grate grate;
	public static int grateID;
	
	//Weapon
	public static ArrowRotted rottedArrow;
	public static int rottedArrowID;
	
	//Decoration
	public static BlockWicker wickerBlock;
	public static SlabWicker wickerSlab;
	public static PackedEarth packedEarth;
	
	//Rails
	public static DetectorWood woodDetectorRail;
	public static DetectorStone stoneDetectorRail;
	public static DetectorSoulforgedSteel soulforgedSteelDetectorRail;
	
	public static void PreInit() {
		FMLLog.log(Level.INFO, "Initializing " + BetterThanArguingMod.AoV + " Blocks and Items");
		dung = new Dung(dungID);
		creeperOyster = new CreeperOyster(creeperOysterID);
		ingotDiamond = new IngotDiamond(ingotDiamondID);
		muttonRaw = new MuttonRaw(muttonRawID);
		muttonCooked = new MuttonCooked(muttonCookedID);
		wolfchopRaw = new WolfchopRaw(wolfchopRawID);
		wolfchopCooked = new WolfchopCooked(wolfchopCookedID);
	}
	
	public static void Init() {
		AddNames();
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
	}
	
	public static void InitRecipes() {
		//Everything related to the Diamond Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ingotDiamond), Item.ingotIron, creeperOyster, Item.diamond);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.swordDiamond));
		GameRegistry.addRecipe(new ItemStack(Item.swordDiamond), "I", "I", "S", Character.valueOf('I'), ingotDiamond, Character.valueOf('S'), Item.stick);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.shovelDiamond));
		GameRegistry.addRecipe(new ItemStack(Item.shovelDiamond), "I", "S", "S", Character.valueOf('I'), ingotDiamond, Character.valueOf('S'), Item.stick);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.pickaxeDiamond));
		GameRegistry.addRecipe(new ItemStack(Item.pickaxeDiamond), "III", " S ", " S ", Character.valueOf('I'), ingotDiamond, Character.valueOf('S'), Item.stick);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.axeDiamond));
		GameRegistry.addRecipe(new ItemStack(Item.axeDiamond), "I ", "IS", " S", Character.valueOf('I'), ingotDiamond, Character.valueOf('S'), Item.stick);
		GameRegistry.addRecipe(new ItemStack(Item.axeDiamond), " I", "SI", "S ", Character.valueOf('I'), ingotDiamond, Character.valueOf('S'), Item.stick);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.hoeDiamond));
		GameRegistry.addRecipe(new ItemStack(Item.hoeDiamond), "II", "S ", "S ", Character.valueOf('I'), ingotDiamond, Character.valueOf('S'), Item.stick);
		GameRegistry.addRecipe(new ItemStack(Item.hoeDiamond), "II", " S", " S", Character.valueOf('I'), ingotDiamond, Character.valueOf('S'), Item.stick);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.helmetDiamond));
		GameRegistry.addRecipe(new ItemStack(Item.helmetDiamond), "III", "I I", Character.valueOf('I'), ingotDiamond);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.plateDiamond));
		GameRegistry.addRecipe(new ItemStack(Item.plateDiamond), "I I", "III", "III", Character.valueOf('I'), ingotDiamond);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.legsDiamond));
		GameRegistry.addRecipe(new ItemStack(Item.legsDiamond), "III", "I I", "I I", Character.valueOf('I'), ingotDiamond);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.bootsDiamond));
		GameRegistry.addRecipe(new ItemStack(Item.bootsDiamond), "I I", "I I", Character.valueOf('I'), ingotDiamond);
		
		//The changes made to axes
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.axeWood));
		GameRegistry.addRecipe(new ItemStack(Item.axeWood), "M ", "MS", " S", Character.valueOf('M'), Block.planks, Character.valueOf('S'), Item.stick);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.axeStone));
		GameRegistry.addRecipe(new ItemStack(Item.axeStone), "M ", "MS", " S", Character.valueOf('M'), Block.cobblestone, Character.valueOf('S'), Item.stick);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.axeIron));
		GameRegistry.addRecipe(new ItemStack(Item.axeIron), "M ", "MS", " S", Character.valueOf('M'), Item.ingotIron, Character.valueOf('S'), Item.stick);
		CraftingUtilities.RemoveRecipe(new ItemStack (Item.axeGold));
		GameRegistry.addRecipe(new ItemStack(Item.axeGold), "M ", "MS", " S", Character.valueOf('M'), Item.ingotGold, Character.valueOf('S'), Item.stick);
		
		//Smelt that meat!
		GameRegistry.addSmelting(muttonRawID + 256, new ItemStack(muttonCooked), 5);
		GameRegistry.addSmelting(wolfchopRawID + 256, new ItemStack(wolfchopCooked), 5);
	}
	
	@ForgeSubscribe
    public void onEntityDrop(LivingDropsEvent event) {
		rand = Math.random();
		if (event.entityLiving instanceof EntityCreeper) {
			if (rand < 0.13D) {
				event.entityLiving.dropItem(AgeOfVanilla.creeperOysterID + 256, 1);
			}
		}
		if (event.entityLiving instanceof EntityWolf) {
			event.entityLiving.dropItem(AgeOfVanilla.wolfchopRawID + 256, 1);
		}
		if (event.entityLiving instanceof EntitySheep) {
			event.entityLiving.dropItem(AgeOfVanilla.muttonRawID + 256, 1);
		}
	}
}
