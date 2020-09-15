package com.vies.viescraft.api.utils;

import org.apache.logging.log4j.LogManager;

import com.vies.viescraft.api.References;

public class LogHelper {
	
	public static void info(Object object) 
	{
		LogManager.getLogger().info("[" + References.MOD_NAME + "]" + " >>> " + object);
	}
}
