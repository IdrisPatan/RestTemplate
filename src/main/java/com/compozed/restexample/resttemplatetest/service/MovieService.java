package com.compozed.restexample.resttemplatetest.service;

import com.compozed.restexample.resttemplatetest.models.MovieModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {
    private RestTemplate restmovieRestTemplate;
    private String API_KEY = "c5a8df09&s";

    public MovieService(RestTemplate restmovieRestTemplate) {
        this.restmovieRestTemplate = restmovieRestTemplate;
    }

    // GET Request
    public MovieModel getMovieData(String movieName) {
        return this.restmovieRestTemplate.getForObject(
                "http://www.omdbapi.com/?apikey=" + API_KEY + "&t={movieName}",
                MovieModel.class,
                movieName.replaceAll("_", "+")
        );
    }

//    // Post Request
//    public  MessageReceipt postMessage (Message message){
//
//        URI uri =
//
//    }
}