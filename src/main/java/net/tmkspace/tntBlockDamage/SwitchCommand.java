package net.tmkspace.tntBlockDamage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Objects;

public class SwitchCommand implements CommandExecutor {

    private static boolean BLOCK_DAMAGE = true;

    public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
        if (args.length == 0 || args == null) {
            sender.sendRichMessage("<gold>TNTBlockDamage is " + BLOCK_DAMAGE);
            return true;
        }
        if(Objects.equals(args[0], "true")) {
            BLOCK_DAMAGE = true;
            sender.sendRichMessage("<dark_green>TNTBlockDamage is true now");
            return true;
        }
        if (Objects.equals(args[0], "false")) {
            BLOCK_DAMAGE = false;
            sender.sendRichMessage("<dark_red>TNTBlockDamage is false now");
            return true;
        }
        return true;
    }

    public static boolean isBLOCK_DAMAGE() {
        return BLOCK_DAMAGE;
    }
}
