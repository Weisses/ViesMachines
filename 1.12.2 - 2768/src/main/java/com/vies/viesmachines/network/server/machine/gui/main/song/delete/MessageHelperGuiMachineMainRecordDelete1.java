package com.vies.viesmachines.network.server.machine.gui.main.song.delete;

import com.vies.viesmachines.client.gui.machines.main.GuiMachineMenuMainSelectMusic;
import com.vies.viesmachines.common.entity.machines.EntityMachineBase;
import com.vies.viesmachines.network.packet.MessageBase;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class MessageHelperGuiMachineMainRecordDelete1 extends MessageBase<MessageHelperGuiMachineMainRecordDelete1> implements IMessage {
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		
	}
	
	@Override
	public void toBytes(ByteBuf buf) 
	{
		
	}
	
	@Override
	public void handleClientSide(MessageHelperGuiMachineMainRecordDelete1 message, EntityPlayer player) 
	{
		
	}
	
	@Override
	public void handleServerSide(MessageHelperGuiMachineMainRecordDelete1 message, EntityPlayer player) 
	{
		EntityMachineBase machine = (EntityMachineBase) player.getRidingEntity();
		
		machine.setLearnedRecordSlot1("");
	}
}
