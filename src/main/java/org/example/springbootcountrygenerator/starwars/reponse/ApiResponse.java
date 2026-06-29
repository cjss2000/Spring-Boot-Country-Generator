package org.example.springbootcountrygenerator.starwars.reponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.springbootcountrygenerator.starwars.PersonDTO;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {

    private PersonDTO properties;

}
