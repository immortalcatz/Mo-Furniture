package proxy;


import Blöcke.TischAcacia;
import Blöcke.TischBirch;
import Blöcke.TischDarkOak;
import Blöcke.TischJungle;
import Blöcke.TischOak;
import Blöcke.TischSpruce;

import main.mofurniture;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends ServerProxy {

	
	public void registerItemRender() {
		
		registerItemMesh(TischBirch.TischBirch);
		registerItemMesh(TischOak.TischOak);
		registerItemMesh(TischDarkOak.TischDarkOak);
		registerItemMesh(TischSpruce.TischSpruce);
		registerItemMesh(TischAcacia.TischAcacia);
		registerItemMesh(TischJungle.TischJungle);


}
	
	
	public void registerItemMesh(Block block){
		  String Name = block.getUnlocalizedName().toString().substring(block.getUnlocalizedName().toString().indexOf(".") + 1, block.getUnlocalizedName().toString().length());
		  Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0, new ModelResourceLocation(mofurniture.MODID + ":" + Name ,"inventory"));
	}
		 
	public void registerItemMesh(Item item){
		  String Name = item.getUnlocalizedName().toString().substring(item.getUnlocalizedName().toString().indexOf(".") + 1, item.getUnlocalizedName().toString().length());
		  Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0, new ModelResourceLocation(mofurniture.MODID + ":" + Name ,"inventory"));
	}
}
