package alanstar.ancientchineseweapons.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemNameTag;
import net.minecraft.item.ItemStack;
import alanstar.ancientchineseweapons.item.ItemRegistryHandler;

public class Tabancientchineseweapons extends CreativeTabs
{
    public static final Tabancientchineseweapons TABANCIENTCHINESEWEAPONS = new Tabancientchineseweapons();

    public Tabancientchineseweapons()
    {
        super("Tabancientchineseweapons");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemRegistryHandler.DIRT_BLOCK);
    }

    @Override
    public boolean hasSearchBar()
    {
        return false;
    }

    @Override
    public int getSearchbarWidth()
    {
        return 45;
    }
}
