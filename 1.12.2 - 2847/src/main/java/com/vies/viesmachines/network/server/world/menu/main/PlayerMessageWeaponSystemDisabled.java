package com.vies.viesmachines.network.server.world.menu.main;

import com.vies.viesmachines.api.References;
import com.vies.viesmachines.network.packet.MessageBase;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class PlayerMessageWeaponSystemDisabled extends MessageBase<PlayerMessageWeaponSystemDisabled> {
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		
	}
	
	@Override
	public void toBytes(ByteBuf buf) 
	{
		
	}
	
	@Override
	public void handleClientSide(PlayerMessageWeaponSystemDisabled message, EntityPlayer player) 
	{
		
	}
	
	@Override
	public void handleServerSide(PlayerMessageWeaponSystemDisabled message, EntityPlayer player) 
	{
		player.sendMessage(new TextComponentString(TextFormatting.RED + References.Old_I18n.translateToLocalFormatted("viesmachines.message.weaponsystem.2")));
	}
}
