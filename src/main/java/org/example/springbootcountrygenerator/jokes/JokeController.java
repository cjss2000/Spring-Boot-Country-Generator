package org.example.springbootcountrygenerator.jokes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/joke")
    public ResponseEntity<Joke> getRandomFunJoke() {
        Joke joke = jokeService.getRandomJoke();
        if (joke != null) {
            return ResponseEntity.ok(joke);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
