package com.immanuel.java.inner_class.country;

public class Main
{
    public static void main(String[] args)
    {
        Country country = new Country("Canada");
        Country.State state = country.new State("Toronto");
    }
}
