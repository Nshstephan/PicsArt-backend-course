package com.service;

import com.model.AdventureBook;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventureBookService {
    public void print(AdventureBook alpha) {
        System.out.println(alpha);
    }

    public void printMainHero(AdventureBook[] array, String hero) {
        for (AdventureBook x : array) {
            if (x.getMainCharacter().equals(hero)) {
                System.out.println(x);
            }
        }
    }

    public void hasMovies(AdventureBook[] data) {
        for (AdventureBook i : data) {
            if (i.hasMovie())
                System.out.println(i);
        }
    }

    public AdventureBook cheapest(AdventureBook alpha, AdventureBook beta) {
        if (alpha.getPrice() >= beta.getPrice())
            return beta;
        else
            return alpha;
    }

    public void printToFile(String address, AdventureBook b) throws IOException {

        File file = new File(address);
        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("\n" + b.toString());
        bw.close();
    }

    public ArrayList<AdventureBook> createFromFile(String address) throws FileNotFoundException {
        ArrayList<AdventureBook> l = new ArrayList<>();
        Scanner sc =
                new Scanner(new FileInputStream(address));
        while (sc.hasNext()) {
            String ISBN = sc.next();
            String[] arr = {};
            double price = sc.nextDouble();
            int numOfPages = sc.nextInt();
            int edition = sc.nextInt();
            int numOfCopies = sc.nextInt();
            String mainCharacter = sc.next();
            AdventureBook result = new AdventureBook(ISBN, arr, price, true, mainCharacter);
            result.setNumOfCopies(numOfCopies);
            result.setNumOfPages(numOfPages);
            result.setEdition(edition);
            l.add(result);
        }
        return l;
    }
}