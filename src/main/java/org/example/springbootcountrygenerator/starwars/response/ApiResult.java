package org.example.springbootcountrygenerator.starwars.response;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class ApiResult {

    private String message;
    private ApiResult result;

}
