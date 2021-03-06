package net.divinerpg.helper.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class EventArmorFullSet {
	
	EntityPlayer player = Minecraft.getMinecraft().thePlayer;
	
	private Item boots = null;
	private Item body = null;
	private Item legs = null;
	private Item helmet = null;
	
	ItemStack boot = player.inventory.armorInventory[0];
	ItemStack leg = player.inventory.armorInventory[1];
	ItemStack chestplate = player.inventory.armorInventory[2];
	ItemStack head = player.inventory.armorInventory[3];

    private VanillaItems v;
    
    //TODO Figure out why it isn't working.
    
	@SubscribeEvent
    public void onLivingHurtEvent(LivingHurtEvent e) {
		if (!(e.entityLiving instanceof EntityPlayer)){
			return;
		}
		
		if (boot != null) {
			boots = boot.getItem();
		}
		if (chestplate != null) {
			body = chestplate.getItem();
		}
		if (leg != null) {
			legs = leg.getItem();
		}
		if (head != null) {
			helmet = head.getItem();
		}
		
		DamageSource s = e.source;

		if (boots == VanillaItems.netheriteBoots && legs == VanillaItems.netheriteLegs && body == VanillaItems.netheriteBody && helmet == VanillaItems.netheriteHelmet) {
			if (s.equals(DamageSource.inFire) || s.equals(DamageSource.onFire) || s.equals(DamageSource.lava)) {
				e.setCanceled(true);
			}
		}
	}
	
	@SubscribeEvent
	public void onTickEvent(TickEvent ev) {
			
		if (boot != null) {
			boots = boot.getItem();
		}
		if (chestplate != null) {
			body = chestplate.getItem();
		}
		if (leg != null) {
			legs = leg.getItem();
		}
		if (head != null) {
			helmet = head.getItem();
		}

		if(boots == v.angelicBoots && body == v.angelicBody && legs == v.angelicLegs && helmet == v.angelicHelmet){
			player.capabilities.isFlying = true;
			player.fallDistance = 0.0F;
		}
	}   
}
