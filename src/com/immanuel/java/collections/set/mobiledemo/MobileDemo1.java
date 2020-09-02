package com.immanuel.java.collections.set.mobiledemo;

import java.util.HashSet;
import java.util.Set;

public class MobileDemo1
{
    public static void main(String[] args)
    {
        Mobile mobile1 = new Mobile("Iphone 11 Pro Max", 150000);
        Mobile mobile2 = new Mobile("Note 20 Ultra", 150000);
        Mobile mobile3 = new Mobile("Iphone 11 Pro Max", 125000);
        Mobile mobile4 = new Mobile("OnePlus 8 Pro", 60000);
        Mobile mobile5 = new Mobile("Note 20 Ultra", 150000);
        Mobile mobile6 = new Mobile("Iphone 11 Pro", 125000);
        Mobile mobile7 = new Mobile("OnePlus 8 Pro", 60000);

        Set<Mobile> mobiles = new HashSet<>();
        mobiles.add(mobile1);
        mobiles.add(mobile2);
        mobiles.add(mobile3);
        mobiles.add(mobile4);
        mobiles.add(mobile5);
        mobiles.add(mobile6);
        mobiles.add(mobile7);
        for (Mobile mobile : mobiles)
        {
            System.out.println(mobile);
        }

        System.out.println(mobiles.size());

    }
}
