package com.company;

public class School {

    private double budget;
    private String director;
    private int numOfStudents;
    private String address;
    private boolean isOpen = true;

    public double getBudget() {
        return budget;
    }

    public void setBudget(double b) {
        budget = b;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String s) {
        address = s;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String s) {
        director = s;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int n) {
        numOfStudents = n;
    }
}
