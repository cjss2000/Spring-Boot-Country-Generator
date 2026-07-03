package org.example.springbootcountrygenerator.starwars.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.springbootcountrygenerator.starwars.CharacterDTO;

@NoArgsConstructor
@Getter
@Setter

public class ApiCharacterResult {

    private CharacterDTO properties;

    public CharacterDTO getProperties() {
        return properties;
    }

    public void setProperties(CharacterDTO properties) {
        this.properties = properties;
    }
}
