package net.tmkspace.tntBlockDamage;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public class TNTExplosionEvent implements Listener {

    @EventHandler
    public void onExplosion(ExplosionPrimeEvent event) {
        if (SwitchCommand.isBLOCK_DAMAGE()) return;

        if (event.getEntityType() != EntityType.TNT) return;

        Location loc = event.getEntity().getLocation();
        Entity ent = event.getEntity();
        World world = ent.getWorld();

        event.setCancelled(true);

        world.createExplosion(loc, 4.0F, false, false);
    }
}
