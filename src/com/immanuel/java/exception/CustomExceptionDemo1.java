package com.immanuel.java.exception;

public class CustomExceptionDemo1
{
    public static void main(String[] args)
    {
        m1();
    }
    private static void m1()
    {
        m2();
    }
    private static void m2()
    {
        m3();
    }
    private static void m3()
    {
        try
        {
            throw new MyException("This is a demo for how to throw exception");
        } catch (MyException e)
        {
            e.printStackTrace();
        }
    }
}
