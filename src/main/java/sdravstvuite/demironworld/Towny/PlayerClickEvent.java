package sdravstvuite.demironworld.Towny;

import com.palmergames.bukkit.towny.Towny;
import com.palmergames.bukkit.towny.TownyUniverse;
import com.palmergames.bukkit.towny.event.TownBlockTypeRegisterEvent;
import com.palmergames.bukkit.towny.object.Resident;
import com.palmergames.bukkit.towny.object.TownBlock;
import com.palmergames.bukkit.towny.object.WorldCoord;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import sdravstvuite.demironworld.DemironWorld;

public class PlayerClickEvent implements Listener {
    DemironWorld plugin;
    public PlayerClickEvent(DemironWorld plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onClickInTownChunk(PlayerInteractEvent e){
        if(e.getAction() != Action.RIGHT_CLICK_BLOCK) return;
        if(e.getClickedBlock() == null) return;
        Player p = e.getPlayer();
        Resident resident = TownyUniverse.getInstance().getResident(p.getName());
        if (resident == null) return;
        Location loc = e.getClickedBlock().getLocation();
        WorldCoord worldCoord = WorldCoord.parseWorldCoord(loc);
        if (worldCoord.getTownBlockOrNull() == null) return;
        if (worldCoord.getTownBlockOrNull().getTypeName().equalsIgnoreCase("machine") &&
                e.getClickedBlock().getType() == Material.CRAFTING_TABLE) {
            e.setCancelled(true);
            p.sendMessage(worldCoord.getTownBlockOrNull().getType().toString());
            p.sendMessage(worldCoord.getTownBlockOrNull().getTypeName());
            p.sendMessage("Типа станочная");
        } else if (worldCoord.getTownBlockOrNull().getTypeName().equalsIgnoreCase("mint") &&
        e.getClickedBlock().getType() == Material.ANVIL) {
            e.setCancelled(true);
            p.sendMessage(worldCoord.getTownBlockOrNull().getType().toString());
            p.sendMessage(worldCoord.getTownBlockOrNull().getTypeName());
            p.sendMessage("Типа чеканка");
        }

    }
}
