package com.immanuel.java.namestask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class NamesTask
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader namesTask = new BufferedReader(new FileReader("C:\\Users\\imman\\Desktop\\names-test.txt"));
        String name;

        Map<String, Integer> nameWithoutDuplicatesWithCount = new LinkedHashMap<>();
        while ((name = namesTask.readLine()) != null)
        {
            Integer count = nameWithoutDuplicatesWithCount.getOrDefault(name, new Integer(0));
            nameWithoutDuplicatesWithCount.put(name, count+1);
        }
        for (Map.Entry<String, Integer> namesEntry : nameWithoutDuplicatesWithCount.entrySet())
        {
            System.out.println(namesEntry.getKey() + " - " + namesEntry.getValue());
        }
    }
}
