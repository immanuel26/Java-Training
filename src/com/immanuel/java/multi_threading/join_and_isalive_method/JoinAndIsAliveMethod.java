package com.immanuel.java.multi_threading.join_and_isalive_method;

public class JoinAndIsAliveMethod
{
    public static void main(String[] args) throws Exception
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

        t1.join();                         // join()    -> This will make the main thread to print after the sub threads.
        t2.join();
        System.out.println(t1.isAlive());  // isAlive() -> This will show whether the thread is alive or not.
        System.out.println("Bye");

    }
}
