package com.main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ScientificBookService {
    public void print(ScientificBook alpha) {
        System.out.println(alpha);
    }

    public void sortByNumOfPages(ScientificBook[] data) {
        ScientificBook[] arr = new ScientificBook[data.length];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = data[i];
        }
        int n = arr.length;
        int i, j;
        ScientificBook temp;
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
        for (ScientificBook x : arr) {
            System.out.println(x);
        }
    }

    public void sortByCitationIndex(ScientificBook[] data) {
        ScientificBook[] arr = new ScientificBook[data.length];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = data[i];
        }
        int n = arr.length;
        int i, j;
        ScientificBook temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j].getCitationIndex() > arr[j + 1].getCitationIndex()) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        for (ScientificBook x : arr) {
            System.out.println(x);
        }
    }

    public void printBySubject(ScientificBook[] array, String subject) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getField().equals(subject)) {
                System.out.println(array[i]);
            }
        }
    }
    public ScientificBook cheapest(ScientificBook alpha, ScientificBook beta){
        if(alpha.getPrice() >= beta.getPrice())
            return beta;
        else
            return alpha;
    }

    public void printToFile(String address, ScientificBook b) throws IOException {
        File file=new File(address);
        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(b.toString()+ "   ");
        bw.close();
    }

    public ArrayList<ScientificBook> createFromFile (String address) throws FileNotFoundException {
        ArrayList<ScientificBook> l = new ArrayList<>();
        Scanner sc = new Scanner(new FileInputStream(address));
        while(sc.hasNext()){
        String ISBN = sc.next();
        String[] arr = {};
        double price = sc.nextDouble();
        int numOfPages = sc.nextInt();
        int edition = sc.nextInt();
        int numOfCopies = sc.nextInt();
        String field = sc.next();
        double index = sc.nextDouble();
        ScientificBook result = new ScientificBook(ISBN, arr, price, field, index);
        result.setNumOfCopies(numOfCopies);
        result.setNumOfPages(numOfPages);
        result.setEdition(edition);
        l.add(result);
    }
        return l;
    }
}
