package com.kaytitulaer.betteroverworld.mixin;

import com.kaytitulaer.betteroverworld.Main;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@org.spongepowered.asm.mixin.Mixin(TitleScreen.class)
public class Mixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Main.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
