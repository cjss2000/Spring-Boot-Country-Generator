package org.example.springbootcountrygenerator.starwars;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/starwars")
public class CharacterController {


        private final CharacterService characterService;



    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;

    }

    @GetMapping("/character")
    public PersonDTO retrieveRandonPerson(){
        return characterService.getPerson();
    }


}
