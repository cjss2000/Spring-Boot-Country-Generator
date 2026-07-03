package org.example.springbootcountrygenerator.starwars.response;

public class ApiFilmResponse {

    private String message;
    private ApiFilmResult result;

    public ApiFilmResult getResult() {
        return result;
    }

    public void setApiFilmResult(ApiFilmResult apiFilmResult) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
