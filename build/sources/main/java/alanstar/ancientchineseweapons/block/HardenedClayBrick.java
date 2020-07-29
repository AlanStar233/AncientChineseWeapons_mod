package alanstar.ancientchineseweapons.block;

import alanstar.ancientchineseweapons.creativetab.Tabancientchineseweapons;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import alanstar.ancientchineseweapons.ancientchineseweapons;

public class HardenedClayBrick extends Block
{
    public HardenedClayBrick()   /*硬化土砖*/
    {
        this(Material.GROUND);
        this.setUnlocalizedName(ancientchineseweapons.MODID + ".hardenedclaybrick");
        this.setCreativeTab(Tabancientchineseweapons.TABANCIENTCHINESEWEAPONS);/*引用setCreativeTab方法*/
        this.setRegistryName("hardened_clay_brick");
        this.setHarvestLevel("pickaxe", 0);
        this.setHardness(0.5F);
    }

    private HardenedClayBrick(Material material)
    {
        super(Material.GROUND);
    }
}
