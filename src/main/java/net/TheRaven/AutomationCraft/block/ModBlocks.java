package net.TheRaven.AutomationCraft.block;

import net.TheRaven.AutomationCraft.AutomationCraft;
import net.TheRaven.AutomationCraft.block.custom.Asphalt;
import net.TheRaven.AutomationCraft.item.ModItems;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.SoundType;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AutomationCraft.MOD_ID);
    public static final RegistryObject<Block> ASPHALT_BLOCK = registerBlock("asphalt_block",
            () -> new Asphalt(BlockBehaviour.Properties.of().mapColor(MapColor.METAL)
                    .sound(SoundType.BASALT)
                    .strength(1.0F)));


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
}
