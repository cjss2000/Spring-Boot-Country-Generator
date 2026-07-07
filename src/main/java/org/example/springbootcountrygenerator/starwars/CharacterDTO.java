package org.example.springbootcountrygenerator.starwars;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter


public class CharacterDTO {

    @JsonProperty("eye_color")

    private String eyeColor;

    @JsonProperty("birth_year")

    private String birthYear;

    @JsonProperty("name")

    private String name;

//    @JsonProperty("height")
//
//    private String height;


    public CharacterDTO(String name, String eyeColor, String birthYear ){
        this.name = name;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
    }

//    public CharacterDTO(String eyeColor, String birthYear){
//        this.eyeColor = eyeColor;
//        this.birthYear = birthYear;
//    }
    //why didn't this constructor work? I'm assuming because I need the UUID included in the object? however the constructor above doens't have it either?






    public String getEyeColor() {
        return eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }








}
