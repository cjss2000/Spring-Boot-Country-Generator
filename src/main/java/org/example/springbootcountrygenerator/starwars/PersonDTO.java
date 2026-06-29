package org.example.springbootcountrygenerator.starwars;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter


public class PersonDTO {

    @JsonProperty("eye_color")

    private String eyeColor;

    @JsonProperty("birth_year")

    private String birthYear;


    public PersonDTO(String name, String height, String eyeColor, String birthYear ){
        this.name = name;
        this.height = height;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
    }


    private String name;

    public String getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    private String height;

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }








}
