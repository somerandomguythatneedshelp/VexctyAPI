package com.moonsowrkshop.vexctyapi;

import com.moonsowrkshop.vexctyapi.lang.Lang;
import com.moonsowrkshop.vexctyapi.lang.LangCommand;
import com.moonsowrkshop.vexctyapi.lang.LangManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class VexctyAPI extends JavaPlugin {

    private LangManager langManager;

    @Override
    public void onEnable() {

        langManager = new LangManager(this);

        registerCommands();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerCommands() {
        getCommand("lang").setExecutor(new LangCommand(this));
    }

    public LangManager getLangManager() {
        return langManager;
    }
}
