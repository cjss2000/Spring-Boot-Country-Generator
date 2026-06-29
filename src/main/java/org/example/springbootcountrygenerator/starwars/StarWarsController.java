package org.example.springbootcountrygenerator.starwars;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/starwars")
public class StarWarsController {

    private final StarWarsService starWarsService;

    public StarWarsController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }

    @GetMapping("/character")
    public ResponseEntity<PersonDTO> retrieveRandonPerson() {
        return ResponseEntity.ok(starWarsService.getPerson());
    }

}
