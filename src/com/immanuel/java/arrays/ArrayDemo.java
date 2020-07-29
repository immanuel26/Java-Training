package com.immanuel.java.arrays;

public class ArrayDemo
{                                             // NOTES :
    public static void main(String[] args)    // 1.An array is a indexed based collection with fixed number of homogenous elements.
    {                                         // 2.The main advantage of array readability since its stores the same amount of data.
        String[] names = new String[5];       // 3.The disadvantage of array they are fixed in size we cannot change the size dynamically.
        names[0] = "Immanuel";                // 4.Arrays cannot store different kinds of data.
        names[1] = "Prasad"  ;                // 5.While creating an array we must specify the size.
        names[2] = "Rini"    ;
        names[3] = "Sam"     ;
        names[4] = "ImmRin"  ;

        for (String name : names)
        {
            System.out.println(name);
        }
        System.out.println(names.length);
    }
}
