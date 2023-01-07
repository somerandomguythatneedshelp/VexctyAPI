package com.moonsowrkshop.vexctyapi.lang;

public enum Lang {

    EN("English"),
    AR("عربي"),
    FR("Français"),
    IT("Italiano"),
    JA("日本"),
    LA("Latinus"),
    PA("ਪੰਜਾਬੀ"),
    RU("Русский"),
    ES("Español"),
    TR("Türk"),
    UR("اردو");

    private String name;

    Lang(String name) {
        this.name = name;
    }
}