package com.immanuel.java.exception;
                                                    //CHECKED Exception :
public class MyException extends RuntimeException   //1.We have to use extends exception.It is identified by compiler.
{                                                   //2.It must be handled by using throws or (try/catch).
    public MyException(String message)              //3.Until we add throws or (try/catch) code will not compile.
    {
        super(message);                             //UNCHECKED Exception :
    }                                               //1.We have to use extends RuntimeException.It is not identified by compiler.
}                                                   //2.There is no restriction here to compile the code.

                                                    //THROW :
                                                    //1.We use throw keyword to throw an exception.
                                                    //2.We use throw keyword only for throwable type.If not compiler will show"No Exception".

                                                    //KEYWORDS IN EXCEPTIONS :
                                                    //1.try     - Is for risky code.
                                                    //2.catch   - Exception handling.
                                                    //3.finally - Cleanup code/the code which has to execute all the time(With or without exception).
                                                    //4.throw   - Is used to throw exception.
                                                    //5.throws  - Just to delegate exception handling responsibility to caller method.


