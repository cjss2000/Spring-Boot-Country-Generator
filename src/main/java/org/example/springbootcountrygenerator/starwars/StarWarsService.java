package org.example.springbootcountrygenerator.starwars;

import org.example.springbootcountrygenerator.starwars.response.ApiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service


public class StarWarsService {


        private static final String SW_URL = "https://www.swapi.tech/api/people/";
        private final RestTemplate restTemplate;

        public StarWarsService(RestTemplate restTemplate){
            this.restTemplate = restTemplate;
        }

        public PersonDTO getPerson(){
            ApiResponse response = restTemplate.getForObject(SW_URL + randomNumber(), ApiResponse.class);
            return response.getResult().getProperties();
        }

        public int randomNumber(){
            Random random = new Random();
            int randomint = random.nextInt(82);
            return randomint;
        }

    }

