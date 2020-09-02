package com.immanuel.java.collections.set.mobiledemo;

import java.util.Objects;

public class Mobile
{
    private String name;
    private double price;

    public Mobile(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mobile mobile = (Mobile) o;
        return Double.compare(mobile.price, price) == 0 &&
                Objects.equals(name, mobile.name);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(name, price);
    }
}
