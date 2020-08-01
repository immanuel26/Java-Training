package com.immanuel.java.finalKeyword;
// NOTES :
// 1.Interface cannot be final.
// 2.Abstract classes cannot be final.
// 3.Final methods cannot be overriding.
// 4.Abstract Methods cannot be final.
// 5.Final classes should not have abstract methods.
// 6.Abstract class will have final methods.
// 7.Abstract class can also have 0 abstract methods.
// 8.Static methods and variables can be final.
public abstract class USACitizen
{
    public void rightVote()
    {
        System.out.println("You cannot vote until you are a USA citizen.");
    }
    public void elections()
    {
        System.out.println("You cannot be elected until you are a USA citizen.");
    }
    public final void taxBenefits()
    {
        System.out.println("You pay 20%.");
    }
}
