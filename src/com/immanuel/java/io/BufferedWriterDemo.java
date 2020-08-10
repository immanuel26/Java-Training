package com.immanuel.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo
{
    public static void main(String[] args)
    {
        BufferedWriter br = null;
        try
        {
            br = new BufferedWriter(new FileWriter("C:\\Users\\imman\\Downloads\\sample.txt", true));
            for (int i = 1; i < 10; i++)
            {
                br.write("Hello Welcome to File Modification Using JAVA CORE " +i);
                br.newLine();
            }
            br.flush();
            System.out.println("Done");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (null != br)
                    br.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
