package org.example.springbootcountrygenerator;

import lombok.AllArgsConstructor;



public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
    Country Germany = new Country();



}
