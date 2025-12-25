package com.r4men.cobblemon_manufactory;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = CobblemonManufactory.ID, dist = Dist.CLIENT)
//@EventBusSubscriber(modid = CobblemonManufactory.ID, value = Dist.CLIENT)
public class CobblemonManufactoryClient {
    public CobblemonManufactoryClient(ModContainer modContainer) {
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
}
