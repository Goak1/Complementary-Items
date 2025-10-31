package net.goak.complementarymod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.model.json.Transformation;
import net.minecraft.util.Identifier;

public class ComplementaryModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register item models - this is crucial for textures to load
        registerItemModels();
    }
    private void registerItemModels() {
        // In newer Fabric versions, items are automatically registered if the model file exists
        // But you can add debug logging here
        ComplementaryItems.LOGGER.info("Client-side initialization complete");
    }
}

