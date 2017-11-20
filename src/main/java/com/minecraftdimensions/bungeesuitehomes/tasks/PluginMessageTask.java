package com.minecraftdimensions.bungeesuitehomes.tasks;

import java.io.ByteArrayOutputStream;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import com.minecraftdimensions.bungeesuitehomes.BungeeSuiteHomes;

public class PluginMessageTask extends BukkitRunnable {

	private final ByteArrayOutputStream bytes;

	public PluginMessageTask(ByteArrayOutputStream bytes) {
		this.bytes = bytes;
	}
	
	public void run() {
			Player[] players = Bukkit.getOnlinePlayers().toArray(new Player[0]);
			Player player = players[0];
			
			players.sendPluginMessage(
					BungeeSuiteHomes.instance,
					BungeeSuiteHomes.OUTGOING_PLUGIN_CHANNEL,
					bytes.toByteArray());
	
	}

}