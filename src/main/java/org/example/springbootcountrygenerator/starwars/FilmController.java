package org.example.springbootcountrygenerator.starwars;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/starwars")

public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }

    @GetMapping("/films")
    public FilmDTO retrieveFilm(){
        return filmService.getFilmDTO();
    }





}
