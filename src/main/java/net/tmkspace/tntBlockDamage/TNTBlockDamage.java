package net.tmkspace.tntBlockDamage;


import org.bukkit.plugin.java.JavaPlugin;

public final class TNTBlockDamage extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TNTExplosionEvent(), this);
        getServer().getPluginCommand("tntblockdamage").setExecutor(new SwitchCommand());
    }

    @Override
    public void onDisable() {
    }
}
