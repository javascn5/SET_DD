package com.sda.programowanie1;

public class Country {

    private String name;
    private  String capital;
    private int ammount;
    private User president;

    public Country (String name, String capital, int ammount, String userName, String lastName){
        this.name = name;
        this.ammount = ammount;
        this.capital = capital;
        this.president = new User(userName, lastName);

    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getAmmount() {
        return ammount;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", ammount=" + ammount +
                ", president=" + president +
                '}';
    }
}
