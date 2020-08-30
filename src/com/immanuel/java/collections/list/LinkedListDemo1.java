package com.immanuel.java.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1
{
    public static void main(String[] args)
    {
        List<String> names = new LinkedList<>();
        names.add("RiniSam");
        names.add("ImmanuelPrasad");

        List<String> newNames = new LinkedList<>();
        newNames.add("Rini");
        newNames.add("Immanuel");

        newNames.addAll(names);
    }
}
