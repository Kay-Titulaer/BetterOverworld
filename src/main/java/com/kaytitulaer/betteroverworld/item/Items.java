package com.kaytitulaer.betteroverworld.item;

import com.kaytitulaer.betteroverworld.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite", new Item(
            new FabricItemSettings().group(ItemGroup.MISC)
    ));

    public static final Item TANZANITE = registerItem("tanzanite", new Item(
            new FabricItemSettings().group(ItemGroup.MISC)
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MODID, name), item);
    }

    public static void registerItems() {
        Main.LOGGER.debug("Registering items for " +Main.MODID);
    }
}
