package com.grimalkinAspirant.cobblemonminestuck.items;

import com.grimalkinAspirant.cobblemonminestuck.CobblemonMinestuck;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobblemonMinestuck.MODID);

    public static final DeferredItem<Item> PKMN_STORAGE_DISK = ITEMS.register("pkmn_storage_disk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRLY_CANDY = ITEMS.register("grly_candy",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROLY_CANDY = ITEMS.register("broly_candy",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GENDER_CANDIES = ITEMS.register("gender_candies",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
