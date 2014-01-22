package net.divinerpg.helper.recipes.modded;

import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RecipesMapCloning implements IRecipe
{
    private static final String __OBFID = "CL_00000087";

    /**
     * Used to check if a recipe matches current crafting inventory
     */
    public boolean matches(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        int i = 0;
        ItemStack itemstack = null;

        for (int j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
        {
            ItemStack itemstack1 = par1InventoryCrafting.getStackInSlot(j);

            if (itemstack1 != null)
            {
                if (itemstack1.getItem() == Items.filled_map)
                {
                    if (itemstack != null)
                    {
                        return false;
                    }

                    itemstack = itemstack1;
                }
                else
                {
                    if (itemstack1.getItem() != Items.map)
                    {
                        return false;
                    }

                    ++i;
                }
            }
        }

        return itemstack != null && i > 0;
    }

    /**
     * Returns an Item that is the result of this recipe
     */
    public ItemStack getCraftingResult(InventoryCrafting par1InventoryCrafting)
    {
        int i = 0;
        ItemStack itemstack = null;

        for (int j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
        {
            ItemStack itemstack1 = par1InventoryCrafting.getStackInSlot(j);

            if (itemstack1 != null)
            {
                if (itemstack1.getItem() == Items.filled_map)
                {
                    if (itemstack != null)
                    {
                        return null;
                    }

                    itemstack = itemstack1;
                }
                else
                {
                    if (itemstack1.getItem() != Items.map)
                    {
                        return null;
                    }

                    ++i;
                }
            }
        }

        if (itemstack != null && i >= 1)
        {
            ItemStack itemstack2 = new ItemStack(Items.filled_map, i + 1, itemstack.getItemDamage());

            if (itemstack.hasDisplayName())
            {
                itemstack2.func_151001_c(itemstack.getDisplayName());
            }

            return itemstack2;
        }
        else
        {
            return null;
        }
    }

    /**
     * Returns the size of the recipe area
     */
    public int getRecipeSize()
    {
        return 9;
    }

    public ItemStack getRecipeOutput()
    {
        return null;
    }
}