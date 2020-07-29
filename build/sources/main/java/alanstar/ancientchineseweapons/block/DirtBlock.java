package alanstar.ancientchineseweapons.block;

import alanstar.ancientchineseweapons.creativetab.Tabancientchineseweapons;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import alanstar.ancientchineseweapons.ancientchineseweapons;

public class DirtBlock extends Block
{
    public DirtBlock()   /*泥块*/
    {
        this(Material.GROUND);
        this.setUnlocalizedName(ancientchineseweapons.MODID + ".dirtblock");
        this.setCreativeTab(Tabancientchineseweapons.TABANCIENTCHINESEWEAPONS);/*引用setCreativeTab方法*/
        this.setRegistryName("dirt_block");
        this.setHarvestLevel("shovel", 0);
        this.setHardness(0.5F);
    }

    private DirtBlock(Material material)
    {
        super(Material.GROUND);
    }
}