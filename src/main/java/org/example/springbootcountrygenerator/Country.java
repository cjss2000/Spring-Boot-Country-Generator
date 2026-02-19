package org.example.springbootcountrygenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Country {

    String countryName;
    String countryLang;
    String countryCurrency;
    String countryCapital;

    public UUID getCountryID() {
        return countryID;
    }

    public void setCountryID(UUID countryID) {
        this.countryID = countryID;
    }

    UUID countryID;
}
//https://restcountries.com/v3.1/name/germany?fields=name,currencies