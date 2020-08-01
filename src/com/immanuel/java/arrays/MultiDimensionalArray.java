package com.immanuel.java.arrays;

public class MultiDimensionalArray
{
    public static void main(String[] args)
    {
        String[][] names = new String[3][2];

        names[0]    = new String[3];
        names[0][0] ="Immanuel";
        names[0][1] ="Rini";
        names[0][2] ="ImmRin";

        names[1]    = new String[2];
        names[1][0] = "RinImm";
        names[1][1] = "SamPra";

        for (String[] innerArray : names)
        {
            for (String name : innerArray)
            {
                System.out.println("Love : " +name);
            }
        }
    }
}
