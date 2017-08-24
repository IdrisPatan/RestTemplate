package com.compozed.restexample.resttemplatetest.service;

import com.compozed.restexample.resttemplatetest.models.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private RestTemplate restmovieRestTemplate;
    private String API_KEY = "c5a8df09&s";
    private String OMDB_BASE_URL = "http://www.omdbapi.com/?apikey=" +API_KEY + "&t=rogue+one";

    public WeatherService(RestTemplate restmovieRestTemplate) {
        this.restmovieRestTemplate = restmovieRestTemplate;
    }

    public MovieModel getWeatherJson() {
        return this.restmovieRestTemplate.getForObject(
                OMDB_BASE_URL,
                MovieModel.class
        );
    }
}
