package com.example.resourcepackplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ResourcePackPlugin extends JavaPlugin implements Listener {

    // URL to your custom resource pack
    private static final String RESOURCE_PACK_URL = "http://yourserver.com/resourcepack.zip";

    @Override
    public void onEnable() {
        // Register the event listener
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("ResourcePackPlugin has been enabled!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Set the resource pack for the player
        event.getPlayer().setResourcePack(RESOURCE_PACK_URL);
        getLogger().info("Sent resource pack to " + event.getPlayer().getName());
    }

    @Override
    public void onDisable() {
        getLogger().info("ResourcePackPlugin has been disabled!");
    }
}
