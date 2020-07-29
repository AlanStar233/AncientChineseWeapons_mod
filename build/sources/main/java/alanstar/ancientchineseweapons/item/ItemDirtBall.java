package alanstar.ancientchineseweapons.item;

import alanstar.ancientchineseweapons.creativetab.Tabancientchineseweapons;
import net.minecraft.item.Item;
import alanstar.ancientchineseweapons.ancientchineseweapons;

public class ItemDirtBall extends Item
{
    public ItemDirtBall()
    {
        this.setUnlocalizedName(ancientchineseweapons.MODID + ".dirtBall");
        this.setCreativeTab(Tabancientchineseweapons.TABANCIENTCHINESEWEAPONS);
        this.setRegistryName("dirt_ball");
        this.setMaxStackSize(16);
    }
}