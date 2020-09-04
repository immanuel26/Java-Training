package com.immanuel.java.collections.set.sorted;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1
{
    public static void main(String[] args)
    {

        // Relevance Ascending Sorting.
        Set<Mobile> mobileSet1 = new TreeSet<>((o1,  o2) -> o1.getRelevance().compareTo(o2.getRelevance()));
        addMobile(mobileSet1);
        for (Mobile mobile1 : mobileSet1)
        {
            System.out.println(mobile1);
        }
        System.out.println("--------------------------------------------------------------------------------------------");

        // Relevance Descending Sorting.
        Set<Mobile> mobileSet2 = new TreeSet<>((o1,  o2) -> o2.getRelevance().compareTo(o1.getRelevance()));
        addMobile(mobileSet2);
        for (Mobile mobile2 : mobileSet2)
        {
            System.out.println(mobile2);
        }
        System.out.println("--------------------------------------------------------------------------------------------");

        // Name Sorted A-Z.
        Set<Mobile> mobileSet3 = new TreeSet<>((o1,  o2) -> o1.getName().compareTo(o2.getName()));
        addMobile(mobileSet3);
        for (Mobile mobile3 : mobileSet3)
        {
            System.out.println(mobile3);
        }
        System.out.println("--------------------------------------------------------------------------------------------");

        // Name Sorted Z-A.
        Set<Mobile> mobileSet4 = new TreeSet<>((o1,  o2) -> o2.getName().compareTo(o1.getName()));
        addMobile(mobileSet4);
        for (Mobile mobile4 : mobileSet4)
        {
            System.out.println(mobile4);
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
