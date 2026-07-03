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
    private String eyeColor;

    @Column(name = "birth_date")
    private String birthDate;

    public Character(String eyeColor, String birthDate) {
        this.eyeColor = eyeColor;
        this.birthDate = birthDate;
    }

    public UUID getId() {
        return id;
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
}
