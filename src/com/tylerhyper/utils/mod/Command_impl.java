package com.tylerhyper.utils.mod;

import static com.tylerhyper.utils.mod.TylerUtilsMod.server;
import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerData;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import com.tylerhyper.utils.mod.TylerUtilsMod;
import org.bukkit.Bukkit;
import static org.bukkit.Bukkit.getPlayer;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;
import static sun.audio.AudioPlayer.player;

public class Command_impl implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        
   if (TFM_AdminList.isSuperAdmin(sender)) {
    if (args.length == 0)
    {
        sender.sendMessage(ChatColor.GOLD + "Please enter one of the usages below.");
        return false;
    }
    else if (args.length == 1)
    {
        return false;
    }

    if (args.length == 2)
    {
      if (args[0].equalsIgnoreCase("exterminate"))
      {
        Server server = Bukkit.getServer();
        final Player p;
        p = getPlayer(args[1]);
        TFM_Util.adminAction(sender.getName(), "Exterminating " + p.getName() + "...", true);
        final Location pos1 = p.getLocation();

            for (int x = -1; x <= 1; x++) {
              for (int z = -1; z <= 1; z++)
              {
                Location pos2 = new Location(pos1.getWorld(), pos1.getBlockX() + x, pos1.getBlockY(), pos1.getBlockZ() + z);
                pos1.getWorld().strikeLightning(pos2);
              }
            }

        p.getLocation().getWorld().createExplosion(p.getLocation(), 3.0F);

            p.teleport(new Location(p.getLocation().getWorld(), p.getLocation().getBlockX(), 0.0D, p.getLocation().getBlockZ()));
            p.setVelocity(new Vector(0, -10, 0));        


        TFM_PlayerData playerdata = TFM_PlayerData.getPlayerData(p);
        
        playerdata.setCaged(true, pos1, Material.GLASS, Material.AIR);
      }
      else if (args[0].equalsIgnoreCase("jelly"))
      {
        final Player p;
        p = getPlayer(args[1]);
        final Location loc = p.getLocation();
        TFM_Util.bcastMsg("Hey " + p.getName() + ", what's the difference between jelly and jam?", ChatColor.RED);
        for (int x = -1; x <= 1; x++) {
          for (int z = -1; z <= 1; z++)
          {
            Location strikePos = new Location(loc.getWorld(), loc.getBlockX() + x, loc.getBlockY(), loc.getBlockZ() + z);
            loc.getWorld().strikeLightning(strikePos);
          }
        }
            TFM_Util.bcastMsg("I can't jelly my banhammer up your ass.", ChatColor.RED);
            loc.getWorld().createExplosion(loc, 3.0F);
            p.setHealth(0.0D);
            p.closeInventory();
            p.getInventory().clear();
            server.dispatchCommand(sender, "co rollback p:" + player.getName() + " t:24h r:global #silent");
            String userIP = p.getAddress().getAddress().getHostAddress();
            String[] IPParts = userIP.split("\\.");
            if (IPParts.length == 4) {
              userIP = String.format("%s.%s.*.*", new Object[] { IPParts[0], IPParts[1] });
            }
           
            server.dispatchCommand(sender, "glist ban " + p.getName());
            p.kickPlayer(ChatColor.RED + "You couldn't handle the banhammer.");
      }
      else if (args[0].equalsIgnoreCase("rimjob"))
      {
        final Player p;
        p = getPlayer(args[1]);
        final Location loc = p.getLocation();
        TFM_Util.bcastMsg("Hey " + p.getName() + ", what's the difference between a rimjob and a blowjob?", ChatColor.RED);
        for (int x = -1; x <= 1; x++) {
          for (int z = -1; z <= 1; z++)
          {
            Location strikePos = new Location(loc.getWorld(), loc.getBlockX() + x, loc.getBlockY(), loc.getBlockZ() + z);
            loc.getWorld().strikeLightning(strikePos);
          }
        }
            TFM_Util.bcastMsg("I can't rim my blowhammer up your ass.", ChatColor.RED);
            loc.getWorld().createExplosion(loc, 3.0F);
            p.setHealth(0.0D);
            p.closeInventory();
            p.getInventory().clear();
            server.dispatchCommand(sender, "co rollback p:" + player.getName() + " t:24h r:global #silent");
            String userIP = p.getAddress().getAddress().getHostAddress();
            String[] IPParts = userIP.split("\\.");
            if (IPParts.length == 4) {
             userIP = String.format("%s.%s.*.*", new Object[] { IPParts[0], IPParts[1] });           
            server.dispatchCommand(sender, "glist ban " + p.getName());
            p.kickPlayer(ChatColor.RED + "You couldn't handle the banhammer.");
          }
      }
      else if (args[0].equalsIgnoreCase("csg"))
      {
        Player p;
        p = getPlayer(args[1]);
        TFM_Util.bcastMsg(p.getName() + " has been a naughty, naughty boy.");
        Location l = p.getLocation();
        for (int x = -1; x <= 1; x++) {
          for (int z = -1; z <= 1; z++)
          {
            Location strikePos = new Location(l.getWorld(), l.getBlockX() + x, l.getBlockY(), l.getBlockZ() + z);
            l.getWorld().strikeLightning(strikePos);
          }
        }
        TFM_PlayerData playerdata = TFM_PlayerData.getPlayerData(p);
        playerdata.setCaged(true, l, Material.GLASS, Material.AIR);
        p.teleport(new Location(l.getWorld(), l.getBlockX(), 120.0D, l.getBlockZ()));
        p.setVelocity(new Vector(0, 10, 0));
        p.teleport(new Location(l.getWorld(), l.getBlockX(), 0.0D, l.getBlockZ()));
        p.setVelocity(new Vector(0, -10, 0));
        p.setHealth(0.0D);
      }
      else if (args[0].equalsIgnoreCase("wtf"))
      {
        Player p;
        p = getPlayer(args[1]);
        TFM_Util.bcastMsg(p.getName() + " is being a damn idiot.", ChatColor.RED);
        p.sendMessage(ChatColor.RED + "What the hell are you doing you damn idiot?");
        Location l = p.getLocation();
        for (int x = -1; x <= 1; x++) {
          for (int z = -1; z <= 1; z++)
          {
            Location strikePos = new Location(l.getWorld(), l.getBlockX() + x, l.getBlockY(), l.getBlockZ() + z);
            l.getWorld().strikeLightning(strikePos);
          }
        }
        p.setHealth(0.0D);
      }
      else if (args[0].equalsIgnoreCase("fgt"))
      {
        Player p;
        p = getPlayer(args[1]);
        TFM_Util.bcastMsg(p.getName() + " doesn't know when to stop.", ChatColor.RED);
        p.getInventory().clear();
        p.closeInventory();
        p.setHealth(0.0D);
        Location l = p.getLocation();
        for (int x = -1; x <= 1; x++) {
          for (int z = -1; z <= 1; z++)
          {
            Location strikePos = new Location(l.getWorld(), l.getBlockX() + x, l.getBlockY(), l.getBlockZ() + z);
            l.getWorld().strikeLightning(strikePos);
          }
        }
      }
      else if (args[0].equalsIgnoreCase("drown"))
      {
        Player p;
        p = getPlayer(args[1]);
        TFM_PlayerData playerdata = TFM_PlayerData.getPlayerData(p);
        Player sender_p = Bukkit.getPlayer(sender.getName());
        TFM_Util.adminAction(sender_p.getName(), "Drowning " + p.getName(), true);
        if (TFM_AdminList.isSuperAdmin(p))
        {
        playerdata.setCommandsBlocked(false);
        }
        else {
        playerdata.setCommandsBlocked(true);
        }
        playerdata.setHalted(true);
        playerdata.setFrozen(true);
        playerdata.setMuted(true);
        p.setGameMode(GameMode.SURVIVAL);
        playerdata.setCaged(true, p.getLocation(), Material.GLASS, Material.WATER);
      }
    }
    else {
      return false;
    }
  }
   return true;
  }
  
  private void cancelLockup(TFM_PlayerData playerdata)
  {
    BukkitTask lockupScheduleID = playerdata.getLockupScheduleID();
    if (lockupScheduleID != null)
    {
      lockupScheduleID.cancel();
      playerdata.setLockupScheduleID(null);
    }
  }
}
