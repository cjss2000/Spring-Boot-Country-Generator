package org.example.springbootcountrygenerator.starwars.reponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {

    private String message;
    private ApiResult result;

}
