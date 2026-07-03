package org.example.springbootcountrygenerator.starwars;

import org.example.springbootcountrygenerator.starwars.response.ApiFilmResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service

public class FilmService {

    private static final String SW_FILM_URL = "https://www.swapi.tech/api/films/";
    private final RestTemplate restTemplate;

    public FilmService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }




    public FilmDTO getFilmDTO(){
            ApiFilmResponse response = restTemplate.getForObject(SW_FILM_URL + randomNumber(), ApiFilmResponse.class);
            return response.getResult().getProperties();
        }

        public int randomNumber(){
            Random random = new Random();
            int randomInt = random.nextInt(6) + 1;
            return  randomInt;
        }

    }

