package com.main;

import com.service.AdventureBookManager;
import com.service.ScientificBookManager;
import com.service.loginService.LoginManager;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

//User needs to provide valid user name and password,
// the user also has an opportunity to register

        LoginManager.run();


//The text format is  ISBN:asd-22-dsf PRICE:6000 NUMOFPAGES:500 EDITION:2 NUMOFCOPIES:3000 MAINCHAR:valod
//Note that here data is separated by spaces as it is much more convenient for the user
//For the sample input see the text file attached

        System.out.println("To manage adventureBooks type 1 for scientificBook type 0");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 1) {
                String address = "D:\\IntelIiJ\\PicsArt\\src\\com\\service\\data\\AdventureBook.txt";
                AdventureBookManager adventureBookManager = new AdventureBookManager(address);
                adventureBookManager.menu();
                break;
            }
            if (n == 0) {
                String address = "D:\\IntelIiJ\\PicsArt\\src\\com\\service\\data\\ScientificBook.txt";
                ScientificBookManager scientificBookManager = new ScientificBookManager(address);
                scientificBookManager.menu();
                break;
            } else {
                System.out.println("Axr grvacel e: 0 kam 1");
            }
        }
    }
}