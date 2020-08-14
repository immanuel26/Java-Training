package com.immanuel.java.io.buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo
{
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\imman\\Downloads\\sample.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println("Data " + line);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
