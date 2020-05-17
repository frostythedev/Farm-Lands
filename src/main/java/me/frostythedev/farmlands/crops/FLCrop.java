package me.frostythedev.farmlands.crops;

import org.bukkit.Location;
import org.bukkit.material.Crops;

public class FLCrop implements CropBase {

    private Location cropLocation;

    private int growthState;

    private CropType cropType;

    public FLCrop(Location cropLocation, int growthState, CropType cropType) {
        this.cropLocation = cropLocation;
        this.growthState = growthState;
        this.cropType = cropType;
    }

    public boolean validate() {
        return cropLocation.getBlock().getState().getData() instanceof Crops;
    }

    public boolean grow(){
        if(validate()){
            if(getGrowthState() < 7){

            }
        }
        return false;
    }

    public Location getCropLocation() {
        return cropLocation;
    }

    @Deprecated
    public int getGrowthState() {
        if(!validate()) return -1;
        return ((Crops) cropLocation.getBlock().getState().getData()).getState().getData();
    }

    public CropType getCropType() {
        return cropType;
    }
}
