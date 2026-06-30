package org.example.springbootcountrygenerator.starwars.response;

import lombok.Getter;
import org.example.springbootcountrygenerator.starwars.PersonDTO;
@Getter
public class ApiResponse {

    private String message;
    private ApiResult result;

    public ApiResult getResult() {
        return result;
    }

    public void setResult(ApiResult result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
