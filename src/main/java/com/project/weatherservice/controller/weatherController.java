package com.project.weatherservice.controller;


import com.project.weatherservice.DTO.WeatherDTO;
import com.project.weatherservice.service.WeatherService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping(value="/weather")
public class weatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("{city}")
    public WeatherDTO getWeather(@PathVariable("city") String city) {
        return weatherService.getWeather(city);
    }

}
