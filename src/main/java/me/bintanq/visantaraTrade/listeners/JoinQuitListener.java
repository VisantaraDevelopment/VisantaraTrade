package me.bintanq.visantaraTrade.listeners;

import me.bintanq.visantaraTrade.VisantaraTrade;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitListener implements Listener {

    VisantaraTrade plugin;

    public JoinQuitListener(VisantaraTrade plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        plugin.getCooldownManager().clearCooldown(event.getPlayer());
    }

}
