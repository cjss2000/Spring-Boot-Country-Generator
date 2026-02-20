package org.example.springbootcountrygenerator;

import java.util.List;
import java.util.UUID;

public interface CountryService {

    Country add(Country country);

    Country removeById(UUID id);

    Country getById(UUID id);

    List<Country> getAll();

    Country countryName(String countryName);
}

