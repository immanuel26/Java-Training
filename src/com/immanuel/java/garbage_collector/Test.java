package com.immanuel.java.garbage_collector;

public class Test
{
    String messaage = "Level up your coding skills - and stay engaged while doing it. No set-up required. In-browser exercises. ";
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Executing garbage Collector");
        super.finalize();
    }
}
