package net.divinerpg.api.items;

import java.util.List;
import java.util.Set;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import com.google.common.collect.Sets;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemShickaxe extends ItemTool
{
	private static final Set<Blocks> blocksEffectiveAgainst = Sets.newHashSet(new Blocks[256]);

	protected ToolMaterial theToolMaterial;

	private String name;

	public ItemShickaxe(ToolMaterial par2EnumToolMaterial)
	{
		super(0, par2EnumToolMaterial, blocksEffectiveAgainst);
		this.theToolMaterial = par2EnumToolMaterial;
		setCreativeTab(DivineRPGTabs.tools);
		LangRegistry.addItem(this);
	}

	@Override
	public boolean canHarvestBlock(Block par1Block, ItemStack itemStack)
	{
		if(par1Block != Blocks.bedrock)
			return true;
		else
			return false;
	}

	public boolean func_150897_b(Block block)
	{
        return block == Blocks.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : (block != Blocks.diamond_block && block != Blocks.diamond_ore ? (block != Blocks.emerald_ore && block != Blocks.emerald_block ? (block != Blocks.gold_block && block != Blocks.gold_ore ? (block != Blocks.iron_block && block != Blocks.iron_ore ? (block != Blocks.lapis_block && block != Blocks.lapis_ore ? (block != Blocks.redstone_ore && block != Blocks.lit_redstone_ore ? (block.getMaterial() == Material.rock ? true : (block.getMaterial() == Material.iron ? true : block.getMaterial() == Material.anvil)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
	}

	public float func_150893_a(ItemStack item, Block block) {
		return 	block.getMaterial() != Material.anvil && block.getMaterial() != Material.cactus && block.getMaterial() != Material.cake && block.getMaterial() != Material.carpet && block.getMaterial() != Material.circuits && block.getMaterial() != Material.clay 
				&& block.getMaterial() != Material.cloth && block.getMaterial() != Material.coral && block.getMaterial() != Material.craftedSnow && block.getMaterial() != Material.dragonEgg && block.getMaterial() != Material.fire && block.getMaterial() != Material.glass
				&& block.getMaterial() != Material.gourd && block.getMaterial() != Material.grass && block.getMaterial() != Material.ground && block.getMaterial() != Material.ice && block.getMaterial() != Material.iron && block.getMaterial() != Material.leaves && block.getMaterial() != Material.packedIce
				&& block.getMaterial() != Material.piston && block.getMaterial() != Material.plants && block.getMaterial() != Material.portal && block.getMaterial() != Material.redstoneLight && block.getMaterial() != Material.rock && block.getMaterial() != Material.sand && block.getMaterial() != Material.snow && block.getMaterial() != Material.sponge 
				&& block.getMaterial() != Material.tnt && block.getMaterial() != Material.vine && block.getMaterial() != Material.web && block.getMaterial() != Material.wood ? super.func_150893_a(item, block) : this.efficiencyOnProperMaterial;
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
            return false;
            
        } else {
            UseHoeEvent event = new UseHoeEvent(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
            if (MinecraftForge.EVENT_BUS.post(event)) {
                return false;
            }

            if (event.getResult() == Result.ALLOW) {
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return true;
            }

            Block block = par3World.getBlock(par4, par5, par6);

            if (par7 != 0 && par3World.getBlock(par4, par5 + 1, par6).isAir(par3World, par4, par5 + 1, par6) && (block == Blocks.grass || block == Blocks.dirt)) {
                Block block1 = Blocks.farmland;
                par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), block1.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);

                if (par3World.isRemote) {
                    return true;
                } else {
                    par3World.setBlock(par4, par5, par6, block1);
                    par1ItemStack.damageItem(1, par2EntityPlayer);
                    return true;
                }
            } else {
                return false;
            }
        }
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(DivineAPI.BLUE + "Efficiency: " + this.theToolMaterial.getEfficiencyOnProperMaterial());
		if (par1ItemStack.getMaxDamage() != -1) {
			par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
		} else {
			par3List.add(DivineAPI.GREEN + "Infinite Uses");
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
