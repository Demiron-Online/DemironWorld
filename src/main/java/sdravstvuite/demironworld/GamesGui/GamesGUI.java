package sdravstvuite.demironworld.GamesGui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GamesGUI {
    public void startGame(Player p){

    }
    public void getMachineGUI(){
        Inventory gui = Bukkit.createInventory(null, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Завод");
        ItemStack nothing = new ItemStack(Material.GLASS_PANE, 1);
        ItemMeta nothing_meta = nothing.getItemMeta();
        nothing_meta.setDisplayName(" ");
        nothing.setItemMeta(nothing_meta);
        for (0 )
    }
}
