package FlowerTeenager.BetterThanArguing;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import FlowerTeenager.BetterThanArguing.age.AgeOfVanilla;
import FlowerTeenager.BetterThanArguing.item.material.Dung;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "BetterThanArguing", name = "Better Than Arguing", version = "0")
public class BetterThanArguingMod {
	
	//Better than Wolves Age Strings
	public static final String AoV = "The Age of Vanilla";
	public static final String AoVItems = AoV + " Items";
	public static final String AoW = "The Age of Wood";
	public static final String AoW1 = AoW + " Tier 1: Basic Mechanical Power";
	public static final String AoW2 = AoW + " Tier 2: Continuous Mechanical Power";
	public static final String AoW3 = AoW + " Tier 3: Power Tools";
	public static final String AoW4 = AoW + " Tier 4: Automation and Basic Alchemy";
	public static final String AoW5 = AoW + " Tier 5: Fire Mastery";
	public static final String AoW6 = AoW + " Tier 6: Pottery";
	public static final String NA = "The New Age";
	
	//Better than Wolves Age Booleans
	public static boolean AoVEnabled;
	public static boolean AoW1Enabled;
	public static boolean AoW2Enabled;
	public static boolean AoW3Enabled;
	public static boolean AoW4Enabled;
	public static boolean AoW5Enabled;
	public static boolean AoW6Enabled;
	public static boolean NAEnabled;
	
	//Configuration Categories
	public static final String AgeBoolean = "Ages Enabled";
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event)
	{
		FMLLog.log(Level.INFO, "Better than Arguing");
		FMLLog.log(Level.INFO, "Copyright FlowerTeenager 2013");
		FMLLog.log(Level.INFO, "http://flowerteenager.github.io");
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
        try
        {
        	FMLLog.log(Level.INFO, "Loading Better than Arguing Config File");
            cfg.load();
            AoVEnabled = cfg.get(AgeBoolean, AoV + " Enabled", true).getBoolean(true);
            AoW1Enabled = cfg.get(AgeBoolean, AoW1 + " Enabled", true).getBoolean(true);
            AoW2Enabled = cfg.get(AgeBoolean, AoW2 + " Enabled", true).getBoolean(true);
            AoW3Enabled = cfg.get(AgeBoolean, AoW3 + " Enabled", true).getBoolean(true);
            AoW4Enabled = cfg.get(AgeBoolean, AoW4 + " Enabled", true).getBoolean(true);
            AoW5Enabled = cfg.get(AgeBoolean, AoW5 + " Enabled", true).getBoolean(true);
            AoW6Enabled = cfg.get(AgeBoolean, AoW6 + " Enabled", true).getBoolean(true);
            NAEnabled = cfg.get(AgeBoolean, NA + " Enabled", true).getBoolean(true);
            AgeOfVanilla.dungID = cfg.getItem(AoVItems, "dung", 9000).getInt(9000);
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
        if(AoVEnabled) {
        	AgeOfVanilla.PreInit();
        }
        
	}
	
	@EventHandler
	public void Init (FMLInitializationEvent event)
	{
		AgeOfVanilla.Init();
	}
	
	@EventHandler
	public void PostInit (FMLPostInitializationEvent event)
	{
		
	}

}
