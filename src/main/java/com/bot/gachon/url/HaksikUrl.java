package com.bot.gachon.url;

import com.bot.gachon.util.constant.Url;

public enum  HaksikUrl {
    vision(Url.HAKSIK_URL_VISION), art(Url.HAKSIK_URL_ART), edu(Url.HAKSIK_URL_EDU);
    public String link = "";

    HaksikUrl(String link) {
        this.link = link;
    }
}

