package com.immanuel.java.inner_class.static_inner_class;

public class StaticInnerMainClass
{
    public static void main(String[] args)
    {
        Outer.Inner innerClassObject = new Outer.Inner();   // Calling static inner class instance method from outside.
        innerClassObject.m1();
    }
}
