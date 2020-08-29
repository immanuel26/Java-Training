package com.immanuel.java.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("RiniSam");
        names.add("ImmanuelPrasad");

        List<String> newNames = new ArrayList<>();
        newNames.add("Rini");
        newNames.add("Immanuel");

        newNames.addAll(names);
    }
}
