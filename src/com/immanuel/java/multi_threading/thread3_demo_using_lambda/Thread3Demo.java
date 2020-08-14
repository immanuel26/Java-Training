package com.immanuel.java.multi_threading.thread3_demo_using_lambda;

public class Thread3Demo
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(() ->  {for (int i = 1; i <= 5; i++)
                                      {
                                          System.out.println("Hai Everyone");
                                          try {Thread.sleep(1000);} catch (Exception e) {}
                                      }
                                      });
        Thread t2 = new Thread(() ->  {for (int i = 1; i <= 5; i++)
                                      {
                                          System.out.println("Hello MyWorld");
                                          try {Thread.sleep(1000);} catch (Exception e) {}
                                      }
                                      });
        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();
    }
}
