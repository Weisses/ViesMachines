package com.vies.viesmachines.network.server.machine.gui.main.song;

import com.vies.viesmachines.api.SoundsVM;
import com.vies.viesmachines.api.util.LogHelper;
import com.vies.viesmachines.client.gui.machines.main.GuiMachineMenuMain;
import com.vies.viesmachines.common.entity.machines.EntityMachineBase;
import com.vies.viesmachines.network.NetworkHandler;
import com.vies.viesmachines.network.packet.MessageBase;
import com.vies.viesmachines.proxy.CommonProxy;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class MessageHelperGuiMachineMusicPlay extends MessageBase<MessageHelperGuiMachineMusicPlay> implements IMessage {
	
	public static int machineId;
	public static int songId;
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		this.machineId = buf.readInt();
	}
	
	@Override
	public void toBytes(ByteBuf buf) 
	{
		buf.writeInt(GuiMachineMenuMain.machineId);
	}
	
	@Override
	public void handleClientSide(MessageHelperGuiMachineMusicPlay message, EntityPlayer player) 
	{
		
	}
	
	@Override
	public void handleServerSide(MessageHelperGuiMachineMusicPlay message, EntityPlayer player) 
	{
		EntityMachineBase machine = (EntityMachineBase) player.getRidingEntity();
		
		//ForgeRegistries.SOUND_EVENTS.getValue(CommonProxy.musicListRecord.get(machine.selectedSong));
		
		/*
		ResourceLocation playerselected = CommonProxy.musicListRecord.get(machine.selectedSong);
		
		//this.songId = SoundsVM.sounds.indexOf(SoundsVM.STORMS);
		
		this.songId = SoundsVM.sounds.indexOf(
		SoundEvent.REGISTRY.getObject(playerselected)//.getRegistryName()
		);
		
		LogHelper.info(
				"Server -   " +
		
				playerselected + " --- " + SoundEvent.REGISTRY.getObject(playerselected).getRegistryName()
				//" Server " + 
				//this.songId
				//+ " = "
				
				//+ CommonProxy.musicListRecord.get(machine.selectedSong)
						
		);
		LogHelper.info(
				"Server -   " +
				
				playerselected + " === " + SoundEvent.REGISTRY.getObject(
						                      new ResourceLocation(
						                    		  CommonProxy.musicListRecord.get(machine.selectedSong).toString()
						                    		  )
						                      ).getRegistryName().toString()
				//" Server " + 
				//this.songId
				//+ " = "
				
				//+ CommonProxy.musicListRecord.get(machine.selectedSong)
						
		);
		LogHelper.info(SoundsVM.sounds.get(0));
		*/
		
		NetworkHandler.sendToAllAround(new MessageHelperGuiMachineMusicPlayArea(), 
    	new TargetPoint(machine.dimension, machine.posX, machine.posY, machine.posZ, 32));
	}
}
