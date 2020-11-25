package com.main;

import java.util.ArrayList;

public class DetectiveBookService {

    public void print(DetectiveBook detectiveBook) {
        System.out.println(detectiveBook);
    }

    public void sortByNumOfPages(DetectiveBook[] data) {
        DetectiveBook[] arr = new DetectiveBook[data.length];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = data[i];
        }
        int n = arr.length;
        int i, j;
        DetectiveBook temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j].getNumOfPages() > arr[j + 1].getNumOfPages()) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        for (DetectiveBook x : arr) {
            System.out.println(x);
        }
    }

    public int countVictims(DetectiveBook[] data) {
        int cnt = 0;
        for (DetectiveBook i : data)
            cnt += i.getNumOfVictims();
        return cnt;
    }

    public DetectiveBook[] getVictories(DetectiveBook[] data) {
        int n = 0;
        ArrayList<DetectiveBook> l = new ArrayList<>();
        for (DetectiveBook i : data) {
            if (i.WasArrested()) {
                ++n;
                l.add(i);
            }
        }
        DetectiveBook[] res = new DetectiveBook[n];
        res = l.toArray(res);
        return res;
    }

    public boolean sameDetective(DetectiveBook alpha, DetectiveBook beta) {
        if (alpha.getDetective().equals(beta.getDetective()))
            return true;
        return false;
    }

    public DetectiveBook cheapest(DetectiveBook alpha, DetectiveBook beta){
        if(alpha.getPrice() >= beta.getPrice())
            return beta;
        else
            return alpha;
    }
}
