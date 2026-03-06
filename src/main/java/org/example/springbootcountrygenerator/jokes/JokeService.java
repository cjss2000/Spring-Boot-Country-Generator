package org.example.springbootcountrygenerator.jokes;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {

    private static final String JOKE_URL = "https://api.chucknorris.io/jokes/random";
    private final RestTemplate restTemplate;

    public JokeService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Joke getRandomJoke(){
        Joke joke = restTemplate.getForObject(JOKE_URL, Joke.class);
        return joke;
    }
}
