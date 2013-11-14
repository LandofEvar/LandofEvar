package LOE.Code;

import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "landofEvar", name = "Land Of Evar", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class landofEvar {

	@Init
	public void load(FMLInitializationEvent event) {

	}
}