package Events;

import main.mofurniture;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import util.Update_Checker;

public class UpdateCheckEvent {

	public boolean hasShowUp = false;
	
																				@SubscribeEvent
																				public void onPlayerTick(PlayerTickEvent event) {
																					if (Update_Checker.isNewVersionAvailable() && !hasShowUp) {
																						Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED  + "****************************************************************"
																																																 + ""
																													+ "Es ist eine Neue Version von MoFurniture Verfügbar! Version " + mofurniture.VERSION + "Downloade sie dir Hier http://moinmoin.mofood.bplaced.net/index.html"));
			hasShowUp = true;
		}
	}
		
}
