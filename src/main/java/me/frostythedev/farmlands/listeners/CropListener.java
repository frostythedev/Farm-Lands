package me.frostythedev.farmlands.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class CropListener implements Listener {

    /*
    * When hoeing a grass block, BPE is called with Type SOIL
    * When planting a crop, BPE is called with Type CROPS,CARROT,POTATO etc
    * When destroying a crop, BBE is called with Type CROPS,CARROT,POTATO etc
    * When destroying a soil block, BBE is called with Type SOIL
    * */

    @EventHandler
    public void onPlant(BlockPlaceEvent event){
        Player player = event.getPlayer();
        if(player.hasMetadata("farmlands-debug")){
            player.sendMessage("BLOCK TYPE PLACED: " + event.getBlockPlaced().getType().toString());
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event){
        Player player = event.getPlayer();
        if(player.hasMetadata("farmlands-debug")){
            player.sendMessage("BLOCK TYPE BROKEN: " + event.getBlock().getType().toString());
        }
    }

}
