package com.immanuel.java.io;

import java.io.File;

public class FileDelete
{
    public static void main(String[] args)
    {
        File sampleFolder = new File("C:\\Users\\imman\\Desktop\\java1.io");
        boolean isDeleteSuccess = sampleFolder.delete();               //returns true when the file/folder gets deleted.
        System.out.println("Is File Deleted : " +isDeleteSuccess);
    }
}
