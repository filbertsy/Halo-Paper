package me.zyon.halo;

import org.bukkit.plugin.java.JavaPlugin;

public class HaloPlugin extends JavaPlugin {

  @Override
  public void onEnable() {
    getLogger().info("Halo-Paper has been enabled!")

      this.registerCommand("halo", new HaloCommand());
  }

  @Override
  public void onDisable() {
    getLogger().info("Halo-Paper has been disabled!");
  }
}
