package plugin.shadypaws.worldcontrol;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public Utils utils = new Utils();
    PluginManager pm = getServer().getPluginManager();

    @EventHandler
    public void onEnable() {
        if(getServer().getPluginManager().isPluginEnabled("Multiverse-Core")) {
            getLogger().info("Multiverse was successfully found, requesting hook");
        }
        else if(!getServer().getPluginManager().isPluginEnabled("Multiverse-Core")) {
            getLogger().info("Multiverse-Core was an Invaild Plugin. WorldControl now Disabling");
            getServer().getPluginManager().disablePlugin(this);
        }
        getLogger().info("World Control has been enabled efficiently");
        saveDefaultConfig();
        this.pm.registerEvents(new MainGUI(), this);
    }


        public void onDisable(){
    }



    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player p = (Player) sender;
            if(cmd.getName().equalsIgnoreCase("worldcontrol")){
            utils.message(p, "&b&lWorld&3&l Control&8 ┃&7 Main Menu has been opened");
                MainGUI.main(p);
                p.openInventory(MainGUI.MainMenu);
            }

        return false;
    }
}
