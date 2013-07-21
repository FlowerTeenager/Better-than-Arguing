package FlowerTeenager.BetterThanArguing.api.recipes;

import java.util.LinkedList;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;

import net.minecraft.item.ItemStack;

public class MillStoneRecipe {
	
	public static LinkedList<MillStoneRecipe> millStoneRecipes = new LinkedList<MillStoneRecipe>();

	public static ItemStack input;
	public static ItemStack[] output;
	public static float energy;
	
	public MillStoneRecipe() {}
	
	public static void addRecipe(int e, ItemStack i, ItemStack... o) {
		input = i;
		output = o;
		energy = e;
		FMLLog.log(Level.INFO, "Something tried to add a Mill Stone recipe using " + input.getItemName() + " to get " + output + " for " + energy + " gear rotations.");
	}

}
