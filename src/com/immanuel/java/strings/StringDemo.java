package com.immanuel.java.strings;

public class StringDemo
{
    public static void main(String[] args)
    {
       //  StringBuilder message = new StringBuilder("Hello");
       //  message.append(".");
       //  message.append(".");
       //  message.append(".");
       //  System.out.println(message);

        String names = "";

        if(args.length > 0){
            names = names+args[0]+",";
        }
        if(args.length > 1){
            names = names+args[1]+",";
        }
        if(args.length > 2){
            names = names+args[2]+",";
        }
        if(args.length > 3){
            names = names+args[3]+",";
        }
        System.out.println(names);
    }
}
