package org.example.springbootcountrygenerator.starwars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/starwars")
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/allCharacters")
    public Iterable findAllCharacters() {
        return characterService.findAllCharacters();
    }

    @GetMapping("/character")
    public CharacterDTO retrieveRandonPerson() {
        return characterService.getPerson();
    }

    @PostMapping("/character/save")
    public String saveRandomPerson() {
        return characterService.saveCharacter(characterService.getPerson());
    }

    @PostMapping("/character/delete/{name}")
    public void deletebyName(@PathVariable String name) {
        characterService.deleteCharacter(name);
    }
}
