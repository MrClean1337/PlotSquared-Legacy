package com.plotsquared.nukkit.mixo;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import com.intellectualcrafters.plot.object.Plot;
import com.intellectualcrafters.plot.util.MainUtil;
import com.plotsquared.nukkit.events.PlayerEnterPlotEvent;

import java.util.UUID;

public class MixoListener implements Listener {

    @EventHandler
    public void onEnterPlot(PlayerEnterPlotEvent e){
        Plot plot = e.getPlot();
        final Player p = e.player;

        if(plot != null){
            if(plot.hasOwner()){
                final UUID owner = plot.getOwners().iterator().next();
                if(owner != null){
                    final String owner_name = MainUtil.getName(owner).replace("§e", "");

                    String rating_text = "Keine";
                    if(plot.hasRatings()){
                        double avg = Math.round(plot.getAverageRating() * 10) / 10.0;
                        rating_text = avg + "/10 (" + plot.getRatings().size() + "x)";
                    }

                    //p.sendPopup("§3Besitzer: §e" + owner_name + " §7| §3Bewertung: §e" + rating_text);
                    p.sendActionBar("§3Besitzer: §e" + owner_name + " §8| §3Bewertung: §e" + rating_text, 2, 3, 2);
                }
            } else {
                p.sendActionBar("§3Dieses Plot ist §efrei §3!", 2, 3, 2);
            }
        }
    }

}
