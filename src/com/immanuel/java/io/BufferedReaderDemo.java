package com.immanuel.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader("C:\\Users\\imman\\Downloads\\sample.txt"));
            String line = null;
            while ((line = br.readLine()) != null)
            {
                System.out.println("Data " +line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
                br.close();
        }
    }
}