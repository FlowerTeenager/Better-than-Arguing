package FlowerTeenager.BetterThanArguing.age.wood.tier6.block

import net.minecraft.block.{Block, BlockNetherrack}
import net.minecraft.world.World
import net.minecraft.init.Blocks

class Hibachi extends BlockNetherrack {

  override def onNeighborBlockChange(world: World, x: Int, y: Int, z: Int, block: Block) {
    if (block.canProvidePower)
      world.setBlock(x, y + 1, z, Blocks.fire)
  }

}
