package org.example.springbootcountrygenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    int countryID;
}
//https://restcountries.com/v3.1/name/germany?fields=name,currencies