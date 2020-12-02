package com.main;

import com.model.AdventureBook;
import com.service.AdventureBookService;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//The text format is  ISBN:asd-22-dsf PRICE:6000 NUMOFPAGES:500 EDITION:2 NUMOFCOPIES:3000 MAINCHAR:valod
//Note that here data is separated by spaces as it is much more convenient for the user
//For the sample input see the text file attached
        String address="D:\\IntelIiJ\\PicsArt\\src\\Pics\\info.txt";
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello and welcome \n 1 to add new AdventureBook \n 2 to print all of them \n 3 to print the average num of Pages \n and 4 to exit");
        boolean flag=true;
        AdventureBookService s = new AdventureBookService();
        String[] a={};

        while(flag)
        {
            int n=sc.nextInt();
            switch (n)
            {
                case 1:
                    String isbn=sc.next();
                    double price=sc.nextDouble();
                    int page=sc.nextInt();
                    int ed=sc.nextInt();
                    int copies=sc.nextInt();
                    String main=sc.next();
                    AdventureBook b=new AdventureBook(isbn, a, price, false, main);
                    b.setNumOfPages(page);
                    b.setEdition(ed);
                    b.setNumOfCopies(copies);
                    try
                    {
                        s.printToFile(address, b);
                    }
                    catch(Exception e)
                    {

                        flag=false; break;
                    }
                    break;
                case 2:
                    ArrayList<AdventureBook> l=s.createFromFile(address);
                    for(AdventureBook x: l)
                    {
                        System.out.println();
                        System.out.println(x);
                        System.out.println();
                    }
                    break;
                case 3:
                    ArrayList<AdventureBook> i=s.createFromFile(address);
                    double c=0;
                    int sum=0;
                    for(AdventureBook x: i)
                    {
                        ++c;
                        sum+=x.getNumOfPages();
                    }
                    System.out.println(sum/c);
                    break;
                default:
                    flag=false;
                    System.out.println("Bye!");
                    break;

            }
        }


    }
}