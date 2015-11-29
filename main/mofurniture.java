package main;

import Blöcke.TischAcacia;
import Blöcke.TischBirch;
import Blöcke.TischDarkOak;
import Blöcke.TischJungle;
import Blöcke.TischOak;
import Blöcke.TischSpruce;
import Events.UpdateCheckEvent;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import proxy.ServerProxy;
import util.Update_Checker;

@Mod(modid = mofurniture.MODID, version = mofurniture.VERSION)
public class mofurniture {

	public static final String MODID = "mofurniture";

	public static final String VERSION = "0.01";

	// public static final int GUI_BARREL = 0;

	@SidedProxy(serverSide = "proxy.ServerProxy", clientSide = "proxy.ClientProxy")
	public static ServerProxy proxy;

	// @Instance
	// public static mofood instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Update_Checker.checkForUpdates();

		GameRegistry.registerBlock(TischOak.TischOak, "TischOak");
		GameRegistry.registerBlock(TischAcacia.TischAcacia, "TischAcacia");
		GameRegistry.registerBlock(TischBirch.TischBirch, "TischBirch");
		GameRegistry.registerBlock(TischSpruce.TischSpruce, "TischSpruce");
		GameRegistry.registerBlock(TischJungle.TischJungle, "TischJungle");
		GameRegistry.registerBlock(TischDarkOak.TischDarkOak, "TischDarkOak");

		// Crafting

		GameRegistry.addRecipe(new ItemStack(TischOak.TischOak), "WWW", "W W", "W W", 'W', Blocks.planks);
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.registerItemRender();

		FMLCommonHandler.instance().bus().register(new UpdateCheckEvent());

		// NetworkRegistry.INSTANCE.registerGuiHandler(instance, new
		// GuiHandler());
	}

	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {

	}
}
