package org.example.springbootcountrygenerator.starwars.reponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.springbootcountrygenerator.starwars.PersonDTO;

@NoArgsConstructor
@Getter
@Setter
public class ApiResult {

  private PersonDTO properties;
}
