package FlowerTeenager.BetterThanArguing;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import FlowerTeenager.BetterThanArguing.age.AgeOfVanilla;
import FlowerTeenager.BetterThanArguing.age.AgeOfWood;
import FlowerTeenager.BetterThanArguing.age.NewAge;
import FlowerTeenager.BetterThanArguing.proxy.CommonProxy;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "BetterThanArguing", name = "Better Than Arguing", version = "0")
public class BetterThanArguingMod {
	
	@Instance("Better than Arguing")
    public static BetterThanArguingMod instance;
	
	@SidedProxy(clientSide="FlowerTeenager.BetterThanArguing.proxy.ClientProxy", serverSide="FlowerTeenager.BetterThanArguing.proxy.CommonProxy")
	public static CommonProxy proxy;
	
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
            AgeOfVanilla.AgeEnabled = cfg.get("Ages Enabled", AgeOfVanilla.Age + " Enabled", true).getBoolean(true);
            AgeOfWood.tier1.AgeEnabled = cfg.get("Ages Enabled", AgeOfWood.tier1.Age + " Enabled", true).getBoolean(true);
            AgeOfWood.tier2.AgeEnabled = cfg.get("Ages Enabled", AgeOfWood.tier2.Age + " Enabled", true).getBoolean(true);
            AgeOfWood.tier3.AgeEnabled = cfg.get("Ages Enabled", AgeOfWood.tier3.Age + " Enabled", true).getBoolean(true);
            AgeOfWood.tier4.AgeEnabled = cfg.get("Ages Enabled", AgeOfWood.tier4.Age + " Enabled", true).getBoolean(true);
            AgeOfWood.tier5.AgeEnabled = cfg.get("Ages Enabled", AgeOfWood.tier5.Age + " Enabled", true).getBoolean(true);
            AgeOfWood.tier6.AgeEnabled = cfg.get("Ages Enabled", AgeOfWood.tier6.Age + " Enabled", true).getBoolean(true);
            NewAge.AgeEnabled = cfg.get("Ages Enabled", NewAge.Age + " Enabled", true).getBoolean(true);
            AgeOfVanilla.dung.ID = cfg.getItem(AgeOfVanilla.AgeItems, "dung", 9000).getInt(9000);
            AgeOfVanilla.creeperOyster.ID = cfg.getItem(AgeOfVanilla.AgeItems, "creeperOyster", 9001).getInt(9001);
            AgeOfVanilla.ingotDiamond.ID = cfg.getItem(AgeOfVanilla.AgeItems, "ingotDiamond", 9002).getInt(9002);
            AgeOfVanilla.muttonRaw.ID = cfg.getItem(AgeOfVanilla.AgeItems, "muttonRaw", 9003).getInt(9003);
            AgeOfVanilla.muttonCooked.ID = cfg.getItem(AgeOfVanilla.AgeItems, "muttonCooked", 9004).getInt(9004);
            AgeOfVanilla.wolfchopRaw.ID = cfg.getItem(AgeOfVanilla.AgeItems, "wolfchopRaw", 9005).getInt(9005);
            AgeOfVanilla.wolfchopCooked.ID = cfg.getItem(AgeOfVanilla.AgeItems, "wolfchopCooked", 9006).getInt(9006);
            AgeOfVanilla.hempSeed.ID = cfg.getItem(AgeOfVanilla.AgeItems, "hempSeed", 9007).getInt(9007);
            AgeOfVanilla.hempItem.ID = cfg.getItem(AgeOfVanilla.AgeItems, "hempItem", 9008).getInt(9008);
            AgeOfVanilla.hempBlock.ID = cfg.getBlock(AgeOfVanilla.AgeBlocks, "hempBlock",3000).getInt(3000);
            AgeOfWood.tier1.gear.ID = cfg.getItem(AgeOfWood.tier1.AgeItems, "gear", 9009).getInt(9009);
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
        if(AgeOfVanilla.AgeEnabled)
        {
        	AgeOfVanilla.PreInit();
        	MinecraftForge.EVENT_BUS.register(new AgeOfVanilla());
        }
        if(AgeOfWood.tier1.AgeEnabled)
        {
        	AgeOfWood.tier1.PreInit();
        }
        
	}
	
	@EventHandler
	public void Init (FMLInitializationEvent event)
	{
		if(AgeOfVanilla.AgeEnabled)
		{
			AgeOfVanilla.Init();
		}
		if(AgeOfWood.tier1.AgeEnabled)
		{
			AgeOfWood.tier1.Init();
		}
	}
	
	@EventHandler
	public void PostInit (FMLPostInitializationEvent event)
	{
		
	}
}
