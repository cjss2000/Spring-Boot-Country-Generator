package org.example.springbootcountrygenerator.starwars;

import org.example.springbootcountrygenerator.starwars.entity.Character;
import org.example.springbootcountrygenerator.starwars.repository.CharacterRepository;
import org.example.springbootcountrygenerator.starwars.response.ApiCharacterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service


public class CharacterService {


        private static final String SW_URL = "https://www.swapi.tech/api/people/";
        private final RestTemplate restTemplate;
        private CharacterRepository characterRepository;

        @Autowired
        public CharacterService(RestTemplate restTemplate, CharacterRepository characterRepository){
            this.restTemplate = restTemplate;
            this.characterRepository = characterRepository;
        }

        public CharacterDTO getPerson(){
            ApiCharacterResponse response = restTemplate.getForObject(SW_URL + randomNumber(), ApiCharacterResponse.class);
            return response.getResult().getProperties();
        }

        public int randomNumber(){
            Random random = new Random();
            int randomint = random.nextInt(82) + 1;
            return randomint;
        }

        public String saveCharacter(CharacterDTO characterDTO){
            Character character = new Character(characterDTO.getEyeColor(), characterDTO.getBirthYear(), characterDTO.getName());
            characterRepository.save(character);
                    return " Character has been successfully added";
        }

//        public CharacterDTO findCharacterByName(CharacterDTO characterDTO){
//
//        }

    }

