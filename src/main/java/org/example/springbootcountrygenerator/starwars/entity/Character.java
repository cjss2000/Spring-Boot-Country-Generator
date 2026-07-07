package org.example.springbootcountrygenerator.starwars.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "eye_color")
    private  String eyeColor;

    @Column(name = "Birth_day")
    private String birthDate;

    @Column(name = "name")
    private String name;

    public Character(String eyeColor, String birthDate, String name){
        this.eyeColor = eyeColor;
        this.birthDate = birthDate;
        this.name = name;
    }

    public Character() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
