package FlowerTeenager.BetterThanArguing.utilites;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipesTools;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;

public class CraftingUtilities {
	
	public static void RemoveRecipe(ItemStack resultItem)
	{
	    ItemStack recipeResult = null;
	    ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
	    
	    for (int scan = 0; scan < recipes.size(); scan++)
	    {
	        IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
	        recipeResult = tmpRecipe.getRecipeOutput();

		if (ItemStack.areItemStacksEqual(resultItem, recipeResult))
	        {
	            System.out.println("Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
	            recipes.remove(scan);
	        }
	    }
	}
}
