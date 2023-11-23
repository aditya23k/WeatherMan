package com.project.weatherservice.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sys {

    private String type;
    private String id;
    private String message;
    private String country;
    private String sunrise;
    private String sunset;

    public Sys(String type, String id, String message, String country, String sunrise, String sunset) {
        this.type = type;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }



}
package com.project.weatherservice.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sys {

    private String type;
    private String id;
    private String message;
    private String country;
    private String sunrise;
    private String sunset;

    public Sys(String type, String id, String message, String country, String sunrise, String sunset) {
        this.type = type;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }



}
