package com.immanuel.java.java_8.lambda;

public class Main
{
    public static void main(String[] args)
    {
        SumCalculator sumCalculator = new SumCalculatorImp();
        int sum2AndSum3 = sumCalculator.sum(2,3);
        System.out.println(sum2AndSum3);

        SumCalculator sumCalculator1 = (a, b) -> a + b;
        int sum5AndSum6 = sumCalculator1.sum(5,6);
        System.out.println(sum5AndSum6);
    }
}
