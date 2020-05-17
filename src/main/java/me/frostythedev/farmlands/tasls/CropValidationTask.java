package me.frostythedev.farmlands.tasls;

import me.frostythedev.farmlands.FLPlugin;
import me.frostythedev.farmlands.crops.FLCrop;

public class CropValidationTask implements Runnable {

    private FLPlugin plugin;

    public CropValidationTask(FLPlugin plugin) {
        this.plugin = plugin;
    }

    public void run() {
        for(FLCrop crop : plugin.getCropHandler().getAllCrops()){
            if(!crop.validate()){
                plugin.getCropHandler().getCropsMaps().remove(crop.getCropLocation());
            }
        }
    }
}
