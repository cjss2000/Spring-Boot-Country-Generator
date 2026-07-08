package org.example.springbootcountrygenerator.starwars.repository;

import jakarta.transaction.Transactional;
import org.example.springbootcountrygenerator.starwars.entity.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CharacterRepository extends CrudRepository<Character, UUID> {

    @Transactional
    public Character deleteCharacterByName(String name);
}
