package com.immanuel.java.garbage_collector;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i = 0; i < 10000 ; i++)
        {
            Test test = new Test();
        }
    System.gc();
    Thread.sleep(20000);
    }
}
