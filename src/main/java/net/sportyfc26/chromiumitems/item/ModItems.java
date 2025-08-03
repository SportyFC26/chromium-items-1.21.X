package net.sportyfc26.chromiumitems.item;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.sportyfc26.chromiumitems.ChromiumItems;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item CHROMIUM_INGOT = registerItem( "chromium_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ChromiumItems.MOD_ID, name), item);

    }

    public static void registerModItems() {
        ChromiumItems.LOGGER.info("Registering Mod Items For " + ChromiumItems.MOD_ID);
    }
}