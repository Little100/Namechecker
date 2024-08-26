package org.Little_100.namechecker;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Namechecker extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("" +
                "   __ _ _   _   _          _  ___   ___  \n" +
                "  / /(_) |_| |_| | ___    / |/ _ \\ / _ \\ \n" +
                " / / | | __| __| |/ _ \\   | | | | | | | |\n" +
                "/ /__| | |_| |_| |  __/   | | |_| | |_| |\n" +
                "\\____/_|\\__|\\__|_|\\___|___|_|\\___/ \\___/ \n" +
                "                     |_____|             ");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String playerName = event.getPlayer().getName();
        //下面的playerName前面可以加一个!用来检测间歇泉的java玩家
        if (playerName.contains(".")) {
            event.getPlayer().kickPlayer("检测到您是Be版玩家,所以已经为您切换到Be的主城");
        }
    }
}
