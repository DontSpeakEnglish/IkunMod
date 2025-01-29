package name.xiaoheizi.ikunmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item registerItems(String id, Item item) {
        return (Item) Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.ofVanilla(id)), item);
    }
}
