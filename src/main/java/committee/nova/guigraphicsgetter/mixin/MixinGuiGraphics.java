package committee.nova.guigraphicsgetter.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import committee.nova.guigraphicsgetter.api.IGuiGraphics;
import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(GuiGraphics.class)
public class MixinGuiGraphics implements IGuiGraphics {
    @Mutable
    @Shadow
    @Final
    private PoseStack pose;

    @Override
    public void setPose(PoseStack pose) {
        this.pose = pose;
    }
}
