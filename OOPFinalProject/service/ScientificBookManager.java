package com.service;

import com.model.AdventureBook;
import com.model.ScientificBook;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ScientificBookManager {
    private final String address;

    public ScientificBookManager(String address) {
        this.address = address;
    }

    public void menu() throws IOException {
        Scanner sc=new Scanner(System.in);
        ScientificBookService serv=new ScientificBookService();
        while(true)
        {
            System.out.println("1 to add new Scientific Book \n 2 to print the summary of them \n 3 to exit");
            int n=sc.nextInt();

            if(n==1)
            {
                System.out.println("Give the isbn and citation index");
                String isbn = sc.next();
                double index = sc.nextDouble();
                File file = new File(address);
                FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("\n" + isbn + "," + index);
                bw.close();
            }
            if(n==2)
            {
                serv.processIndexesFromFile(address);
            }
            if(n==3)return;
        }
    }

}
