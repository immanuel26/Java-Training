package com.immanuel.java.exception;

public class FinallyBlock
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Start try");
            System.out.println(10/0);
            System.out.println("End try");
        }
        catch(NullPointerException | ArithmeticException e)
        {
            System.out.println("This is catch block");
        }
        finally
        {
            System.out.println("This is finally block");
        }
    }
}

