package net.divinerpg.helper.items.base;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModShovel extends ItemSpade{

	ToolMaterial t;
	
	public ItemModShovel(ToolMaterial tool) {
		super(tool);
		t = tool;
	}
	
    @Override
    public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
        infoList.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
        infoList.add("Efficiency: " + this.t.getEfficiencyOnProperMaterial());
    }

}