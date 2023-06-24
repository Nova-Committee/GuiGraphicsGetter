package committee.nova.guigraphicsgetter.api;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiGraphics;

public interface IGuiGraphicsGetter {
    GuiGraphics getGuiGraphics();

    GuiGraphics getGuiGraphicsWithPose(PoseStack pose);
}
