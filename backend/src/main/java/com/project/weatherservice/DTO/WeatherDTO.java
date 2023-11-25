package com.project.weatherservice.DTO;

import java.util.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class WeatherDTO {

    private Coord coord;

    List<Weather> weather;

    private String base;

    private Main main;

    private String visibility;

    private Wind wind;

    private String dt;

    private Sys sys;

    private String id;

    private String name;

    private String cod;

    public WeatherDTO(Coord coord, List<Weather> weather, String base, Main main, String visibility, Wind wind, String dt, Sys sys, String id, String name, String cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }


}


