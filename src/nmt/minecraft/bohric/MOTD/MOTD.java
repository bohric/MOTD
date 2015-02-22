package nmt.minecraft.bohric.MOTD;

import org.bukkit.event.*;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class MOTD extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onLogin(PlayerJoinEvent e) { // don't use PlayerLoginEvent
		e.getPlayer().sendMessage("If you're reading this, it means Eric knows how to code.\nHooray!");
	}
	
}
