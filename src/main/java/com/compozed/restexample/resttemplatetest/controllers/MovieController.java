package com.compozed.restexample.resttemplatetest.controllers;

import com.compozed.restexample.resttemplatetest.models.MovieModel;
import com.compozed.restexample.resttemplatetest.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {


    @Autowired
    private MovieService movieService;


    @GetMapping("/movie/{movieName}")
    public MovieModel getWeather(@PathVariable String movieName) {
        return movieService.getMovieData(movieName);
    }
}
