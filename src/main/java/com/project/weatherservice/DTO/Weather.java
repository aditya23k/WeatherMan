package com.project.weatherservice.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weather {

    private String id;
    private String main;
    private String description;
    private String icon;

    public Weather(String id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

}

