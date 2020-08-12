package com.immanuel.java.io.total_characters_in_file;

import java.io.File;

public class TotalCharacterInFile
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\imman\\IdeaProjects\\Java\\src\\com\\immanuel\\java\\exception\\Notes");
        System.out.println("Total number of characters present in the file : " +file.length());  //length() method returns the no.of characters in present on the file.
    }
}
