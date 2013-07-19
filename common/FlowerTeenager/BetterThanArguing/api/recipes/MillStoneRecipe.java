package FlowerTeenager.BetterThanArguing.api.recipes;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;

public class MillStoneRecipe {
	
	public static LinkedList<MillStoneRecipe> millStoneRecipes = new LinkedList<MillStoneRecipe>();

	public final ItemStack input;
	public final ItemStack output;
	public final float energy;
	
	public MillStoneRecipe(ItemStack input, ItemStack output, int energy) {
		this.input = input;
		this.output = output;
		this.energy = energy;
	}

}
