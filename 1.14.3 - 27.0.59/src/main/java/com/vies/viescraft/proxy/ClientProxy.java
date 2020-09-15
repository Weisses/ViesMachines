package com.vies.viescraft.proxy;

import com.vies.viescraft.main.tileentity.containers.ScreenExtractor;
import com.vies.viescraft.setup.SetupBlocksVM;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

	@Override
	public World getClientWorld() 
	{
		return Minecraft.getInstance().world;
	}

	@Override
	public void init() 
	{
		ScreenManager.registerFactory(SetupBlocksVM.EXTRACTOR_CONTAINER, ScreenExtractor::new);
	}

	@Override
	public PlayerEntity getClientPlayer() {
		// TODO Auto-generated method stub
		return Minecraft.getInstance().player;
	}
}
