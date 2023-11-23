package com.project.weatherservice.service;

import com.project.weatherservice.DTO.WeatherDTO;
import netscape.javascript.JSObject;
import org.springframework.web.client.RestTemplate;

public interface WeatherService {

    WeatherDTO getWeather(String city);
}

