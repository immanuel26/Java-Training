package com.immanuel.java.multi_threading.thread2_demo_using_interface;

public class Hai implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Hello MyWorld");
            try {Thread.sleep(1000); } catch (Exception e){}
        }
    }
}
