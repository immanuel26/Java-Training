package com.immanuel.java.collections.set.sorted;

import java.util.Comparator;

public class MobileRelevanceComaparator implements Comparator<Mobile>
{
    @Override
    public int compare(Mobile o1, Mobile o2) {
        return o1.getRelevance().compareTo(o2.getRelevance());
    }
}
