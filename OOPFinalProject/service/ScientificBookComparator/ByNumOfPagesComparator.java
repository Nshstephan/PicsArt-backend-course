package com.service.ScientificBookComparator;

import com.model.ScientificBook;

import java.util.Comparator;

public class ByNumOfPagesComparator implements Comparator<ScientificBook> {
    @Override
    public int compare(ScientificBook o1, ScientificBook o2) {
        return o1.getNumOfPages() - o2.getNumOfPages();
    }
}
