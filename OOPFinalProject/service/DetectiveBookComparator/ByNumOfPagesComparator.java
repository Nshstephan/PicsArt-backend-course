package com.service.DetectiveBookComparator;

import com.model.DetectiveBook;

import java.util.Comparator;

public class ByNumOfPagesComparator implements Comparator<DetectiveBook> {
    @Override
    public int compare(DetectiveBook o1, DetectiveBook o2) {
        return o1.getNumOfPages() - o2.getNumOfPages();
    }
}
