package com.vies.viesmachines.network.server.machine.eventtrigger;

import com.vies.viesmachines.common.entity.machines.EntityMachineBase;
import com.vies.viesmachines.network.NetworkHandler;
import com.vies.viesmachines.network.client.machine.eventtrigger.MessageHelperEventTrigger13Client;
import com.vies.viesmachines.network.packet.MessageBase;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;

public class MessageHelperEventTrigger13Server extends MessageBase<MessageHelperEventTrigger13Server> {
	
	public static int machineID;
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		machineID = buf.readInt();
	}
	
	@Override
	public void toBytes(ByteBuf buf) 
	{
		buf.writeInt(EntityMachineBase.entityID);
	}
	
	@Override
	public void handleClientSide(MessageHelperEventTrigger13Server message, EntityPlayer player) 
	{
		
	}
	
	@Override
	public void handleServerSide(MessageHelperEventTrigger13Server message, EntityPlayer player) 
	{
		EntityMachineBase machine = (EntityMachineBase) player.world.getEntityByID(message.machineID);
		
		// Sends a packet to nearby players to render trigger events:
		NetworkHandler.sendToAllAround(new MessageHelperEventTrigger13Client(), 
				new TargetPoint(machine.dimension, machine.posX, machine.posY, machine.posZ, 32));
	}
}
