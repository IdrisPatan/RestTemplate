package com.compozed.restexample.resttemplatetest.controllers;

import com.compozed.restexample.resttemplatetest.models.MovieModel;
import com.compozed.restexample.resttemplatetest.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {



    @Autowired
    private WeatherService weatherService;


    @GetMapping("/movie/")
    public MovieModel getWeather() {
        return weatherService.getWeatherJson();
    }

}
