package name.xiaoheizi.ikunmod.item;

import name.xiaoheizi.ikunmod.IkunMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item KUNKUN = registerItems("kunkun", new Item(new Item.Settings()));

    private static Item registerItems(String id, Item item) {
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(IkunMod.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(IkunMod.MOD_ID, id), item);
    }

    public static void RegisterModItems() {
        IkunMod.LOGGER.info("Registering Mod Items for " + IkunMod.MOD_ID);
    }
}
