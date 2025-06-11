package vergisst.minecraftmod.purplecraft.itemsManager

import net.minecraft.item.Item
import vergisst.minecraftmod.purplecraft.blocksManager.Blocks
import vergisst.minecraftmod.purplecraft.itemsManager.ItemCreator.register


object Items {
    // ITEMS
    val PURPLE_PADDLE = register("purple_paddle", Item(Item.Settings()))

    // From Blocks
    val SAMPLE_CANDLE = register(Blocks.SAMPLE_CANDLE)
}