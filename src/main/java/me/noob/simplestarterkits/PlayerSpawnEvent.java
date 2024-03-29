package me.noob.simplestarterkits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

public class PlayerSpawnEvent implements Listener {

    @EventHandler
    public void playerSpawnEvent(@NotNull PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPlayedBefore()) {
            SimpleStarterKits.giveKit(player);
        }
    }
}
