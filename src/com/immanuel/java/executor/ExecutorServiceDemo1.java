package com.immanuel.java.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo1
{
        static Runnable task1 = () -> {
                                      for (int i = 0; i < 10; i++)
                                      {
                                          System.out.println("I value : " + i + " - " + Thread.currentThread().getName());
                                      }
                                      };

        public static void main(String[] args)
        {
            ExecutorService executor = Executors.newFixedThreadPool(1);
            for (int i = 1; i <= 10; i++)
            {
                System.out.println("This is task execution " +i);
                executor.submit(task1);
            }
        executor.shutdown();
        }

}
