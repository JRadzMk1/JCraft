package net.JRadz.jcraft.item;

import net.JRadz.jcraft.JCraft;
import net.JRadz.jcraft.item.custom.SubscriptionItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JCraft.MOD_ID);

    public static final RegistryObject<Item> SUBSCRIPTION = ITEMS.register("subscription",
            () -> new SubscriptionItem(new Item.Properties().tab(ModCreativeModeTab.JCRAFT_TAB).stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
