package com.immanuel.java.java_8.consumer_demo;

import java.util.function.Consumer;

public class ConsumerDemo
{
    public static void main(String[] args)
    {
        User user = new User();
        user.setUserName(args[0]);
        user.setPassword(args[1]);

        Consumer<User> printUserDetails = details -> {
                                                           System.out.println("User Name : " +details.getUserName());
                                                           System.out.println("Password  : " +details.getPassword());
                                                     };
        printUserDetails.accept(user);


    }
}
