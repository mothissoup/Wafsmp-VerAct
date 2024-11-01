package me.lynxid.wafsmpVerAct;

import me.lynxid.wafsmpVerAct.commands.Godcommand;
import me.lynxid.wafsmpVerAct.commands.Rulescommand;
import me.lynxid.wafsmpVerAct.listeners.JoinLeaveListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class WafsmpVerAct extends JavaPlugin implements Listener {

    public static JavaPlugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Wafsmp VerAct has started!");

        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getCommand("god").setExecutor(new Godcommand());
        getCommand("rules").setExecutor(new Rulescommand());
    }

}
