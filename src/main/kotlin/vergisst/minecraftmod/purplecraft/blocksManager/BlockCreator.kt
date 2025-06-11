package vergisst.minecraftmod.purplecraft.blocksManager

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.CandleBlock
import net.minecraft.block.MapColor
import net.minecraft.block.piston.PistonBehavior
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import vergisst.minecraftmod.purplecraft.MOD_ID

object BlockCreator {
    /**
     * BLOCK REGISTER
     */
    fun register (id: String, block: Block): Block {
        return Registry.register(Registries.BLOCK, Identifier(MOD_ID, id), block)
    }

    fun createCandleBlock (color: MapColor): CandleBlock {
        return CandleBlock(
            AbstractBlock.Settings.create()
                .mapColor(color)
                .nonOpaque()
                .strength(0.1f)
                .sounds(BlockSoundGroup.CANDLE)
                .luminance(CandleBlock.STATE_TO_LUMINANCE)
                .pistonBehavior(PistonBehavior.DESTROY)
        )
    }
}