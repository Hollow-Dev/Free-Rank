package me.jake.ranks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    try
    {
      if (cmd.getName().toLowerCase().equals("freerank"))
      {
        if (sender.hasPermission("freerank.use"))
        {
          Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd " + sender.getName() + " Regular");
          sender.sendMessage(ChatColor.WHITE + "You have been given the rank " + ChatColor.GREEN + "Regular" + ChatColor.WHITE + "!");
        }
        else
        {
          sender.sendMessage(ChatColor.RED + "You have no permission to use this command!");
        }
        return true;
      }
    }
    catch (Exception e)
    {
      sender.sendMessage("Error");
    }
    return false;
  }
}
