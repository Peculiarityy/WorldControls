package plugin.shadypaws.worldcontrol;

import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @EventHandler
    public void onEnable() {
        getLogger().info("World Control has been enabled efficiently");
    }
}
