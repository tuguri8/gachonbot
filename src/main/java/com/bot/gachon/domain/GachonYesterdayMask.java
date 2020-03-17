package com.bot.gachon.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class GachonYesterdayMask {


    @Id
    private String name;
    private String addr;
    private String code;
    private double lat;
    private double lng;
    private String remainStat;
    private String createdAt;
    private String stockAt;
    private String type;

    @Builder
    public GachonYesterdayMask(String name,
                               String addr,
                               String code,
                               double lat,
                               double lng,
                               String remainStat,
                               String createdAt,
                               String stockAt, String type) {
        this.name = name;
        this.addr = addr;
        this.code = code;
        this.lat = lat;
        this.lng = lng;
        this.remainStat = remainStat;
        this.createdAt = createdAt;
        this.stockAt = stockAt;
        this.type = type;
    }
}

