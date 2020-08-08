package com.immanuel.java.exception;

public class MultipleCatch
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(10/0);
            System.out.println("This is Statement 1");
            System.out.println("This is statement 2");
        }
        catch(NullPointerException | ArithmeticException e)
        {
            System.out.println("This is statement 3");
        }
    }
}
