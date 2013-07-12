package FlowerTeenager.BetterThanArguing.block;

import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;

public class DirtSlab extends BlockHalfSlab {

	public DirtSlab(int id) {
		super(id, false, Material.ground);
	}

	@Override
	public String getFullSlabName(int i) {
		return "Dirt Slab";
	}

}
