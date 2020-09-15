package com.vies.viescraft.main.utils.events;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;

public class EventHandlerConfig {
	
	public EventHandlerConfig()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void onPlayerLoginEvent(PlayerLoggedInEvent event)
	{
		if(!event.getPlayer().world.isRemote)
		{
			/*
			
			NetworkHandler.sendToClient(new MessageConfig(), (EntityPlayerMP)event.player);
			
			ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
			ArrayList<IRecipe> recipes = Lists.newArrayList(recipeRegistry.getValuesCollection());
			ArrayList<IRecipe> recipesVM = Lists.newArrayList();
			
			recipesVM.clear();
			
			/*
			for (IRecipe r : recipes)
            {
				ItemStack output = r.getRecipeOutput();
				
	            if (output.getItem() == SetupItemsVM.XEGONITE_WATER
				|| output.getItem() == SetupItemsVM.XEGONITE_LAVA
				|| output.getItem() == SetupItemsVM.XEGONITE_ENDER
				|| output.getItem() == SetupItemsVM.CIRCUIT_LOGIC
				|| output.getItem() == SetupItemsVM.CIRCUIT_ADAPTIVE
				|| output.getItem() == SetupItemsVM.KIT_BLANK
				|| output.getItem() == SetupItemsVM.MACHINE_PELLETS
	            || output.getItem() == SetupItemsVM.MACHINE_FRAME
				|| output.getItem() == SetupItemsVM.MACHINE_ENGINE
				|| output.getItem() == SetupItemsVM.MACHINE_COMPONENT_GROUND
				|| output.getItem() == SetupItemsVM.MACHINE_COMPONENT_WATER
				|| output.getItem() == SetupItemsVM.MACHINE_COMPONENT_FLYING
				|| output.getItem() == SetupItemsVM.ITEM_MACHINE_GROUND_HOVERCRAFT
				|| output.getItem() == SetupItemsVM.ITEM_MACHINE_WATER_SUBMARINE
				|| output.getItem() == SetupItemsVM.ITEM_MACHINE_FLYING_AIRSHIP
				|| output.getItem() == SetupItemsVM.UPGRADE_FRAME_TIER1
				|| output.getItem() == SetupItemsVM.UPGRADE_FRAME_TIER2
				|| output.getItem() == SetupItemsVM.UPGRADE_FRAME_TIER3
				|| output.getItem() == SetupItemsVM.UPGRADE_ENGINE_TIER1
				|| output.getItem() == SetupItemsVM.UPGRADE_ENGINE_TIER2
				|| output.getItem() == SetupItemsVM.UPGRADE_ENGINE_TIER3
				|| output.getItem() == SetupItemsVM.UPGRADE_COMPONENT_TIER1
				|| output.getItem() == SetupItemsVM.UPGRADE_COMPONENT_TIER2
				|| output.getItem() == SetupItemsVM.UPGRADE_COMPONENT_TIER3
				|| output.getItem() == SetupItemsVM.TOOL_DISMOUNTER
        		|| output.getItem() == SetupItemsVM.TOOL_RADIO_EXPANSION
				
        		
        		
	            || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.EXTRACTOR)
	            || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.KIT_FABRICATOR)
	            || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.MACHINE_TRANSMOGRIFIER)
        		|| output.getItem() == Item.getItemFromBlock(SetupBlocksVM.MACHINE_BEACON)
        		
				|| output.getItem() == Item.getItemFromBlock(SetupBlocksVM.ITEM_DISPLAY)
        		
				
				
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.XEGONITE_BASIC)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.XEGONITE_STAIRS)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.XEGONITE_FENCE)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.XEGONITE_GATE)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.XEGONITE_WALL)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.XEGONITE_TORCH)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.XEGONITE_LADDER)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.XEGONITE_PILLAR)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.XEGONITE_CHISELED)
                
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.WATER_BASIC)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.WATER_STAIRS)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.WATER_FENCE)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.WATER_GATE)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.WATER_WALL)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.WATER_TORCH)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.WATER_LADDER)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.WATER_PILLAR)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.WATER_CHISELED)
                
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.LAVA_BASIC)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.LAVA_STAIRS)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.LAVA_FENCE)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.LAVA_GATE)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.LAVA_WALL)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.LAVA_TORCH)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.LAVA_LADDER)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.LAVA_PILLAR)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.LAVA_CHISELED)
                
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.ENDER_BASIC)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.ENDER_STAIRS)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.ENDER_FENCE)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.ENDER_GATE)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.ENDER_WALL)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.ENDER_TORCH)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.ENDER_LADDER)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.ENDER_PILLAR)
                || output.getItem() == Item.getItemFromBlock(SetupBlocksVM.ENDER_CHISELED)
                
                
                
        		)
	            {
	            	recipesVM.add(r);
	            }
            }
			
			*/
			
			//event.getPlayer().unlockRecipes(recipesVM);
		}
	}
	
	@SubscribeEvent
	public void onPlayerLogoutEvent(PlayerLoggedOutEvent event)
	{
		
	}
}
