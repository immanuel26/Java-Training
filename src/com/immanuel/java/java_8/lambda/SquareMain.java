package com.immanuel.java.java_8.lambda;

public class SquareMain
{
    public static void main(String[] args)
    {
        DoSquare squareValue = (i) -> i * i;
        System.out.println(squareValue.square(3));
    }
}
