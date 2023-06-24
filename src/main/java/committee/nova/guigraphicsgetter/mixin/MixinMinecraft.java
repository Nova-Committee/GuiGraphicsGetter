package committee.nova.guigraphicsgetter.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import committee.nova.guigraphicsgetter.api.IGuiGraphics;
import committee.nova.guigraphicsgetter.api.IGuiGraphicsGetter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderBuffers;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Minecraft.class)
public class MixinMinecraft implements IGuiGraphicsGetter {
    @Shadow
    @Final
    private RenderBuffers renderBuffers;

    @Override
    public GuiGraphics getGuiGraphics() {
        return new GuiGraphics((Minecraft) (Object) this, renderBuffers.bufferSource());
    }

    @Override
    public GuiGraphics getGuiGraphicsWithPose(PoseStack pose) {
        final GuiGraphics graphics = getGuiGraphics();
        ((IGuiGraphics) graphics).setPose(pose);
        return graphics;
    }
}
