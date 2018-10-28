package com.sda.programowanie1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Countries {

    private Set<Country> countries = new HashSet<>();

    public void addCountry(Country country) {
        if (countries.contains(country)) {
            System.out.println("Taki kraj juz istnieje");
        }
        countries.add(country);
    }


    public Set<Country> getAllCountries() {

        return countries;
    }

    public void remove(Country countrie) {
        countries.remove(countrie);
    }

    public void updateCountry(Country oldName, Country newName) {
        countries.remove(oldName);
        countries.add(newName);
    }


    public Country getCountryName(String name) {
        for (Country country : countries) {
            if (country.getName().equals(name)) {
                return country;
            }
        }
        return null;
    }

    public Country getCapitalCity(String capital) {
        for (Country country : countries) {
            if (country.getCapital().equals(capital)) {
                return country;
            }
        }
        return null;
    }

//    public Country getCountrySortedByPopulation(int ammount) {
//        List<Integer> temp = new ArrayList<Integer>();
//
//    }


}
