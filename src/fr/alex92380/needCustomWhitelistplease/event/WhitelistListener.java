package fr.alex92380.needCustomWhitelistplease.event;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


import fr.alex92380.needCustomWhitelistplease.Main;

public class WhitelistListener implements Listener {
private Main main;
	public WhitelistListener(Main main) {
	this.main = main;
}
	@EventHandler
public void onPreJoin(PlayerJoinEvent event) {
	Player player = event.getPlayer();
	
	if(main.getConfig().getBoolean("Whitelist.Whitelisted")&& !player.hasPermission(main.getConfig().getString("Whitelist.Permission"))) {
		player.kickPlayer(main.getConfig().getString("Whitelist.KickMessage"));
		
	}
}
}
