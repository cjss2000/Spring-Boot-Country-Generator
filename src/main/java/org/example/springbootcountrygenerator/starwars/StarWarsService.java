package org.example.springbootcountrygenerator.starwars;

import org.example.springbootcountrygenerator.starwars.response.ApiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service


public class StarWarsService {


        private static final String SW_URL = "https://www.swapi.tech/api/people/1";
        private final RestTemplate restTemplate;

        public StarWarsService(RestTemplate restTemplate){
            this.restTemplate = restTemplate;
        }

        public PersonDTO getPerson(){
            ApiResponse response = restTemplate.getForObject(SW_URL, ApiResponse.class);
            return response.getProperties();
        }


    }

