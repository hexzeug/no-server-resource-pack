package com.hexzeug.noserverresourcepack.mixin.client;

import net.minecraft.resource.ResourcePackProfile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ResourcePackProfile.class)
public class DisableAllResourcePacksMixin {
	@Inject(at = @At("RETURN"), method = "isAlwaysEnabled", cancellable = true)
	private void nothingIsAlwaysEnabled(CallbackInfoReturnable<Boolean> info) {
		info.setReturnValue(false);
	}
	@Inject(at = @At("RETURN"), method = "isPinned", cancellable = true)
	private void nothingIsPinned(CallbackInfoReturnable<Boolean> info) {
		info.setReturnValue(false);
	}
}