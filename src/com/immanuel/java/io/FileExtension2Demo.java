package com.immanuel.java.io;

import java.io.File;

public class FileExtension2Demo
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\imman\\Downloads");
        File[] files = file.listFiles();
        for (File f : files)
        {
            if (f.isFile())
            {
                String name = f.getName();
                int lastIndexOfDot = name.lastIndexOf(".");
                if (lastIndexOfDot > 0)
                {
                    String extension = name.substring(lastIndexOfDot);
                    System.out.println("Extension -> " +extension);
                }
            }
        }
    }
}
