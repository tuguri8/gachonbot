package com.bot.gachon.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDto {
    private String description;

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}