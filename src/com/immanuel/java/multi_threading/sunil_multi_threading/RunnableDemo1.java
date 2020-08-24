package com.immanuel.java.multi_threading.sunil_multi_threading;

public class RunnableDemo1
{
    public static void main(String[] args)
    {
        System.out.println("This is Multi Threading and the thread name : " +Thread.currentThread().getName());

        Runnable runnable = () -> {
                                  for (int i = 0; i < 10; i++)
                                  {
                                      System.out.println("i " + i + " - " + Thread.currentThread().getName());
                                  }
                                  };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
