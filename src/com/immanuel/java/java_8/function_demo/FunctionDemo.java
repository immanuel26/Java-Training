package com.immanuel.java.java_8.function_demo;

import java.util.function.Function;

public class FunctionDemo
{
    public static void main(String[] args)
    {
        Function<String, Integer> getLengthOfString = t -> t.length();
        Function<String, String> convertToUpperCase = t -> t.toUpperCase();

        int length = getLengthOfString.apply(args[0]);

        String upperCaseString = convertToUpperCase.apply(args[0]);


        System.out.println("The input name String Length : " +length);
        System.out.println("The input name String in Block Letters : " +upperCaseString);
    }
}
