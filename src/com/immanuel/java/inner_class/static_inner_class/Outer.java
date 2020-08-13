package com.immanuel.java.inner_class.static_inner_class;

public class Outer
{
    static class Inner
    {
        public static void main(String[] args)
        {
            System.out.println("This is Static Inner Class Main Method");
        }
        public void m1()
        {
            System.out.println("This is static inner class m1 method");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("This is Outer Class Main Method");
    }
}
