package com.immanuel.java.multi_threading.thread2_demo_using_interface;

public class Hello implements Runnable
{
    public void run()
    {
        for (int i = 1; i<= 5; i++)
        {
            System.out.println("Hai Eveyone");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
