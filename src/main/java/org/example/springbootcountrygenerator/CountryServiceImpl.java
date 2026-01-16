package org.example.springbootcountrygenerator;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class CountryServiceImpl implements CountryService {

    private ArrayList<Country> list;
    public CountryServiceImpl(){
        this.list = new ArrayList<>();
    }


    @Override
    public Country add(Country country){

        list.add(country);
        return country;
    }

    @Override
    public Country removeById(int id){
        for (Country c : list){
            if (c.getCountryID() == id){
                return c;
            }
        }
        return null;
    }

    @Override
  public Country getById(int id){
        for (Country c : list){
            if (c.equals(id)){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Country> getAll(){
        return list;
    }

}
