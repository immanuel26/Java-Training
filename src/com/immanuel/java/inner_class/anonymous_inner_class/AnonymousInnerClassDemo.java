package com.immanuel.java.inner_class.anonymous_inner_class;

public class AnonymousInnerClassDemo
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator() {public int sum(int a, int b){return a+b;}
        };
    }
}
