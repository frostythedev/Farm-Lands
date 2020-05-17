package me.frostythedev.farmlands;

import co.aikar.commands.BukkitCommandManager;
import me.frostythedev.farmlands.cmds.FLCommand;
import me.frostythedev.farmlands.crops.CropHandler;
import me.frostythedev.farmlands.listeners.BlockGrowListener;
import me.frostythedev.farmlands.listeners.CropListener;
import org.bukkit.CropState;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class FLPlugin extends JavaPlugin {

    private ConfigOptions configOptions;

    private CropHandler cropHandler;

    private BukkitCommandManager commandManager;

    @Override
    public void onEnable(){

        if(!new File(this.getDataFolder(), "config.yml").exists()){
            this.saveDefaultConfig();
        }

        this.commandManager = new BukkitCommandManager(this);

        this.configOptions  = new ConfigOptions(this);

        this.cropHandler = new CropHandler();

        this.commandManager.registerCommand(new FLCommand(this));

        this.getServer().getPluginManager().registerEvents(new CropListener(), this);
        this.getServer().getPluginManager().registerEvents(new BlockGrowListener(this), this);
    }

    @Override
    public void onDisable(){

    }

    public ConfigOptions getConfigOptions() {
        return configOptions;
    }

    public CropHandler getCropHandler() {
        return cropHandler;
    }

    public BukkitCommandManager getCommandManager() {
        return commandManager;
    }
}
