package com.immanuel.java.oddevensum;

public class OddEvenSum
{
    public static void main(String[] args)
    {
        int i, j, oddSum = 0, evenSum = 0;
        for (i = 0; i <= 20; i++)
            if (i % 2 != 0)
            {
                System.out.println(i);
                oddSum = oddSum + i;
            }
        System.out.println("Sum of Odd Numbers " + oddSum);
        System.out.println();
        {
            for (j = 0; j <= 20; j++)
                if (j % 2 == 0)
                {
                    System.out.println(j);
                    evenSum = evenSum + i;
                }
            System.out.println("Sum of Even Numbers " + evenSum);
        }
    }
}