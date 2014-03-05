package FlowerTeenager.BetterThanArguing

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.SidedProxy
import cpw.mods.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.common.config.Configuration
import org.apache.logging.log4j.Logger

@Mod(modid = "BetterThanArguing", name = "Better Than Arguing", version = "0")
object BetterThanArguingMod {

  @SidedProxy(clientSide = "FlowerTeenager.BetterThanArguing.Proxy$Client", serverSide = "FlowerTeenager.BetterThanArguing.Proxy$Server")
  var proxy = null
  
  private var log: Logger = null

  @EventHandler
  def PreInit(event: FMLPreInitializationEvent) {
	  log = event.getModLog
	  
	  log info "Better than Arguing"
	  log info "Copyright FlowerTeenager 2013-2014"
	  log info "http://flowerteenager.github.io"
	  
	  val cfg = new Configuration(event getSuggestedConfigurationFile)
  }

  @EventHandler
  def Init(event: FMLInitializationEvent) {
	  
  }

  @EventHandler
  def PostInit(event: FMLPostInitializationEvent) {
	  
  }

}
