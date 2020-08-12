package com.immanuel.java.inner_class.country;

public class Country
{
    private String name;
    public Country(String name)
    {
        this.name = name;
    }
    private void outerMethod()
    {
        System.out.println("This is Outer Method");
        State state = new State();                // To access Inner Class from Outer Class
        state.innerMethod();
    }
    public class State
    {
        private String name;
        public State() {}
        public State(String name)
        {
            this.name = name;
        }
        private void innerMethod()
        {
            outerMethod();
            main(null);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("This is Country Main Method Application");
    }
}

// Without creating country we cannot create state.
// We cannot access inner class data from outer class directly. We need to create object of inner class to access inner class data.