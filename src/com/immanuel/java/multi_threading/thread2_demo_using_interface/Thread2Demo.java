package com.immanuel.java.multi_threading.thread2_demo_using_interface;

public class Thread2Demo
{
    public static void main(String[] args)
    {
        Runnable hai = new Hai();
        Runnable hello = new Hello();

        Thread t1 = new Thread(hai);
        Thread t2 = new Thread(hello);

        t1.start();
        try {Thread.sleep(500); } catch (Exception e) {}
        t2.start();
    }
}
