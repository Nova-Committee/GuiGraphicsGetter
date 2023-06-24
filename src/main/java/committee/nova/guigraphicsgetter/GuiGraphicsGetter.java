package committee.nova.guigraphicsgetter;

import com.mojang.blaze3d.vertex.PoseStack;
import committee.nova.guigraphicsgetter.api.IGuiGraphicsGetter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

public class GuiGraphicsGetter {
    public static GuiGraphics getGuiGraphics(Minecraft mc) {
        return ((IGuiGraphicsGetter) mc).getGuiGraphics();
    }

    public static GuiGraphics getGuiGraphicsWithPose(Minecraft mc, PoseStack pose) {
        return ((IGuiGraphicsGetter) mc).getGuiGraphicsWithPose(pose);
    }
}
