package com.immanuel.java.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1
{
    public static void main(String[] args)
    {
        Map<String, Integer> hashMap = new HashMap<>();

        System.out.println(hashMap.isEmpty());

        hashMap.put("Immanuel", 1);
        hashMap.put("Rini", 2);
        hashMap.put("Sam", 3);
        hashMap.put("Prasad", 4);

        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());

        Set<String> names = hashMap.keySet();
        for (String name : names)
        {
            System.out.println(name);
        }
        Collection<Integer> ids = hashMap.values();
        for (Integer id : ids)
        {
            System.out.println(id);
        }
        System.out.println("--------------------------------------------");

        for (Map.Entry<String, Integer> nameMap : hashMap.entrySet()) {
            System.out.println(nameMap.getKey() + " = " + nameMap.getValue());
        }
    }
}
