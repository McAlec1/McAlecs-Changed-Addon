
package net.mcalecs.changed_addon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcalecs.changed_addon.entity.TestingMobEntity;
import net.mcalecs.changed_addon.client.model.Modelmodel;

public class TestingMobRenderer extends MobRenderer<TestingMobEntity, Modelmodel<TestingMobEntity>> {
	public TestingMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodel(context.bakeLayer(Modelmodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TestingMobEntity entity) {
		return new ResourceLocation("mcalecs_changed_addon:textures/entities/skin.png");
	}
}
