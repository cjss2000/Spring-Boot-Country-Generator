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
    public CharacterDTO retrieveRandomPerson() {
        return characterService.getPerson();
    }

    @PostMapping("/character/save")
    public String saveRandomPerson() {
        return characterService.saveCharacter(characterService.getPerson());
    }


}
