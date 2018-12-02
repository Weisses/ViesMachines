package com.vies.viesmachines.network.server.machine.gui.customize.displaybanner.sub;

import com.vies.viesmachines.ViesMachines;
import com.vies.viesmachines.network.GuiHandler;
import com.vies.viesmachines.network.packet.MessageBase;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class MessageGuiMachineMenuCustomizeDisplaySupporterHeadPg1 extends MessageBase<MessageGuiMachineMenuCustomizeDisplaySupporterHeadPg1> {
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		
	}
	
	@Override
	public void toBytes(ByteBuf buf) 
	{
		
	}
	
	@Override
	public void handleClientSide(MessageGuiMachineMenuCustomizeDisplaySupporterHeadPg1 message, EntityPlayer player) 
	{
		
	}
	
	@Override
	public void handleServerSide(MessageGuiMachineMenuCustomizeDisplaySupporterHeadPg1 message, EntityPlayer player) 
	{
		player.openGui(ViesMachines.instance, GuiHandler.GUI_MACHINE_MENU_CUSTOMIZE_DISPLAY_SUPPORTERHEAD_PG1, player.world, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ());
	}
}
