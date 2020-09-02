package com.immanuel.java.collections.list;

import java.util.Vector;

public class VectorDemo1
{
    public static void main(String[] args)
    {
        Vector<Integer> numbers = new Vector<>();

        System.out.println("Capacity : " + numbers.capacity());
        System.out.println("Size     : " + numbers.size());
        for (int i = 0; i < 10; i++)
        {
            numbers.addElement(i);
        }
        System.out.println("Capacity : " + numbers.capacity());
        System.out.println("Size     : " + numbers.size());
        numbers.addElement(12);

        System.out.println("Capacity : " + numbers.capacity());
        System.out.println("Size     : " + numbers.size());
    }
}
