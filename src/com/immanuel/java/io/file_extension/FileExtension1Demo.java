package com.immanuel.java.io.file_extension;

import java.io.File;

public class FileExtension1Demo
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\imman\\Downloads");
        File[] files = file.listFiles();
        for (File f : files)
        {
            if (f.isFile())
            {
                System.out.println(f.getName());
            }
        }
    }
}
