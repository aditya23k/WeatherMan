package com.project.weatherservice.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Wind {

    private String speed;
    private String deg;

    public Wind(String speed, String deg) {
        this.speed = speed;
        this.deg = deg;
    }
}

