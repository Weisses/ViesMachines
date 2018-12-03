package com.vies.viesmachines.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundsVM {
	public static final List<SoundEvent> sounds = new ArrayList<>();
	public static final String RESOURCE = References.MOD_ID.toLowerCase(Locale.US);
	
	public static final SoundEvent BRAMBLE = createSoundEvent("record.bramble");
	public static final SoundEvent CASTLE = createSoundEvent("record.castle");
	public static final SoundEvent JUNGLE = createSoundEvent("record.jungle");
	public static final SoundEvent DIRE = createSoundEvent("record.dire");
	public static final SoundEvent STORMS = createSoundEvent("record.storms");
	public static final SoundEvent TIMESCAR = createSoundEvent("record.timescar");
	public static final SoundEvent ENGINEON = createSoundEvent("sound.engineon");
	
	private static SoundEvent createSoundEvent
	//sound
	(String name) {
	    ResourceLocation location = getResource(name);
	    SoundEvent event = new SoundEvent(location);
	    event.setRegistryName(location);
	    sounds.add(event);
	    return event;
	  }
	public static ResourceLocation getResource(String res) {
	    return new ResourceLocation(RESOURCE, res);
	  }
	private static SoundEvent createSoundEvent2(String soundName) 
	{
		ResourceLocation soundID = new ResourceLocation(References.MOD_ID, soundName);
		return new SoundEvent(soundID).setRegistryName(soundID);
	}
	
	//================================
}
