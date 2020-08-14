package com.immanuel.java.multi_threading.thread1_demo;

public class Thread1Demo
{
    public static void main(String[] args)
    {
        Hi hi = new Hi();
        Hello hello = new Hello();
        hi.start();
        hello.start();
    }
}
