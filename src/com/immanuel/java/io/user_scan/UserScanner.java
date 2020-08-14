package com.immanuel.java.io.user_scan;

import java.util.Scanner;

public class UserScanner
{
    public static void main(String[] args) throws Exception
    {
        int n = 0;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n);
    }
}
