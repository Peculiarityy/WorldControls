package plugin.shadypaws.worldcontrol;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class Main extends JavaPlugin implements Listener {

    public ItemStack worlds, settings, currentWorld, close, reset, pane;
    Utils u = new Utils();
    public Inventory MainMenu;
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
        getServer().getPluginManager().registerEvents(this, this);
        MainMenu = Bukkit.createInventory(null, 45, "§8§lWorld Control");
        setupInventory();
    }


    public void setupInventory() {
        pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta paneMeta = pane.getItemMeta();
        paneMeta.setDisplayName(ChatColor.BLACK + "");
        pane.setItemMeta(paneMeta);
        int slot;
        while ((slot = MainMenu.firstEmpty()) != -1)
            MainMenu.setItem(slot, pane);
        worlds = new ItemStack(new ItemStack(Material.SNOW_BALL));
        ItemMeta sm = worlds.getItemMeta();
        sm.setDisplayName("§b§lWorlds");
        ArrayList<String> slore = new ArrayList();
        slore.add("§7View The Worlds");
        sm.setLore(slore);
        worlds.setItemMeta(sm);
        MainMenu.setItem(19, worlds);

        settings = new ItemStack(new ItemStack(Material.CHEST));
        ItemMeta sm1 = settings.getItemMeta();
        sm1.setDisplayName("§b§lSettings");
        ArrayList<String> slore1 = new ArrayList();
        slore1.add("§7Coming Soon!");
        sm1.setLore(slore1);
        settings.setItemMeta(sm1);
        MainMenu.setItem(25, settings);

        currentWorld = new ItemStack(new ItemStack(Material.SLIME_BALL));
        ItemMeta sm5 = currentWorld.getItemMeta();
        sm5.setDisplayName("§b§lCurrent World");
        ArrayList<String> slore5 = new ArrayList();
        slore5.add("§7Coming Soon!");
        sm5.setLore(slore1);
        currentWorld.setItemMeta(sm5);
        MainMenu.setItem(22, currentWorld);

        close = new ItemStack(new ItemStack(Material.ANVIL));
        ItemMeta sm3 = close.getItemMeta();
        sm3.setDisplayName("§c§lClose");
        ArrayList<String> slore3 = new ArrayList();
        slore3.add("§7Close This GUI");
        sm3.setLore(slore3);
        close.setItemMeta(sm3);
        MainMenu.setItem(39, close);

        reset = new ItemStack(new ItemStack(Material.GHAST_TEAR));
        ItemMeta sm4 = reset.getItemMeta();
        sm4.setDisplayName("§c§lReset");
        ArrayList<String> slore4 = new ArrayList();
        slore4.add("§7Reset All Changes");
        sm4.setLore(slore4);
        reset.setItemMeta(sm4);
        MainMenu.setItem(41, reset);
// Stained Glass beginning
    }
    @EventHandler
    public void menuClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemStack clicked = event.getCurrentItem();
        Inventory inventory = event.getInventory();
        if (inventory.getName().equals(MainMenu.getName())) {
            if (clicked.getType() == Material.SNOW_BALL && clicked.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lWorlds")) {
                event.setCancelled(true);         //stops player from actually taking that item
                u.message(player, "&b&lWorld&3&l Control&8 ┃&7 Opening Worlds GUI."); //just chat
            }
            if (clicked.getType() == Material.CHEST && clicked.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lSettings")) {
                event.setCancelled(true);         //stops player from actually taking that item
                u.message(player, "&b&lWorld&3&l Control&8 (&cLocked&8)&8 ┃&7 Under Construction! "); //just chat
            }
            if (clicked.getType() == Material.ANVIL && clicked.getItemMeta().getDisplayName().equalsIgnoreCase("§c§lClose")) {
                event.setCancelled(true);         //stops player from actually taking that item
                u.message(player, "&b&lWorld&3&l Control&8 ┃&7 You've closed the WorldControl GUI."); //just chat
                player.closeInventory();
            }
            if (clicked.getType() == Material.GHAST_TEAR && clicked.getItemMeta().getDisplayName().equalsIgnoreCase("§c§lReset")) {
                event.setCancelled(true);         //stops player from actually taking that item
                u.message(player, "&b&lWorld&3&l Control&8 ┃&7 All past changes were reset."); //just chat
                player.closeInventory();
            }
            if (clicked.getType() == Material.SLIME_BALL && clicked.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lCurrent World")) {
                event.setCancelled(true);         //stops player from actually taking that item
                u.message(player, "&b&lWorld&3&l Control&8 ┃&7 Opening GUI for current world &b" + player.getLocation().getWorld() + "&7."); //just chat
                player.closeInventory();
            }
            if (clicked.getType() == Material.STAINED_GLASS_PANE && clicked.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLACK + "")) {
                event.setCancelled(true);
            }
        }
    }





    public boolean onCommand(CommandSender sender, Command cmd, String l, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Console Cannot Use Worlds Controls. Period!");
        return true;
        }
        final Player p = (Player) sender;

            if(cmd.getName().equalsIgnoreCase("worldcontrol")){
            u.message(p, "&b&lWorld&3&l Control&8 ┃&7 Main Menu has been opened");
                p.openInventory(MainMenu);
            }

        return false;
    }
  }