package com.immanuel.java.collections.set.sorted;

import java.util.Objects;

public class Mobile
{
    private String name;
    private Double price;
    private Double averageCustomerRating;
    private Integer relevance;

    public Mobile(String name, Double price, Double averageCustomerRating, Integer relevance)
    {
        this.name = name;
        this.price = price;
        this.averageCustomerRating = averageCustomerRating;
        this.relevance = relevance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public Double getAverageCustomerRating()
    {
        return averageCustomerRating;
    }

    public void setAverageCustomerRating(Double averageCustomerRating)
    {
        this.averageCustomerRating = averageCustomerRating;
    }

    public Integer getRelevance()
    {
        return relevance;
    }

    public void setRelevance(Integer relevance)
    {
        this.relevance = relevance;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Mobile)) return false;
        Mobile mobile = (Mobile) o;
        return getName().equals(mobile.getName()) &&
                getPrice().equals(mobile.getPrice()) &&
                getAverageCustomerRating().equals(mobile.getAverageCustomerRating()) &&
                getRelevance().equals(mobile.getRelevance());
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(getName(), getPrice(), getAverageCustomerRating(), getRelevance());
    }
    @Override
    public String toString()
    {
        return "Mobile{" +"name='" + name + '\'' +", price=" + price +", averageCustomerRating=" + averageCustomerRating +", relevance=" + relevance +'}';
    }
}
