package vergisst.minecraftmod.purplecraft.blocksManager

import net.minecraft.block.MapColor
import vergisst.minecraftmod.purplecraft.blocksManager.BlockCreator.createCandleBlock
import vergisst.minecraftmod.purplecraft.blocksManager.BlockCreator.register

object Blocks {
    val SAMPLE_CANDLE = register("candlest", createCandleBlock(MapColor.CYAN))
}