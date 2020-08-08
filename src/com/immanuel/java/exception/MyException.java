package com.immanuel.java.exception;
                                             //CHECKED Exception :
public class MyException extends Exception   //1.We have to use extends exception.It is identified by compiler.
{                                            //2.It must be handled by using throws or (try/catch).
    public MyException(String message)       //3.Until we add throws or (try/catch) code will not compile.
    {
        super(message);
    }
}                                            //UNCHECKED Exception :
                                             //1.We have to use extends RuntimeException.It is not identified by compiler.
                                             //2.There is no restriction here to compile the code.