package com.immanuel.java.collections.list;

import java.util.Stack;

public class StackDemo1
{
    public static void main(String[] args)
    {
        Stack<String> names = new Stack<>();
        names.push("Immanuel");
        names.push("Rini");
        names.push("Sam");
        names.push("Prasad");
        System.out.println(names.pop());
    }
}
