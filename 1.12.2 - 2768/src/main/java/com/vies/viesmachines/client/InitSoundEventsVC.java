package com.vies.viesmachines.client;

import com.vies.viesmachines.api.References;
import com.vies.viesmachines.api.SoundsVM;

import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = References.MOD_ID)
public class InitSoundEventsVC extends SoundsVM {
	
	@SubscribeEvent
	public static void registerSoundEvents(RegistryEvent.Register<SoundEvent> event) 
	{
		IForgeRegistry<SoundEvent> registry = event.getRegistry();
		
		sounds.forEach(registry::register);
		/*
		event.getRegistry().registerAll(
				BRAMBLE,
				CASTLE,
				JUNGLE,
				DIRE,
				STORMS,
				TIMESCAR,
				ENGINEON
		);*/
	}
}
