package org.example.springbootcountrygenerator.starwars.response;

import lombok.Getter;

@Getter
public class ApiCharacterResponse {

    private String message;
    private ApiCharacterResult result;

    public ApiCharacterResult getResult() {
        return result;
    }

    public void setResult(ApiCharacterResult result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
