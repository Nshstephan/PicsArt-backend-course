package com.service;

import com.model.AdventureBook;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventureBookManager {
    private final String address;

    public AdventureBookManager(String address) {
        this.address = address;
    }

    public void menu() throws FileNotFoundException {
        System.out.println("Hello and welcome \n 1 to add new AdventureBook \n 2 to print all of them \n 3 to print the average num of Pages \n and 4 to exit");
        boolean flag = true;
        AdventureBookService s = new AdventureBookService();
        String[] a = {};
        Scanner sc = new Scanner(System.in);
        while (flag) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Give isbn, price, numOfPages,edition, numOfCopies and main character ");
                    String isbn = sc.next();
                    double price = sc.nextDouble();
                    int page = sc.nextInt();
                    int ed = sc.nextInt();
                    int copies = sc.nextInt();
                    String main = sc.next();
                    AdventureBook b = new AdventureBook(isbn, a, price, false, main);
                    b.setNumOfPages(page);
                    b.setEdition(ed);
                    b.setNumOfCopies(copies);
                    try {
                        s.printToFile(address, b);
                    } catch (Exception e) {

                        flag = false;
                        break;
                    }
                    break;
                case 2:
                    ArrayList<AdventureBook> l = s.createFromFile(address);
                    for (AdventureBook x : l) {
                        System.out.println();
                        System.out.println(x);
                        System.out.println();
                    }
                    break;
                case 3:
                    ArrayList<AdventureBook> i = s.createFromFile(address);
                    double c = 0;
                    int sum = 0;

                    for (AdventureBook x : i) {
                        ++c;
                        sum += x.getNumOfPages();
                    }
                    System.out.println(sum / c);
                    break;
                default:
                    flag = false;
                    System.out.println("Bye!");
                    return;

            }
        }
    }
}
