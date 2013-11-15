package LOE.Code;

import java.util.Random;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Egrass extends Block {

	public Egrass(int par1, String texture) {
		super(par1, Material.grass);
		setCreativeTab(CreativeTabs.tabBlock); // place in creative tabs
	}

	public void registerIcons(IconRegister reg) { // Make sure to import
													// IconRegister!
	// this.blockIcon = reg.registerIcon("amethyst_block"); // You can also
	// replace blockID and blockIcon with itemID and itemIcon
	}
}