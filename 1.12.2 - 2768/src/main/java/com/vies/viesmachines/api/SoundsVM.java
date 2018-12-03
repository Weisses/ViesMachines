package com.vies.viesmachines.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsVM {
	//public static final List<SoundEvent> sounds = new ArrayList<>();
	//public static final String RESOURCE = References.MOD_ID.toLowerCase(Locale.US);
	
	public static SoundEvent BRAMBLE;// = registerSound("record.bramble");
	public static SoundEvent CASTLE;// = registerSound("record.castle");
	public static SoundEvent JUNGLE;// = registerSound("record.jungle");
	public static SoundEvent DIRE;// = registerSound("record.dire");
	public static SoundEvent STORMS;// = registerSound("record.storms");
	public static SoundEvent TIMESCAR;// = registerSound("record.timescar");
	public static SoundEvent ENGINEON;// = registerSound("sound.engineon");
	
	public static void registerSounds()
	{
		BRAMBLE = registerSound("record.bramble");
		CASTLE = registerSound("record.castle");
		JUNGLE = registerSound("record.jungle");
		DIRE = registerSound("record.dire");
		STORMS = registerSound("record.storms");
		TIMESCAR = registerSound("record.timescar");
		ENGINEON = registerSound("sound.engineon");
	}
	
	private static SoundEvent registerSound(String name) 
	{
	    ResourceLocation location = new ResourceLocation(References.MOD_ID, name);
	    SoundEvent event = new SoundEvent(location);
	    event.setRegistryName(name);
	    ForgeRegistries.SOUND_EVENTS.register(event);
	    //sounds.add(event);
	    return event;
	}
	
	//================================
}
