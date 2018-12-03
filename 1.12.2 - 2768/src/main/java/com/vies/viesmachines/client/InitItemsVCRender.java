package com.vies.viesmachines.client;

import java.util.HashSet;
import java.util.Set;

import com.vies.viesmachines.api.ItemsVM;
import com.vies.viesmachines.api.References;
import com.vies.viesmachines.init.InitItemsVC;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = References.MOD_ID)
public final class InitItemsVCRender extends ItemsVM {
	
	public static final InitItemsVCRender INSTANCE = new InitItemsVCRender();
	
	/**
	 * Register this mod's {@link Fluid}, {@link Block} and {@link Item} models.
	 *
	 * @param event The event
	 */
	@SubscribeEvent
	public static void registerAllModels(final ModelRegistryEvent event) 
	{
		INSTANCE.registerItemRender();
	}

	/** The {@link Item}s that have had models registered so far. */
	private final Set<Item> itemsRegistered = new HashSet<>();
	
	private void registerItemRender()
	{
		InitItemsVC.RegistrationHandler.ITEMS.stream().filter(item -> !itemsRegistered.contains(item)).forEach(this::registerRender);
	}
	
	private static void registerItemRenderTEMP()
	{
		//========================
		//    To be deleted
		//========================
		
		
		
	}
	
	private void registerRender(Item item)
	{
		itemsRegistered.add(item);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
	}
}
