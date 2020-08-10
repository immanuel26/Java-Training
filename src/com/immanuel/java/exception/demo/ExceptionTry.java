package com.immanuel.java.exception.demo;

public class ExceptionTry
{
    public static void main(String[] args)
    {
        try
        {
            int a[] = null;
            a[6] = 8;
            int i = 7;
            int j = 2;
            int k = i/j;
            System.out.println("Output is " +k);
        }
        catch (ArithmeticException e)
        {
            System.err.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Array reached its limit");
        }
        catch (Exception e)
        {
            System.err.println("Something wrong ");
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}
