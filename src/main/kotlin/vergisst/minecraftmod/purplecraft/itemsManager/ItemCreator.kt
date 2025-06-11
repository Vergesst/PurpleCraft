package vergisst.minecraftmod.purplecraft.itemsManager

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.util.Identifier

object ItemCreator {
    /**
     * RegistryKey<Item>, Item -> Item
     */
    fun register(key: RegistryKey<Item>, item: Item): Item {
        if (item is BlockItem) {
            (item as BlockItem)
                .appendBlocks(Item.BLOCK_ITEMS, item)
        }
        return Registry.register(Registries.ITEM, key, item)
    }

    /**
     * Identifier， Item -> Item
     */
    fun register(id: Identifier, item: Item): Item {
        return register(
            RegistryKey.of(Registries.ITEM.key, id),
            item
        )
    }

    /**
     * Block, Item -> Item
     */
    fun register(block: Block, item: Item): Item {
        return register(
            Registries.BLOCK.getId(block),
            item
        )
    }

    fun register(item: BlockItem): Item {
        return register(item.block, item)
    }

    fun register(id: String, item: Item): Item {
        return register(Identifier(id), item)
    }

    // for block
    fun register(block: Block): Item {
        return register(BlockItem(block, Item.Settings()))
    }
}