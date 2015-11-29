package util;

import Blöcke.TischOak;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MoTab {

	/*public static CreativeTabs MoFurniture=new CreativeTabs("MoFurniture"){@SideOnly(Side.CLIENT)public Item getTabIconItem(){return Item.getItemFromBlock(TischOak.TischOak);
	}

	};*/
	
	
	public static CreativeTabs MoFurniture=new CreativeTabs("MoFurniture"){@SideOnly(Side.CLIENT)public Item getTabIconItem(){return Item.getItemFromBlock(Blocks.crafting_table);
	}

	};
	
	
	//public static CreativeTabs MoDrinks=new CreativeTabs("MoDrinks"){@SideOnly(Side.CLIENT)public Item getTabIconItem(){return Tasse.Tasse;
	//}

	//};

	//Next Tab
}