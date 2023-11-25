package com.project.weatherservice.service;

import com.project.weatherservice.DTO.WeatherDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//need to get weather, temperature and humidity from the OpenWeather API

//first, I need to geocode the city name to get the latitude and longitude

@Service
public class WeatherServiceImpl implements WeatherService {

    private RestTemplateBuilder restTemplateBuilder;



    public WeatherServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public WeatherDTO getWeather(String city) {

        RestTemplate restTemplate= restTemplateBuilder.build();
        String baseWeatherUrl_1= "https://api.openweathermap.org/data/2.5/weather?q=";
        String baseWeatherUrl_2= "&appid=f244c921394c582ace3ffeb98f473ebb&units=metric";

        ResponseEntity<WeatherDTO> weatherData= restTemplate.getForEntity(baseWeatherUrl_1+city+baseWeatherUrl_2, WeatherDTO.class,city);
        return weatherData.getBody();
    }

}

