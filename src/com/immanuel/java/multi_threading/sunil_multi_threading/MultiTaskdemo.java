package com.immanuel.java.multi_threading.sunil_multi_threading;

public class MultiTaskdemo
{
    public static void main(String[] args)
    {
        Runnable task1 = () -> {
                               for (int i = 0; i <= 25; i++)
                               {
                                   System.out.println("I Value : "+ i + " -> " +Thread.currentThread().getName());
                               }
                               };

        Runnable task2 = () -> {
                               for (int r = 26; r <= 50; r++)
                               {
                               System.out.println("R Value : " + r + " -> " +Thread.currentThread().getName());
                               }
                               };
        Thread thread1 = new Thread(task1);
        thread1.start();
        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}
