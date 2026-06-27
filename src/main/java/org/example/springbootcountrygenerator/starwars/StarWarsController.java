package org.example.springbootcountrygenerator.starwars;

import org.example.springbootcountrygenerator.countries.Country;
import org.example.springbootcountrygenerator.countries.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/StarsWarsChar/")
public class StarWarsController {


        private final StarWarsService starWarsService;


    public StarWarsController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }

    @GetMapping("/person")
    public Person retrieveRandonPerson(){
        return starWarsService.getPerson();
    }

}
