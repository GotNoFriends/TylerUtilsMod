package com.tylerhyper.utils.mod;

// Implements TotalFreedom so it runs with the mod //
import me.StevenLawson.TotalFreedomMod.Commands.AdminLevel;
import me.StevenLawson.TotalFreedomMod.Commands.CommandParameters;
import me.StevenLawson.TotalFreedomMod.Commands.CommandPermissions;
import me.StevenLawson.TotalFreedomMod.Commands.SourceType;
import me.StevenLawson.TotalFreedomMod.Commands.TFM_Command;
// Would be glad if someone could unimplement this part //

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH)
@CommandParameters(description = "Disables telnet in a single command.", usage = "/<command> [on/off]")
public class Command_telnet extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length == 0)
        {
            return false;
        }
        else if (args.length == 1)
        {
        if (args[0].equals("on"))
        {
            server.dispatchCommand(sender, "plugincontrol enable BukkitTelnet");
        TFM_Util.adminAction(sender.getName(), "Enabling the telnet client for all admins", true);
        return true;
        }
        else if (args[0].equals("off"))
        {
            server.dispatchCommand(sender, "plugincontrol disable BukkitTelnet");
            TFM_Util.adminAction(sender.getName(), "Disabling the telnet client for all admins", true);
        }
        }
        return true;
    }
}