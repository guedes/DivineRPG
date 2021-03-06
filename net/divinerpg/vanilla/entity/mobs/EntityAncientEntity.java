package net.divinerpg.vanilla.entity.mobs;

import net.divinerpg.api.entity.EntityDivineRPGBoss;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityAncientEntity extends EntityDivineRPGBoss implements IBossDisplayData{
	
	public EntityAncientEntity(World par1World) {
		super(par1World);
		this.setSize(4.0F, 6.5F);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4000.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(16.0D);
	}

	@Override
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        super.attackEntityAsMob(par1Entity);

        if (this.entityToAttack != null)
        {
            this.entityToAttack.addVelocity(this.motionX * 10.0D, 3.0D, this.motionZ * 10.0D);
            if(this.entityToAttack instanceof EntityLiving)
            {
                ((EntityLiving)this.entityToAttack).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 0));
            }
            return true;
        }

        return false;
    }
	
	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(16, new Integer(100));
	}
	
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    protected String getHurtSound() {
        return "mob.irongolem.hit";
    }

    protected String getDeathSound() {
        return "mob.irongolem.death";
    }

    
    protected void dropFewItems(boolean par1, int par2) {
    	
    	Item i = getDropItem();
    	Item i2 = VanillaItems.sandslash;

        int var3, var4;
        
        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < 11; var4++) {
            this.dropItem(i, 5);
        }

        for (var4 = 0; var4 < 1; var4++) {
            this.dropItem(i2, 1);
        }
    }

    protected Item getDropItem() {
        return VanillaItems.divineShards;
    }

	@Override
	public String mobName() {
		return "Ancient Entity";
	}
}
