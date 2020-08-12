package com.immanuel.java.io.file_writer;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterDemo
{
    public static void main(String[] args)
    {
        FileWriter fw = null;
        try
        {
            fw = new FileWriter("C:\\Users\\imman\\Downloads\\sample.txt", true);
            for (int i = 1; i < 10; i++)
            {
                fw.write("\n");
                fw.write("Hello Welcome to File Modification Using JAVA CORE " +i);
            }
            fw.flush();
            System.out.println("Done");
        } catch (IOException e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if (null != fw)
                fw.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}
//NOTE : The second argument boolean - true will append the data at the end of the file.