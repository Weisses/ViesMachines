package com.vies.viesmachines.network.client.machine.eventtrigger;

import com.vies.viesmachines.common.entity.machines.EntityMachineBase;
import com.vies.viesmachines.network.packet.MessageBase;
import com.vies.viesmachines.network.server.machine.eventtrigger.MessageHelperEventTrigger11Server;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class MessageHelperEventTrigger11Client extends MessageBase<MessageHelperEventTrigger11Client> {
	
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
		buf.writeInt(MessageHelperEventTrigger11Server.machineID);
	}
	
	@Override
	public void handleClientSide(MessageHelperEventTrigger11Client message, EntityPlayer player) 
	{
		message.machine = (EntityMachineBase) Minecraft.getMinecraft().world.getEntityByID(message.machineID);
		
		message.machine.spawnHealHealthParticles1();
	}
	
	@Override
	public void handleServerSide(MessageHelperEventTrigger11Client message, EntityPlayer player) 
	{
		
	}
}
