package com.immanuel.java.multi_threading.thread1_demo;

public class Hello extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Hello");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}

