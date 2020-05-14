package com.plotsquared.nukkit.mixo;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemEdible;

public class Features {

    public static boolean isFood(Item item){
        return item instanceof ItemEdible;
    }

}
