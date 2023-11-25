package com.project.weatherservice.controller;


import com.project.weatherservice.DTO.WeatherDTO;
import com.project.weatherservice.service.WeatherService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@CrossOrigin(origins = "http://localhost:3000")
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
