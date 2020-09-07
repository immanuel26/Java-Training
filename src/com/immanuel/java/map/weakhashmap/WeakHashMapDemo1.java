package com.immanuel.java.map.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class WeakHashMapDemo1
{
    public static void main(String[] args)
    {
        Map<Integer, String> employeeDetails = new WeakHashMap<>();

        Integer emplyeeDetails1 = new Integer(190);

        employeeDetails.put(emplyeeDetails1, "Immanuel");

        System.out.println(employeeDetails);

        emplyeeDetails1 = null;
        System.gc();
        try
        {
            TimeUnit.SECONDS.sleep(5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(employeeDetails);
    }
}
