package vergisst.minecraftmod.purplecraft.client

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

class PurpleCraftDataGenerator : DataGeneratorEntrypoint {

    override fun onInitializeDataGenerator( fabricDataGenerator: FabricDataGenerator) {
        val pack = fabricDataGenerator.createPack();
    }
}
