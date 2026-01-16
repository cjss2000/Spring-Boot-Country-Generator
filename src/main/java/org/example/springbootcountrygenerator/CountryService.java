package org.example.springbootcountrygenerator;

import java.util.List;

public interface CountryService {

    Country add(Country country);

    Country removeById(int id);

    Country getById(int id);

    List<Country> getAll();
}
