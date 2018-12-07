package com.vies.viesmachines.common.utils.events;

import com.vies.viesmachines.common.entity.machines.EntityMachineBase;
import com.vies.viesmachines.common.entity.particles.EntityBulletNormal;

import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class EventHandlerMachine {
	
	@SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) 
    {
		
		/*
		if (event.player.getRidingEntity() instanceof EntityMachineBase)
		{
			EntityMachineBase ridingMachine = (EntityMachineBase)event.player.getRidingEntity(); //this.setControllingPassengerPitch(this.getControllingPassenger().rotationPitch);// = this.getControllingPassenger().rotationPitch;
        	
			if(ridingMachine.getArmed()
					&& ridingMachine.ticksExisted % 20 == 0)
			{
				//if (event.player)
					
					EntityBulletNormal entitybulletnormal = new EntityBulletNormal(event.player.world, 
							event.player.posX + (double)(MathHelper.sin(-event.player.rotationYaw * 0.017453292F) * 02.50F), 
							event.player.posY + 0.95D, 
							event.player.posZ + (double)(MathHelper.cos(event.player.rotationYaw * 0.017453292F) * 02.50F));
					
					entitybulletnormal.shoot(event.player, 
							event.player.rotationPitch, 
							event.player.rotationYaw, 
							0.0F, 2.5F, 0.0F);
			        
					event.player.world.spawnEntity(entitybulletnormal);
			}
			
			
		*/	
			
			
			
			
		//}
    }
}
