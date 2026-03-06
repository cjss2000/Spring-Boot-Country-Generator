package org.example.springbootcountrygenerator.countries;

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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryLang() {
        return countryLang;
    }

    public void setCountryLang(String countryLang) {
        this.countryLang = countryLang;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public String getCountryCurrency() {
        return countryCurrency;
    }

    public void setCountryCurrency(String countryCurrency) {
        this.countryCurrency = countryCurrency;
    }


    public UUID getCountryID() {
        return countryID;
    }

    public void setCountryID(UUID countryID) {
        this.countryID = countryID;
    }

    UUID countryID;
}
//https://restcountries.com/v3.1/name/germany?fields=name,currencies