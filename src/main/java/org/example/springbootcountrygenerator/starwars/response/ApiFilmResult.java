package org.example.springbootcountrygenerator.starwars.response;

import org.example.springbootcountrygenerator.starwars.FilmDTO;

public class ApiFilmResult {

    public ApiFilmResult(){}

    private FilmDTO properties;

    public FilmDTO getProperties() {
        return properties;
    }

    public void setProperties(FilmDTO properties) {
        this.properties = properties;
    }




}
