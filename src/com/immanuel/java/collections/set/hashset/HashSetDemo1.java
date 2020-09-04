package com.immanuel.java.collections.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo1
{
    public static void main(String[] args)
    {
        List<String> emails = new ArrayList<>();
        emails.add("immanuelprasadp@gmail.com");
        emails.add("rinisam@gmail.com");
        emails.add("immrin2603@gmail.com");
        emails.add("immanuelprasadp@gmail.com");
        emails.add("rinimm0326@gmail.com");
        emails.add("rinisam@gmail.com");
        for (String email : emails)
        {
            System.out.println(email);
        }

        System.out.println("--------------------------------");

        Set<String> emailsWithoutDuplicates = new HashSet<>(emails);
        for (String email : emailsWithoutDuplicates)
        {
            System.out.println(email);
        }
    }
}
