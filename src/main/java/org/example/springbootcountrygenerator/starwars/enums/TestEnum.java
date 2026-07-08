package org.example.springbootcountrygenerator.starwars.enums;

public enum TestEnum {

    INVALID_USER_ID("The id you passed to this endpoint: //.... is invalid, try again"),
    INVALID_FILM_NAME("");

    private String value;

    TestEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
