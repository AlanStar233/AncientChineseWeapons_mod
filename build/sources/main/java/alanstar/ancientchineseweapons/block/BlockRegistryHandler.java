package alanstar.ancientchineseweapons.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;


@EventBusSubscriber
public class BlockRegistryHandler
{
    public static final DirtBlock DIRT_BLOCK = new DirtBlock();    /*注册泥块*/
    public static final HardenedClayBrick HARDENED_CLAY_BRICK = new HardenedClayBrick();    /*注册硬化土砖*/
    public static final BrickSlab BRICK_SLAB = new BrickSlab();    /*注册泥砖台阶*/
    @SubscribeEvent
    public static void onRegistry(Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(DIRT_BLOCK);    /*监听注册事件*/
        registry.register(HARDENED_CLAY_BRICK);    /*监听注册事件*/
        registry.register(BRICK_SLAB);    /*监听注册事件*/
    }
}

