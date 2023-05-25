package sdravstvuite.demironworld;

import org.bukkit.plugin.java.JavaPlugin;
import sdravstvuite.demironworld.Towny.TownyPl;

import static sdravstvuite.demironworld.Towny.TownyPl.registerCustomPlot;

public final class DemironWorld extends JavaPlugin {
    private static DemironWorld instance;
    public static DemironWorld getInstance() {
        return instance;
    }
    public void onLoad() {
        instance = this;
        registerCustomPlot();
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new TownyPl(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
