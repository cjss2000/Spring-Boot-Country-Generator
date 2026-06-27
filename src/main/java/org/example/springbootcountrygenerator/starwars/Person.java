package org.example.springbootcountrygenerator.starwars;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {


    String name;
    int height;
    @JsonProperty("eye_color")
    String eyeColor;
    @JsonProperty("birth_year")
    String birthYear;

    public Person(String name, int height, String eyeColor, String birthYear ){
        this.name = name;
        this.height = height;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }



}
