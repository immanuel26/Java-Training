package com.immanuel.java.arrays;

public class ShortHandArray
{
    public static void main(String[] args)
    {
        String[][] names = {{"Immanuel", "Prasad", "Rini", "Sam", "ImmRin"},{"RinImm", "SamPra"}};
        for (String[] innerArray : names )
        {
            for (String name : innerArray)
            {
                System.out.println("Love : " + name);
            }
        }
    }
}
