package com.moonsowrkshop.vexctyapi.lang;

import com.moonsowrkshop.vexctyapi.VexctyAPI;
import com.moonsowrkshop.vexctyapi.util.CC;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LangCommand implements CommandExecutor {

    private VexctyAPI vexcty;

    public LangCommand(VexctyAPI vexcty) {
        this.vexcty = vexcty;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (args.length == 0) {
                for (Lang lang : Lang.values()) {
                    if (args[0].equalsIgnoreCase("ar") || args[0].equalsIgnoreCase("arabic") || args[0].equalsIgnoreCase("عربي")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.AR);
                        player.sendMessage(CC.GREEN + "لقد قمت بتغيير لغتك إلى العربية.");
                    } else if (args[0].equalsIgnoreCase("en") || args[0].equalsIgnoreCase("english")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.EN);
                        player.sendMessage(CC.GREEN + "You have changed your language to English.");
                    } else if (args[0].equalsIgnoreCase("fr") || args[0].equalsIgnoreCase("french") || args[0].equalsIgnoreCase("Français")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.FR);
                        player.sendMessage(CC.GREEN + "Vous avez changé votre langue en français.");
                    } else if (args[0].equalsIgnoreCase("ur") || args[0].equalsIgnoreCase("urdu") || args[0].equalsIgnoreCase("اردو")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.UR);
                        player.sendMessage(CC.GREEN + "آپ نے اپنی زبان کو اردو میں بدل دیا ہے۔");
                    } else if (args[0].equalsIgnoreCase("it") || args[0].equalsIgnoreCase("italian") || args[0].equalsIgnoreCase("Italiano")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.IT);
                        player.sendMessage(CC.GREEN + "Hai cambiato la tua lingua in italiano.");
                    } else if (args[0].equalsIgnoreCase("pa") || args[0].equalsIgnoreCase("punjabi") || args[0].equalsIgnoreCase("ਪੰਜਾਬੀ")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.PA);
                        player.sendMessage(CC.GREEN + "ਤੁਸੀਂ ਆਪਣੀ ਭਾਸ਼ਾ ਪੰਜਾਬ ਬਦਲ ਲਈ ਹੈ।");
                    } else if (args[0].equalsIgnoreCase("la") || args[0].equalsIgnoreCase("latin") || args[0].equalsIgnoreCase("Latinus")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.LA);
                        player.sendMessage(CC.GREEN + "Linguam tuam in Latinam mutasti.");
                    } else if (args[0].equalsIgnoreCase("es") || args[0].equalsIgnoreCase("spanish") || args[0].equalsIgnoreCase("Español")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.ES);
                        player.sendMessage(CC.GREEN + "Has cambiado tu idioma a español.");
                    } else if (args[0].equalsIgnoreCase("ja") || args[0].equalsIgnoreCase("japanese") || args[0].equalsIgnoreCase("日本")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.JA);
                        player.sendMessage(CC.GREEN + "言語を日本語に変更しました。");
                    } else if (args[0].equalsIgnoreCase("ru") || args[0].equalsIgnoreCase("russia") || args[0].equalsIgnoreCase("Русский")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.RU);
                        player.sendMessage(CC.GREEN + "Вы сменили язык на русский.");
                    } else if (args[0].equalsIgnoreCase("tr") || args[0].equalsIgnoreCase("turkey") || args[0].equalsIgnoreCase("Türk")) {
                        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.TR);
                        player.sendMessage(CC.GREEN + "Dilinizi Türkçe olarak değiştirmişsiniz.");
                    } else if (args[0].equalsIgnoreCase("list")) {
                        player.sendMessage(CC.GREEN + "The available languages are \n" +
                                "- EN (English) \n" +
                                "- AR (Arabic/عربي) \n" +
                                "- FR (French/Français) \n" +
                                "- IT (Italian/Italiano) \n" +
                                "- JA (Japanese/日本) \n" +
                                "- LA (Latin/Latinus) \n" +
                                "- PA (Punjab/ਪੰਜਾਬੀ) \n" +
                                "- RU (Russian/Русский) \n" +
                                "- ES (Spanish/Español) \n" +
                                "- TR (Turkish/Türk) \n" +
                                "- UR (Urdu/اردو)");
                    }
                }
            } else {
                player.sendMessage(ChatColor.RED + "Invalid Usage! Please use /lang <language code>.");
            }
        }

        return false;
    }
}
