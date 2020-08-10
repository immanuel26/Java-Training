package com.immanuel.java.exception.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a number : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
    }
}
