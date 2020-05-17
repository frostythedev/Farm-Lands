package me.frostythedev.farmlands.crops;

import com.google.common.collect.Maps;
import org.bukkit.Location;

import java.util.Collection;
import java.util.Map;

public class CropHandler {

    private Map<Location, FLCrop> cropsMaps;

    public CropHandler() {
        this.cropsMaps = Maps.newHashMap();
    }


    public Map<Location, FLCrop> getCropsMaps() {
        return cropsMaps;
    }

    public Collection<FLCrop> getAllCrops(){
        return getCropsMaps().values();
    }
}
