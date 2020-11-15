package com.main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[] array = {"Sherlock"};
        DetectiveBook book1 = new DetectiveBook("abc", array, 5000, true, "murder", "Gor Vardanyan");

        System.out.println(book1);

        ScientificBook book2 = new ScientificBook("nubNikol", array, 10000, "phisics", 2.5);

        System.out.println("----------------");

        System.out.println(book2);


    }
}

