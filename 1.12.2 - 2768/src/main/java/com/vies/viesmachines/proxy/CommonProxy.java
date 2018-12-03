package com.vies.viesmachines.proxy;

import java.util.ArrayList;
import java.util.Collections;

import com.vies.viesmachines.api.References;
import com.vies.viesmachines.client.InitSoundEventsVC;
import com.vies.viesmachines.common.utils.events.EventHandlerAirship;
import com.vies.viesmachines.common.utils.events.EventHandlerConfig;
import com.vies.viesmachines.init.InitEntityVC;
import com.vies.viesmachines.network.GuiHandler;
import com.vies.viesmachines.network.NetworkHandler;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {
	
	/** The initial array that collects all registered music. Used to move records only to the musicListRecord array. Cleared after musicListRecord is created. */
    public static ArrayList<ResourceLocation> musicListFull = new ArrayList<ResourceLocation>();
	/** MAIN ARRAY - A collection of all records from all mods. Only pulls anything with 'record.' in the name. */
    public static ArrayList<ResourceLocation> musicListRecord = new ArrayList<ResourceLocation>();
	
	public void preInit(FMLPreInitializationEvent event) 
	{
		//SoundEventsEA.registerSounds();
		
		//InitItemsVC.registerItem();
		//InitBlocksVC.registerBlock();
		//InitTileEntitiesVC.registerTileEntity();
		InitEntityVC.registerEntity();
		
		NetworkHandler.preInit();
		
		//InitItemsVC.registerItemTEMP();
		//InitBlocksVC.registerBlockTEMP();
		//InitTileEntitiesVC.registerTileEntityTEMP();
		//InitEntityVC.registerEntityTEMP();
	}
	
	public void init(FMLInitializationEvent event) 
	{
		//InitRecipesVC.initShapedRecipe();
		//InitAchievementsVC.init();
		
		
		InitSoundEventsVC.registerSounds();
		
		
		//MinecraftForge.EVENT_BUS.register(new AchievementTriggersVC());
		//MinecraftForge.EVENT_BUS.register(new EventHandlerAchievement());
		MinecraftForge.EVENT_BUS.register(new EventHandlerConfig());
		MinecraftForge.EVENT_BUS.register(new EventHandlerAirship());
		
		NetworkRegistry.INSTANCE.registerGuiHandler(References.MOD_ID, new GuiHandler());
	}
	
	public void postInit(FMLPostInitializationEvent event) 
	{
		//ResourceLocation group = null;
		
		//GameRegistry.addShapedRecipe(new ResourceLocation(References.MOD_ID + ":recipes/airship_balloon"), 
		//		group, 
		//		new ItemStack(InitItemsVC.AIRSHIP_BALLOON, 1), 
		//		new Object[]{"LLL", "L#L", "LLL", 'L', Items.LEATHER, '#', Items.STRING}
		//);
		
		//GameRegistry.addShapelessRecipe(new ItemStack(InitItemsVC.viesoline_pellets), new ItemStack(Items.COAL), new ItemStack(Items.REDSTONE));
		
		//RecipeRemoverVC.removeRecipe();
		
		this.setupMusic();
	}
	

	
	/**
	 * Creates the initial music record array upon spawning.
	 * NOTE: Moved to ClientProxy.postInit for efficiency and syncing.
	 */
	private void setupMusic() 
	{
		musicListFull.clear();
        musicListRecord.clear();
        
        musicListFull.addAll(SoundEvent.REGISTRY.getKeys());
		
		for(int i = 0; i < musicListFull.size(); i++)
		{
			if(musicListFull.get(i).toString().toLowerCase().contains("record.".toLowerCase()))
		    {
				musicListRecord.add(musicListFull.get(i));
		    }
		}
		
		musicListFull.clear();
        
		Collections.sort(musicListRecord);
	}
}
