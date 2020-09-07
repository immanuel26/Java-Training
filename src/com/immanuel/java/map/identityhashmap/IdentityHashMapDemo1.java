package com.immanuel.java.map.identityhashmap;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo1
{
    public static void main(String[] args)
    {
        Map<Integer, String> employeeDetails = new IdentityHashMap<>();

        Integer employeeDetails1 = new Integer(190);
        Integer employeeDetails2 = new Integer(190);

        System.out.println(employeeDetails1 == employeeDetails2);
        System.out.println(employeeDetails1.equals(employeeDetails2));

        employeeDetails.put(employeeDetails1, "Immanuel");
        employeeDetails.put(employeeDetails2, "Immanuel");
        System.out.println(employeeDetails);
    }
}
