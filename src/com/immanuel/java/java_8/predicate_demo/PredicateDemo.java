package com.immanuel.java.java_8.predicate_demo;

import java.util.function.Predicate;

public class PredicateDemo
{
    public static void main(String[] args)
    {
        Predicate<String> checkLength = t -> t.length() > 5;
        Predicate<String> checkStartWith = t -> t.startsWith("Im");
        Predicate<String> checkLengthAndstartWith = checkLength.and(checkStartWith);
        if (args.length > 0)
        {
            String inputArgument = args[0];
            if (checkLengthAndstartWith.test(inputArgument))
            {
                System.out.println("The Input Argument length is > 5 and nam estarts with **Im**");
            }
            else
            {
                System.out.println("The Input Argument length is < 5 and name starts with **Ri**");
            }
        }
        else
        {
            System.err.println("No input is passed");
        }
    }
}
