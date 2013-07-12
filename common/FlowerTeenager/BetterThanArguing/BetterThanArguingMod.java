package FlowerTeenager.BetterThanArguing;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "BetterThanArguing", name = "Better Than Arguing", version = "0")
public class BetterThanArguingMod {
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event)
	{
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
        try
        {
            cfg.load();
        }
        catch (Exception e)
        {
            FMLLog.log(Level.SEVERE, e, "Better than Arguing has a problem loading it's configuration");
        }
        finally
        {
            if (cfg.hasChanged())
                cfg.save();
        }
	}
	
	@EventHandler
	public void Init (FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void PostInit (FMLPostInitializationEvent event)
	{
		
	}

}
