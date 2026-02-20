package org.example.springbootcountrygenerator;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/country/")

public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
    Country Germany = new Country();

    @GetMapping("/hello")
    ResponseEntity<String> SayHello(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    @GetMapping("/")
    public List<Country> getAll(){
        return countryService.getAll();
    }
    @PostMapping("/")
    public Country add(@RequestBody Country country){
        UUID newID = UUID.randomUUID();
        country.setCountryID(newID);
        countryService.add(country);
        return country;

    }
    @GetMapping("/{name}")
    public Country retrieveCountry(@PathVariable String countryName){
        return countryService.countryName(countryName);


    }
}
