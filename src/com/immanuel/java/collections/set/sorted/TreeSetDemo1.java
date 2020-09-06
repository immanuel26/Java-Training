package com.immanuel.java.collections.set.sorted;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1
{
    public static void main(String[] args)
    {
        String sortType = "Relevance";

        if (args.length > 0)
        {
            sortType = args[0];
        }

        Comparator<Mobile> sortTypeComparator = getComparatorBySort(sortType);

        Set<Mobile> mobileSet = new TreeSet<>(sortTypeComparator);
        addMobile(mobileSet);
        for (Mobile mobile : mobileSet)
        {
            System.out.println(mobile);
        }
    }
    private static Comparator<Mobile> getComparatorBySort(String sortType )
    {
        switch (sortType)
        {
            case "Name:A-Z" :
                return (o1,  o2) -> o1.getName().compareTo(o2.getName());
            case "Name:Z-A" :
                return (o1,  o2) -> o2.getName().compareTo(o1.getName());
            case "Price:Lowest-Highest" :
                return (o1,  o2) -> o1.getPrice().compareTo(o2.getPrice());
            case "Price:Highest-Lowest" :
                return (o1,  o2) -> o2.getPrice().compareTo(o1.getPrice());
            default :
                return (o1,  o2) -> o1.getRelevance().compareTo(o2.getRelevance());
        }
    }
    private static Set<Mobile> addMobile(Set<Mobile> mobileSet)
    {
        Mobile mobile1 = new Mobile("Iphone 11 Pro Max", 150000.00, 4.7, 1);
        Mobile mobile2 = new Mobile("Iphone 11 Pro", 125000.00, 4.6, 2);
        Mobile mobile3 = new Mobile("Note 20 Ultra", 100000.00, 3.5, 4);
        Mobile mobile4 = new Mobile("OnePlus 8 Pro", 50000.00, 3.9, 3);

        mobileSet.add(mobile1);
        mobileSet.add(mobile2);
        mobileSet.add(mobile3);
        mobileSet.add(mobile4);

        return mobileSet;
    }
}
