package com.service;

import com.model.ScientificBook;
import com.service.ScientificBookComparator.ByIndexComparator;
import com.service.ScientificBookComparator.ByNumOfPagesComparator;

import java.io.*;
import java.util.*;

public class ScientificBookService {

    static class ScientificBookEntry {
        String ISBN;
        double index;

        public ScientificBookEntry(String ISBN, double index) {
            this.ISBN = ISBN;
            this.index = index;
        }
    }

    public void print(ScientificBook alpha) {
        System.out.println(alpha);
    }

    public void sortByNumOfPages(ScientificBook[] data) {
        List<ScientificBook> arr = new ArrayList<>(Arrays.asList(data));
        arr.sort(new ByNumOfPagesComparator());
        for (ScientificBook x : arr) {
            System.out.println(x);
        }
    }

    public void sortByCitationIndex(ScientificBook[] data) {
        List<ScientificBook> arr = new ArrayList<>(Arrays.asList(data));
        arr.sort(new ByIndexComparator());
        for (ScientificBook x : arr) {
            System.out.println(x);
        }
    }

    public void subjectCount(ScientificBook[] data)//print the disciplines along with count of books
    {
        HashMap<String, Integer> counts = new HashMap<>();
        for (ScientificBook i : data) {
            if (counts.containsKey(i.getField()))
                counts.putIfAbsent(i.getField(), 1);
            else
                counts.replace(i.getField(), counts.get(i.getField()) + 1);
        }
    }

    public void processIndexesFromFile(String address) throws FileNotFoundException {
        List<ScientificBookEntry> list = new ArrayList<>();
        Scanner sc = new Scanner(new FileInputStream(address));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr = s.split(",");
            list.add(new ScientificBookEntry(arr[0], Double.parseDouble(arr[1])));
        }
        double mean = 0;
        double min = 1;
        double max = 0;
        for (ScientificBookEntry i : list) {
            double temp = i.index;
            mean += temp / list.size();
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }
        System.out.println("\nThe minimum and maximum indexes are: " + min + " " + max + " The mean is: " + mean);
        System.out.println();
    }


    public void printBySubject(ScientificBook[] array, String subject) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getField().equals(subject)) {
                System.out.println(array[i]);
            }
        }
    }

    public ScientificBook cheapest(ScientificBook alpha, ScientificBook beta) {
        if (alpha.getPrice() >= beta.getPrice())
            return beta;
        else
            return alpha;
    }

    public void printToFile(String address, ScientificBook b) throws IOException {
        File file = new File(address);
        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("\n" + b.toString());
        bw.close();
    }

    public ArrayList<ScientificBook> createFromFile(String address) throws FileNotFoundException {
        ArrayList<ScientificBook> l = new ArrayList<>();
        Scanner sc = new Scanner(new FileInputStream(address));
        while (sc.hasNext()) {
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
