package vergisst.minecraftmod.purplecraft

import net.fabricmc.api.ModInitializer
import vergisst.minecraftmod.purplecraft.blocksManager.Blocks
import vergisst.minecraftmod.purplecraft.itemsManager.Items

const val MOD_ID = "purple_craft"

class PurpleCraft : ModInitializer {

    override fun onInitialize() {
        // elements in mod
        val items = Items
        val blocks = Blocks
    }
}
