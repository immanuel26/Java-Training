package com.immanuel.java.multi_threading.getting_name_and_setting_priority;

public class GettingNameAndSettingPriorityInThreads
{
    public static void main(String[] args) throws Exception
    {
        Thread t1 = new Thread(() ->  {for (int i = 1; i <= 5; i++)
                                      {
                                           System.out.println("Hai Everyone and Priority : " +Thread.currentThread().getPriority());
                                           try {Thread.sleep(1000);} catch (Exception e) {}
                                      }
                                      },"Thread Name : Hai");
        Thread t2 = new Thread(() ->  {for (int i = 1; i <= 5; i++)
                                      {
                                      System.out.println("Hello MyWorld and Priority : " +Thread.currentThread().getPriority());
                                      try {Thread.sleep(1000);} catch (Exception e) {}
                                      }
                                      },"Thread Name : Hello");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.setPriority(Thread.MAX_PRIORITY);    // MAX_PRIORITY  = 10
        t2.setPriority(Thread.MIN_PRIORITY);    // MIN_PRIORITY  = 1
        System.out.println(t1.getPriority());   // NORM_PRIORITY = 5
        System.out.println(t2.getPriority());

        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();

        t1.join();                              // join()    -> This will make the main thread to print after the sub threads.
        t2.join();
        System.out.println(t1.isAlive());       // isAlive() -> This will show whether the thread is alive or not.
        System.out.println("Bye");

    }
}
