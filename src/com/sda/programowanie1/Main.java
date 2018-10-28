package com.sda.programowanie1;

public class Main {

    public static void main(String[] args) {


        Countries countries = new Countries();

        countries.addCountry(new Country("Poland", "Warsaw", 135468, "Dam", "Nam"));
        countries.addCountry(new Country("Russia", "Moscow", 9999999, "Wam", "Nam"));
        countries.addCountry(new Country("Ukraine", "Kiev", 23515, "Wan", "Dam"));

        System.out.println(countries.getCountryName("Ukraine"));

    }
}
