package alanstar.ancientchineseweapons.block;

import alanstar.ancientchineseweapons.creativetab.Tabancientchineseweapons;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import alanstar.ancientchineseweapons.ancientchineseweapons;

public class BrickSlab extends Block
{
    public BrickSlab()    /*泥砖台阶*/
    {
        super(Material.GROUND);
        this.setUnlocalizedName(ancientchineseweapons.MODID + ".brickslab");
        this.setCreativeTab(Tabancientchineseweapons.TABANCIENTCHINESEWEAPONS);/*引用setCreativeTab方法*/
        this.setRegistryName("Brick_Slab");
        this.setHarvestLevel("pickaxe", 0);
        this.setHardness(0.5F);
    }
}