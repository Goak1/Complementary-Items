package net.goak.complementarymod.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.goak.complementarymod.ComplementaryItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

//    Registering items into the package (class) item from the net.minecraft src.
//    Which makes the items added later to be used and behaviour as an item from the game
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ComplementaryItems.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ComplementaryItems.LOGGER.info("Registering Mod Items for " + ComplementaryItems.MOD_ID);

        // Will add the custom item(s) to the creative item groups
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(LETTUCE));
    }

    public static final Item LETTUCE = registerItem("lettuce", new Item(new Item.Settings()));

}
