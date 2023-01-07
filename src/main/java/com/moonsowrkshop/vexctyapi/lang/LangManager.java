package com.moonsowrkshop.vexctyapi.lang;

import com.moonsowrkshop.vexctyapi.VexctyAPI;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class LangManager {
    private File file;
    private YamlConfiguration config;
    private VexctyAPI vexcty;

    public LangManager(VexctyAPI vexcty) {
        this.vexcty = vexcty;

        if (!vexcty.getDataFolder().exists()) {
            vexcty.getDataFolder().mkdir();
        }

        file = new File(vexcty.getDataFolder(), "languages.yml");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        config = YamlConfiguration.loadConfiguration(file);
    }

    public void setLang(UUID uuid, Lang lang) {

        config.set(uuid.toString(), lang.name());
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Lang getLang(UUID uuid, Lang lang) {
        return Lang.valueOf(config.getString(uuid.toString()));
    }
}
