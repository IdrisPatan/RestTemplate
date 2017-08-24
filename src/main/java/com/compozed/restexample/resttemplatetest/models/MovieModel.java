package com.compozed.restexample.resttemplatetest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieModel {

    private String Title, Year, imdbID, Type, Poster;
}
