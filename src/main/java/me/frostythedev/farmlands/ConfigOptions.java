package me.frostythedev.farmlands;

public class ConfigOptions {

    private FLPlugin plugin;

    public ConfigOptions(FLPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean isDaylightOnlyGrowth(){
        return plugin.getConfig().getBoolean("only-daylight-growth");
    }
}
