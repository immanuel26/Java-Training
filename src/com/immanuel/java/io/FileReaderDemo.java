package com.immanuel.java.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\imman\\Downloads\\sample.txt");
        FileReader fr = new FileReader(file);
        int charLength = (int)file.length();
        char[] data = new char[charLength];
        fr.read(data);
        for (char ch : data)
        {
            System.out.println(ch);
        }
        fr.close();
    }
}
