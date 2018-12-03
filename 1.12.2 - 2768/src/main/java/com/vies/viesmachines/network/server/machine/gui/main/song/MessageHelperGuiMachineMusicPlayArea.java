package com.vies.viesmachines.network.server.machine.gui.main.song;

import com.vies.viesmachines.api.SoundsVM;
import com.vies.viesmachines.api.util.LogHelper;
import com.vies.viesmachines.client.sound.JukeboxMovingSoundVC;
import com.vies.viesmachines.common.entity.machines.EntityMachineBase;
import com.vies.viesmachines.network.packet.MessageBase;
import com.vies.viesmachines.proxy.ClientProxy;
import com.vies.viesmachines.proxy.CommonProxy;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MessageHelperGuiMachineMusicPlayArea extends MessageBase<MessageHelperGuiMachineMusicPlayArea> {
	
	private int machineIdArea;
	private EntityMachineBase machine;
	private int songID;
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		this.machineIdArea = buf.readInt();
		this.songID = buf.readInt();
	}
	
	@Override
	public void toBytes(ByteBuf buf) 
	{
		buf.writeInt(MessageHelperGuiMachineMusicPlay.machineId);
		buf.writeInt(MessageHelperGuiMachineMusicPlay.songId);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void handleClientSide(MessageHelperGuiMachineMusicPlayArea message, EntityPlayer player) 
	{
		this.machine = (EntityMachineBase) Minecraft.getMinecraft().world.getEntityByID(message.machineIdArea);
		
		SoundHandler soundHandler = Minecraft.getMinecraft().getSoundHandler();
		soundHandler.stopSounds();
		
		//SoundEvent test = SoundEvent.REGISTRY.;
		
		//test.getRegistry().getValue(
				
		//		SoundsVM.BRAMBLE.getRegistryName()
		//		);
		
		
		LogHelper.info(
				message.songID
				/*
				SoundEvent.REGISTRY.getObject(
				//SoundsVM.sounds.indexOf(
						//CommonProxy.musicListRecord.get(message.machine.selectedSong))
						SoundsVM.TIMESCAR.getRegistryName()
						
						)
				
		//		SoundsVM.sounds.get(0)
				//SoundEvent.REGISTRY.getIDForObject(SoundsVM.BRAMBLE)
				//.getObjectById(6)
				
				//.getObject(new ResourceLocation(SoundsVM.BRAMBLE.getRegistryName().toString()))
				//CommonProxy.musicListRecord.get(1) 
				
				//this.machine
				+ " = "
				
				+ CommonProxy.musicListRecord.get(message.machine.selectedSong)
					*/	
		);
		
		//IForgeRegistry<SoundEvent> registry;
		//registry.getValue(new ResourceLocation(ClientProxy.musicListRecord.get(this.machine.selectedSong).getResourcePath()));
		
		soundHandler.playSound(new JukeboxMovingSoundVC(this.machine, 
				
				ForgeRegistries.SOUND_EVENTS.getValue(CommonProxy.musicListRecord.get(machine.selectedSong))
				
		//		SoundEvent.REGISTRY.getObject(playerselected)
		//		SoundEvent.REGISTRY.getObject(
		//				SoundsVM.sounds.get(message.songID)
								//CommonProxy.musicListRecord.get(message.machine.selectedSong))
		//						SoundsVM.TIMESCAR.getRegistryName()
								
		//						)
		));
				
				//SoundEvent.REGISTRY.getObjectById(
						
				//		SoundEvent.REGISTRY.getIDForObject(SoundsVM.BRAMBLE))
				
				//SoundsVM.sounds.get(5)
				
				//.getObject(
				//		CommonProxy.musicListRecord.get(
				//				this.machine.selectedSong
				//				)
				//		)
		//		SoundEvent.REGISTRY.getObject(new ResourceLocation(
						
		//				CommonProxy.musicListRecord.get(message.machine.selectedSong).toString()
						
		//				)
		//				))
				
				//ClientProxy.musicListRecord.get(this.machine.selectedSong).getResourcePath()
				
		//		ClientProxy.musicListRecord.get(this.machine.selectedSong).getResourcePath()
				
				//SoundEvent.REGISTRY..getObjectById(this.machine.selectedSong)
		//		new ResourceLocation(ClientProxy.musicListRecord.get(this.machine.selectedSong).getResourcePath())//.toString())//.getResourcePath().toString()//)).getSoundName().getResourcePath()
						
				//SoundEvent.REGISTRY.getObject(new ResourceLocation(ClientProxy.musicListRecord.get(message.machine.selectedSong).toString())))
				
		//));
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void handleServerSide(MessageHelperGuiMachineMusicPlayArea message, EntityPlayer player) 
	{
		
	}
}
