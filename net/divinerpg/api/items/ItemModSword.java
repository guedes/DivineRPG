package net.divinerpg.api.items;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemModSword extends ItemSword{

	private String name;

    public ItemModSword(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
		setCreativeTab(DivineRPGTabs.swords);
		LangRegistry.addItem(this);
	}

	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}

	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
		if(item.getMaxDamage() == -1) {
			infoList.add(DivineAPI.GREEN + "Infinite Uses");
		}
		else {
			infoList.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
		}
	}
	public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.PREFIX + par1Str);
        return this;
    }
	
	   public Item setName(String name){
	        this.name = name;
	        setTextureName(name);
	        setUnlocalizedName(name);
	        register();
	        return this;
	    }
	    
	    public void register(){
	        int numChars = 0;
	        char firstLetter = name.charAt(0);
	        if(Character.isLowerCase(firstLetter))
	            firstLetter = Character.toUpperCase(firstLetter);
	        String inGame = name.substring(1);
	        for(int k = 0; k < name.length(); k++){
	            char c = name.charAt(k);
	            int code = (int) c;
	            
	            if(k != 0){
	                for(int p = 65; p < 90; p++){
	                    if(code == p){
	                        numChars++;
	                        if(numChars == 1)
	                            inGame = new StringBuffer(inGame).insert(k - 1, " ").toString();
	                        else
	                            inGame = new StringBuffer(inGame).insert(k, " ").toString();
	                    }
	                }
	            }
	        }
	        String finalName = firstLetter + inGame;
	        GameRegistry.registerItem(this, name);
	        LanguageRegistry.addName(this, finalName);
	    }
}
