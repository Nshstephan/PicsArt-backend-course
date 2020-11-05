package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Car cabriolet = new Car();

        cabriolet.setDoors(2);
        cabriolet.getBrand();
        cabriolet.setIgnition(true);
        cabriolet.getPrice();
        System.out.println("Price of this model is " + cabriolet.getPrice() + "$. and it have "
                + cabriolet.getDoors() + " doors.");
        System.out.println("My " + cabriolet.getBrand() + "'s weight is "
                + cabriolet.getWeight() + "00 kg.");



        University student = new University();
        student.setNameSurname("Tigran Ghazaryan");
        student.setGender('M');
        student.setDepartment("Computer Science");
        student.setStudentID("A09145632");
        student.setGpa(3.4);
        student.setGraduationYear(2020);
        student.studentInfo();



        School alfa=new School();
        alfa.setDirector("Arshakyan");
        alfa.setAddress("Vracakan 8");
        alfa.setNumOfStudents(44);
        alfa.setBudget(45412.12);
        System.out.println("Our school has "+alfa.getNumOfStudents()+" pupils "+"and is located in "+alfa.getAddress());
    }
}

