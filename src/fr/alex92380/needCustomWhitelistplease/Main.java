package fr.alex92380.needCustomWhitelistplease;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.libs.jline.internal.Configuration;
import org.bukkit.plugin.java.JavaPlugin;

import fr.alex92380.needCustomWhitelistplease.event.WhitelistListener;

public class Main extends JavaPlugin{
Configuration config  = new Configuration();
	@Override
public void onEnable() {
    saveDefaultConfig();
	getServer().getPluginManager().registerEvents(new WhitelistListener(this), this);
}
@Override
	public void onDisable() {
		
	}
}
