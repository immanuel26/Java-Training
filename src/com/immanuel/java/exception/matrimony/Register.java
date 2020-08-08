package com.immanuel.java.exception.matrimony;

public class Register
{
    public static void main(String[] args)
    {
        if (args.length > 0)
        {
            String age = args[0];
            double ageDouble = 0;
            try
            {
                ageDouble = Double.parseDouble(age);
            }
            catch(NumberFormatException e)
            {
                System.err.println("Please enter valid age in number format");
                System.exit(0);
            }
        if (ageDouble < 21)
        {
            throw new ChildException("You are child now. Your age is not eligible to marry.");
        }
        if (ageDouble > 60)
        {
            throw new TooOldException("Sorry you are too old to get married.");
        }
        System.out.println("Welcome to Matrimony site. Have a great day.");
        }else
            {
                System.err.println("Please enter your age "); }
    }
}
