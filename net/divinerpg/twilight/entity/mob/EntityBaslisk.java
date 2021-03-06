package net.divinerpg.twilight.entity.mob;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.TwilightItems;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityBaslisk extends EntityDivineRPGMob
{
    public EntityBaslisk(World var1)
    {
        super(var1);

    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1600.0D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(25D);
	}

    @Override
    public int getTotalArmorValue()
    {
        return 10;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    @Override
    public void onLivingUpdate()
    {
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float var1 = this.getBrightness(1.0F);

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
                this.setFire(8);
            }
        }

        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "";//Sound.Mucky; 
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "";//Sound.GrowlHit;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "";//Sound.GrowlHit;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected Item getDropItem()
    {
        return TwilightItems.mortumSoul;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

	@Override
	public String mobName() {
		return "Baslisk";
	}
}
