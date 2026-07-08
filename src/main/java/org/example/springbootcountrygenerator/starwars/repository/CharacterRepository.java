package org.example.springbootcountrygenerator.starwars.repository;

import org.example.springbootcountrygenerator.starwars.CharacterDTO;
import org.example.springbootcountrygenerator.starwars.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CharacterRepository extends CrudRepository<Character, UUID> {

    public Character deleteCharacterByName(String name);
}
