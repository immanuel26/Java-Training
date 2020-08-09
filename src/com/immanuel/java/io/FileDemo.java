package com.immanuel.java.io;

import java.io.File;

public class FileDemo
{
    public static void main(String[] args)
    {
        File folderpath = new File("D:\\Documents");
        File[] files = folderpath.listFiles();             //Will return all files and folders on given path.
        for (File file : files)
        {
            boolean itsDirectory = file.isDirectory();     //Return true when the file is directory.
            if (itsDirectory)
            {
                System.out.println(file.getName()+ " Its a Directory");
            }
            boolean itsFile = file.isFile();               //Return true when the file is a file.
            if (itsFile)
            {
                System.out.println(file.getName()+ " Its a File not a directory");
            }
        }
    }
}
