package com.vies.viesmachines.network.client.machine.eventtrigger;

import com.vies.viesmachines.common.entity.machines.EntityMachineBase;
import com.vies.viesmachines.network.packet.MessageBase;
import com.vies.viesmachines.network.server.machine.eventtrigger.MessageHelperEventTrigger12Server;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class MessageHelperEventTrigger12Client extends MessageBase<MessageHelperEventTrigger12Client> {
	
	private int machineID;
	private EntityMachineBase machine;
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		machineID = buf.readInt();
	}
	
	@Override
	public void toBytes(ByteBuf buf) 
	{
		buf.writeInt(MessageHelperEventTrigger12Server.machineID);
	}
	
	@Override
	public void handleClientSide(MessageHelperEventTrigger12Client message, EntityPlayer player) 
	{
		message.machine = (EntityMachineBase) Minecraft.getMinecraft().world.getEntityByID(message.machineID);
		
		message.machine.spawnHealHealthParticles2();
	}
	
	@Override
	public void handleServerSide(MessageHelperEventTrigger12Client message, EntityPlayer player) 
	{
		
	}
}
