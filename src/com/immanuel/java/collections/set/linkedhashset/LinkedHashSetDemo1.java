package com.immanuel.java.collections.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1
{
    public static void main(String[] args)
    {
            Set<String> emails = new LinkedHashSet<>();
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
    }
}
