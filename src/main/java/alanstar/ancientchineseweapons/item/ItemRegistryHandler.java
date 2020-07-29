package alanstar.ancientchineseweapons.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import alanstar.ancientchineseweapons.block.BlockRegistryHandler;


@EventBusSubscriber
public class ItemRegistryHandler
{
    public static final ItemDirtBall DIRT_BALL = new ItemDirtBall();
    public static final ItemBlock DIRT_BLOCK = withRegistryName(new ItemBlock(BlockRegistryHandler.DIRT_BLOCK));
    public static final ItemBlock HARDENED_CLAY_BRICK = withRegistryName(new ItemBlock(BlockRegistryHandler.HARDENED_CLAY_BRICK));
    public static final ItemBlock BRICK_SLAB = withRegistryName(new ItemBlock(BlockRegistryHandler.BRICK_SLAB));

    private static ItemBlock withRegistryName(ItemBlock item)
    {
        item.setRegistryName(item.getBlock().getRegistryName());
        return item;
    }

    @SubscribeEvent
    public static void onRegistry(Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(DIRT_BALL);    /*执行注册*/
        registry.register(DIRT_BLOCK);    /*执行注册*/
        registry.register(HARDENED_CLAY_BRICK);    /*执行注册*/
        registry.register(BRICK_SLAB);    /*执行注册*/
    }
    @SideOnly(Side.CLIENT)
    private static void registerModel(Item item)
    {
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event)
    {
        registerModel(DIRT_BALL);    /*注册模型*/
        registerModel(DIRT_BLOCK);    /*注册模型*/
        registerModel(HARDENED_CLAY_BRICK);    /*注册模型*/
        registerModel(BRICK_SLAB);    /*注册模型*/
    }
}
