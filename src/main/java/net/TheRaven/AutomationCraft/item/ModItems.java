package net.TheRaven.AutomationCraft.item;

import net.TheRaven.AutomationCraft.AutomationCraft;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            AutomationCraft.MOD_ID);

    public static final RegistryObject<Item> COPPERWIRE = ITEMS.register("copperwire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CIRCUTBOARD = ITEMS.register("circutboard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SIMPLEMACHINECORE = ITEMS.register("simplemachinecore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MACHINEPARTS = ITEMS.register("machineparts",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);

    }
}
