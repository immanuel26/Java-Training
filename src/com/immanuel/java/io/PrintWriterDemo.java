package com.immanuel.java.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter("C:\\Users\\imman\\Downloads\\sample.txt");
        pw.write(110);
        pw.print(100); pw.print(500);
        pw.println(true);
        pw.println("Text Message");
        pw.close();

    }
}
