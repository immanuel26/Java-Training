package com.immanuel.java.multi_threading.sunil_multi_threading;

public class ThreadDemo extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("i " + i + " - " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args)
    {
        Thread thread = new ThreadDemo();
        thread.start();
    }
}
