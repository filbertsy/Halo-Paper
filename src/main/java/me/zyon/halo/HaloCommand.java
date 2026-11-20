package me.zyon.halo;

import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;

public class HaloCommand implements BasicCommand {
  @Override
  public void execute(final CommandSourceStack source, final (String[] args {

    if (args.length == 0) {
      source.getSender().sendMessage("Usage: /halo <enable|disable>");
      return;
    } else if (args[0].equalsIgnoreCase("enable")) {
      source.getSender().sendMessage("Halo has been enabled!");
        } else if (args[0].equalsIgnoreCase("disable")) {
      source.getSender().sendMessage("Halo has been disabled");
        } else {
      source.getSender().sendMessage("Unknown argument");
        }
  }
}
