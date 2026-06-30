package org.example.springbootcountrygenerator.starwars.response;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.springbootcountrygenerator.starwars.PersonDTO;

@NoArgsConstructor
@Getter
@Setter

public class ApiResult {

    private PersonDTO properties;

    public PersonDTO getProperties() {
        return properties;
    }

    public void setProperties(PersonDTO properties) {
        this.properties = properties;
    }
}
