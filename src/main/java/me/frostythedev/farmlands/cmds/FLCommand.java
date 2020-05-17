package me.frostythedev.farmlands.cmds;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import me.frostythedev.farmlands.FLPlugin;
import me.frostythedev.farmlands.utils.Locale;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;

@CommandAlias("farmlands|fl|flands")
public class FLCommand extends BaseCommand {

    private FLPlugin plugin;

    public FLCommand(FLPlugin plugin) {
        this.plugin = plugin;
    }

    @HelpCommand
    public void onHelp(CommandSender sender){
        Locale.message(sender, "&6&m----------&r &a&lFarm Lands &7(1/1) &e&m----------");
        Locale.message(sender, "&6&l>> &a/farmlands &ehelp &7- Displays FarmLands help page");
        Locale.message(sender, "&6&l>> &a/farmlands &edebug &7- Toggles debug mode for farm lands");
    }

    @Subcommand("debug")
    @CommandPermission("farmlands.debug")
    public void debug(Player player){

        boolean debug = false;
        if(player.hasMetadata("farmlands-debug")){
            debug = player.getMetadata("farmlands-debug").get(0).asBoolean();
        }

        if(debug){
            player.removeMetadata("farmlands-debug", plugin);
            Locale.message(player, "&a&l>> &eYou have toggled debug mode to: &c&lDISABLED");
        }else{
            player.setMetadata("farmlands-debug", new FixedMetadataValue(plugin, true));
            Locale.message(player, "&a&l>> &eYou have toggled debug mode to: &a&lENABLED");
        }

    }
}
