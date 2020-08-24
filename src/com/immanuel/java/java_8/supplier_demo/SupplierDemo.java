package com.immanuel.java.java_8.supplier_demo;

import java.util.function.Supplier;

public class SupplierDemo
{
    public static void main(String[] args)
    {
        Supplier<String> getPosts = () -> "Loading all Facebook posts";

        String message = getPosts.get();
        System.out.println(message);
    }
}
