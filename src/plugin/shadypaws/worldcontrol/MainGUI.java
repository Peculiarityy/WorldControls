package plugin.shadypaws.worldcontrol;

import com.avaje.ebean.annotation.Encrypted;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MainGUI implements Listener {

    Utils u = new Utils();


    public static Inventory MainMenu = Bukkit.createInventory(null, 45, "§8§lWorld Control");

    public static void main(Player p) {
        ItemStack worlds = new ItemStack(new ItemStack(Material.SNOW_BALL));
        ItemMeta sm = worlds.getItemMeta();
        sm.setDisplayName("§b§lWorlds");
        ArrayList<String> slore = new ArrayList();
        slore.add("§7View The Worlds");
        sm.setLore(slore);
        worlds.setItemMeta(sm);
        MainMenu.setItem(19, worlds);

        ItemStack settings = new ItemStack(new ItemStack(Material.CHEST));
        ItemMeta sm1 = settings.getItemMeta();
        sm1.setDisplayName("§b§lSettings");
        ArrayList<String> slore1 = new ArrayList();
        slore1.add("§7Coming Soon!");
        sm1.setLore(slore1);
        settings.setItemMeta(sm1);
        MainMenu.setItem(25, settings);

        ItemStack currentWorld = new ItemStack(new ItemStack(Material.SLIME_BALL));
        ItemMeta sm5 = currentWorld.getItemMeta();
        sm5.setDisplayName("§b§lCurrent World");
        ArrayList<String> slore5 = new ArrayList();
        slore5.add("§7Coming Soon!");
        sm5.setLore(slore1);
        currentWorld .setItemMeta(sm5);
        MainMenu.setItem(22, currentWorld );

        ItemStack close = new ItemStack(new ItemStack(Material.ANVIL));
        ItemMeta sm3 = close.getItemMeta();
        sm3.setDisplayName("§c§lClose");
        ArrayList<String> slore3 = new ArrayList();
        slore3.add("§7Close This GUI");
        sm3.setLore(slore3);
        close.setItemMeta(sm3);
        MainMenu.setItem(39, close);

        ItemStack reset = new ItemStack(new ItemStack(Material.GHAST_TEAR));
        ItemMeta sm4 = reset.getItemMeta();
        sm4.setDisplayName("§c§lReset");
        ArrayList<String> slore4 = new ArrayList();
        slore4.add("§7Reset All Changes");
        sm4.setLore(slore4);
        reset.setItemMeta(sm4);
        MainMenu.setItem(41, reset);
// Stained Glass beginning
        ItemStack pane0 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta paneMeta0 = pane0.getItemMeta();
        paneMeta0.setDisplayName(ChatColor.BLACK + "");
        pane0.setItemMeta(paneMeta0);
        MainMenu.setItem(0, pane0);

        ItemStack pane1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta paneMeta1 = pane1.getItemMeta();
        paneMeta1.setDisplayName(ChatColor.BLACK + "");
        pane1.setItemMeta(paneMeta1);
        MainMenu.setItem(1, pane1);

        ItemStack pane2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta paneMeta2 = pane2.getItemMeta();
        paneMeta2.setDisplayName(ChatColor.BLACK + "");
        pane2.setItemMeta(paneMeta2);
        MainMenu.setItem(2, pane1);

        ItemStack pane3 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta paneMeta3 = pane3.getItemMeta();
        paneMeta3.setDisplayName(ChatColor.BLACK + "");
        pane3.setItemMeta(paneMeta3);
        MainMenu.setItem(3, pane1);

        ItemStack pane4 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta paneMeta4 = pane4.getItemMeta();
        paneMeta4.setDisplayName(ChatColor.BLACK + "");
        pane4.setItemMeta(paneMeta4);
        MainMenu.setItem(4, pane1);

        ItemStack pane5 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta paneMeta5 = pane5.getItemMeta();
        paneMeta5.setDisplayName(ChatColor.BLACK + "");
        pane5.setItemMeta(paneMeta5);
        MainMenu.setItem(5, pane5);

        ItemStack pane6 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta paneMeta6 = pane6.getItemMeta();
        paneMeta6.setDisplayName(ChatColor.BLACK + "");
        pane6.setItemMeta(paneMeta6);
        MainMenu.setItem(6, pane6);

        ItemStack pane7 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta paneMeta7 = pane7.getItemMeta();
        paneMeta7.setDisplayName(ChatColor.BLACK + "");
        pane7.setItemMeta(paneMeta7);
        MainMenu.setItem(7, pane7);

        ItemStack pane8 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        ItemMeta paneMeta8 = pane1.getItemMeta();
        paneMeta8.setDisplayName(ChatColor.BLACK + "");
        pane8.setItemMeta(paneMeta8);
        MainMenu.setItem(8, pane8);

        ItemStack pane36 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        paneMeta8.setDisplayName(ChatColor.BLACK + "");
        pane36.setItemMeta(paneMeta8);
        MainMenu.setItem(36, pane8);

        ItemStack pane37 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        paneMeta8.setDisplayName(ChatColor.BLACK + "");
        pane37.setItemMeta(paneMeta8);
        MainMenu.setItem(37, pane8);

        ItemStack pane38 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        paneMeta8.setDisplayName(ChatColor.BLACK + "");
        pane38.setItemMeta(paneMeta8);
        MainMenu.setItem(38, pane8);

        ItemStack pane40 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        paneMeta8.setDisplayName(ChatColor.BLACK + "");
        pane40.setItemMeta(paneMeta8);
        MainMenu.setItem(40, pane8);

        ItemStack pane42 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        paneMeta8.setDisplayName(ChatColor.BLACK + "");
        pane42.setItemMeta(paneMeta8);
        MainMenu.setItem(42, pane8);
        ItemStack pane43 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        paneMeta8.setDisplayName(ChatColor.BLACK + "");
        pane43.setItemMeta(paneMeta8);
        MainMenu.setItem(43, pane8);
        ItemStack pane44 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
        paneMeta8.setDisplayName(ChatColor.BLACK + "");
        pane44.setItemMeta(paneMeta8);
        MainMenu.setItem(44, pane8);
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
}

