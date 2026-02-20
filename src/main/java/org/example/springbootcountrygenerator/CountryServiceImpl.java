package org.example.springbootcountrygenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service


public class CountryServiceImpl implements CountryService {

    private ArrayList<Country> list;
    private final RestTemplate template;
    private static final String API_URL = "https://restcountries.com/v3.1/name/{name}";
    public CountryServiceImpl(RestTemplate template){
        this.list = new ArrayList<>();
        this.template = template;
    }


    @Override
    public Country add(Country country){

        list.add(country);
        return country;
    }

    @Override
    public Country removeById(UUID id) {
        for (Country c : list) {
            if (c.getCountryID().equals(id)) {
                return c;
            }

        }
        return null;
    }

    @Override
  public Country getById(UUID id){
        for (Country c : list){
            if (c.getCountryID().equals(id)){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Country> getAll(){
        return list;
    }
    @Override
    public Country countryName(String countryName){
        Country[] countries = template.getForObject(API_URL, Country[].class, countryName);
        System.out.println(Arrays.toString(countries));
        return null;
    }

}
