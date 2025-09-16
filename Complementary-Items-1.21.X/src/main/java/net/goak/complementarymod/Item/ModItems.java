package net.goak.complementarymod.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.goak.complementarymod.ComplementaryItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    // Define and register the item properly
    public static final Item LETTUCE = registerItem("lettuce", new Item.Settings());

    // Helper method to register items with proper registry key setup
    private static Item registerItem(String name, Item.Settings itemSettings) {
        Identifier id = Identifier.of(ComplementaryItems.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = itemSettings.registryKey(key);

        return Registry.register(Registries.ITEM, key, new Item(settings));
    }

    // Method for registering items and adding them to creative tabs
    public static void registerModItems() {
        ComplementaryItems.LOGGER.info("Registering Mod Items for " + ComplementaryItems.MOD_ID);

        // Add the custom item(s) to the creative item groups
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LETTUCE);
        });
    }
}