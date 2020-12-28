package com.service.ScientificBookComparator;

import com.model.ScientificBook;

import java.util.Comparator;

public class ByIndexComparator implements Comparator<ScientificBook> {

    @Override
    public int compare(ScientificBook o1, ScientificBook o2) {
        boolean temp = o1.getCitationIndex() < o2.getCitationIndex();
        boolean temp2 = o1.getCitationIndex() > o2.getCitationIndex();
        if(temp) return -1;
        if(temp2) return 1;
        return 0;
    }
}
