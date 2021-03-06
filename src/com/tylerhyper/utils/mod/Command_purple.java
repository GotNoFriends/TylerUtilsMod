package com.tylerhyper.utils.mod;

import java.util.Arrays;
import java.util.List;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Command_purple implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
     if (!sender.getName().equals("tylerhyperHD") && !sender.getName().equals("Triplewer"))
        {
            Player sender_p = Bukkit.getPlayer(sender.getName());
            sender_p.sendMessage(ChatColor.RED + "Only Tyler and Trip may use this command.\nNo permissions for the people who aren't purple.");
            sender_p.setHealth(0.0);
            return true;
        }
            if (args.length == 0)
        {
          for(Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack CamWool = new ItemStack(Material.WOOL, 1, (short)10);
                    for (Enchantment ench : Enchantment.values()) {
                     if (!ench.equals(Enchantment.DURABILITY)) {
                        CamWool.addUnsafeEnchantment(ench, 32767);
                      }
                    }
                    ItemMeta meta = CamWool.getItemMeta();
                    meta.setDisplayName(ChatColor.YELLOW + "Purple Aura");
                    Object lore = Arrays.asList(new String[] { ChatColor.BLUE + "This aura should protect", ChatColor.BLUE + "you from all possible harm." });
                    meta.setLore((List)lore);
                    CamWool.setItemMeta(meta);
                    World world = player.getWorld();
                    Location loc = player.getLocation();
                    inv.setHelmet(CamWool);
                    world.strikeLightningEffect(loc);
                }
                for(Player player : Bukkit.getOnlinePlayers())
                {
                World world = player.getWorld();
                Location loc = player.getLocation();
                Player sender_different = Bukkit.getPlayer(sender.getName());
                TFM_Util.adminAction(sender_different.getName(), "Gracing the world with purple!", false);
                world.strikeLightningEffect(loc);
                TFM_Util.adminAction(sender_different.getName(), "Gracing the world with purple!", false);
                world.strikeLightningEffect(loc);
                TFM_Util.adminAction(sender_different.getName(), "Gracing the world with purple!", false);
                world.strikeLightningEffect(loc);
                TFM_Util.adminAction(sender_different.getName(), "Gracing the world with purple!", false);
                world.strikeLightningEffect(loc);
                TFM_Util.adminAction(sender_different.getName(), "Gracing the world with purple!", false);
                world.strikeLightningEffect(loc);
                TFM_Util.adminAction(sender_different.getName(), "Gracing the world with purple!", false);
                world.strikeLightningEffect(loc);
                TFM_Util.adminAction(sender_different.getName(), "Gracing the world with purple!", false);
                world.strikeLightningEffect(loc);
                TFM_Util.adminAction(sender_different.getName(), "Gracing the world with purple!", false);
                world.strikeLightningEffect(loc);
                TFM_Util.adminAction(sender_different.getName(), "Gracing the world with purple!", false);
                world.strikeLightningEffect(loc);
                TFM_Util.adminAction(sender_different.getName(), "Gracing the world with purple!", false);
                world.strikeLightningEffect(loc);
                }
        for(Player player : Bukkit.getOnlinePlayers())
                {
                PlayerInventory inv = player.getInventory();
                ItemStack CamBow = new ItemStack(Material.BOW, 1);
                for (Enchantment ench : Enchantment.values()) {
                 CamBow.addUnsafeEnchantment(ench, 32767);
                }
                ItemMeta meta = CamBow.getItemMeta();
                meta.setDisplayName(ChatColor.DARK_AQUA + "The Purple Shot");
                Object lore = Arrays.asList(new String[] { ChatColor.BLUE + "Legend has it, this bow", ChatColor.BLUE + "can only shoot purple arrows!" });
                meta.setLore((List)lore);
                CamBow.setItemMeta(meta);
                inv.addItem(CamBow);
                ItemStack CamSword = new ItemStack(Material.GOLD_SWORD, 1);
                for (Enchantment ench : Enchantment.values()) {
                CamSword.addUnsafeEnchantment(ench, 32767);
                }
                ItemMeta sword = CamSword.getItemMeta();
                sword.setDisplayName(ChatColor.DARK_GREEN + "The Purple Blade");
                Object a = Arrays.asList(new String[] { ChatColor.BLUE + "The purple has the power", ChatColor.BLUE + "to wield this legendary blade!" });
                sword.setLore((List)a);
                CamSword.setItemMeta(sword);
                inv.addItem(CamSword);
                ItemStack CamArrow = new ItemStack(Material.ARROW, 1);
                for (Enchantment ench : Enchantment.values()) {
                      CamArrow.addUnsafeEnchantment(ench, 32767);
                }
                ItemMeta arrow = CamArrow.getItemMeta();
                arrow.setDisplayName(ChatColor.DARK_PURPLE + "Purple Arrow");
                Object b = Arrays.asList(new String[] { ChatColor.BLUE + "This arrow has a mysterious", ChatColor.BLUE + "purple aura around it..." });
                arrow.setLore((List)b);
                CamArrow.setItemMeta(arrow);
                inv.addItem(CamArrow);
                ItemStack CamChest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
                 for (Enchantment ench : Enchantment.values()) {
                if (!ench.equals(Enchantment.DURABILITY)) {
                  CamChest.addUnsafeEnchantment(ench, 32767);
                }
              }
               LeatherArmorMeta chest = (LeatherArmorMeta)CamChest.getItemMeta();
               chest.setDisplayName(ChatColor.YELLOW + "Purple Aura");
                 Object c = Arrays.asList(new String[] { ChatColor.BLUE + "This aura should protect", ChatColor.BLUE + "you from all possible harm." });
               chest.setLore((List)c);
               chest.setColor(Color.fromRGB(125, 20, 240));
               CamChest.setItemMeta(chest);
               inv.setChestplate(CamChest);
               ItemStack CamLegs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
               for (Enchantment ench : Enchantment.values()) {
                if (!ench.equals(Enchantment.DURABILITY)) {
                    CamLegs.addUnsafeEnchantment(ench, 32767);
                  }
               }
                 LeatherArmorMeta legs = (LeatherArmorMeta)CamLegs.getItemMeta();
                 legs.setDisplayName(ChatColor.YELLOW + "Purple Aura");
                 Object d = Arrays.asList(new String[] { ChatColor.BLUE + "This aura should protect", ChatColor.BLUE + "you from all possible harm." });
                 legs.setLore((List)d);
                 legs.setColor(Color.fromRGB(125, 20, 240));
                 CamLegs.setItemMeta(legs);
                 inv.setLeggings(CamLegs);
              ItemStack CamBoots = new ItemStack(Material.LEATHER_BOOTS, 1);
              for (Enchantment ench : Enchantment.values()) {
                if (!ench.equals(Enchantment.DURABILITY)) {
                     CamBoots.addUnsafeEnchantment(ench, 32767);
                  }
                }
               LeatherArmorMeta boots = (LeatherArmorMeta)CamBoots.getItemMeta();
               boots.setDisplayName(ChatColor.YELLOW + "Purple Aura");
               Object e = Arrays.asList(new String[] { ChatColor.BLUE + "This aura should protect", ChatColor.BLUE + "you from all possible harm." });
               boots.setLore((List)e);
               boots.setColor(Color.fromRGB(125, 20, 240));
                 CamBoots.setItemMeta(boots);
                 inv.setBoots(CamBoots);
                }
    }
    return true;
}
}
