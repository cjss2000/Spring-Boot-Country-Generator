package org.example.springbootcountrygenerator.starwars;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/starwars")
public class StarWarsController {


        private final StarWarsService starWarsService;


    public StarWarsController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }

    @GetMapping("/character")
    public PersonDTO retrieveRandonPerson(){
        return starWarsService.getPerson();
    }

}
