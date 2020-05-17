package me.frostythedev.farmlands.listeners;

import me.frostythedev.farmlands.FLPlugin;
import org.bukkit.Bukkit;
import org.bukkit.CropState;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockGrowEvent;

public class BlockGrowListener implements Listener {

    private FLPlugin plugin;

    public BlockGrowListener(FLPlugin plugin) {
        this.plugin = plugin;
    }

    /*
    * Check to see if crops are trying to grow when there is no sunlight available,
    * dependent on config option
    * */
    @EventHandler
    public void onGrow(BlockGrowEvent event){

        if(plugin.getConfigOptions().isDaylightOnlyGrowth()){
            World world = event.getBlock().getWorld();
            if (world.getTime() < 6000 || world.getTime() > 18000) {
                event.setCancelled(true);
            }
        }
    }
}
