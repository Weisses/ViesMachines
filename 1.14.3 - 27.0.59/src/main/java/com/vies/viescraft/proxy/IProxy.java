package com.vies.viescraft.proxy;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public interface IProxy {
	
	World getClientWorld();
	
	void init();
	
	PlayerEntity getClientPlayer();
}
