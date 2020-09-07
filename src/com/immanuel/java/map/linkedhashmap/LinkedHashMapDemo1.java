package com.immanuel.java.map.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo1
{
    public static void main(String[] args)
    {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        System.out.println(linkedHashMap.isEmpty());

        linkedHashMap.put("Immanuel", 1);
        linkedHashMap.put("Rini", 2);
        linkedHashMap.put("Sam", 3);
        linkedHashMap.put("Prasad", 4);

        System.out.println(linkedHashMap.isEmpty());
        System.out.println(linkedHashMap.size());
        System.out.println("--------------------------------------------------");

        Set<String> names = linkedHashMap.keySet();
        for (String name : names)
        {
            System.out.println(name);
        }
        System.out.println("--------------------------------------------------");

        Collection<Integer> ids = linkedHashMap.values();
        for (Integer id : ids)
        {
            System.out.println(id);
        }
        System.out.println("--------------------------------------------------");

        for (Map.Entry<String, Integer> nameMap : linkedHashMap.entrySet())
        {
            System.out.println(nameMap);
        }
    }
}
