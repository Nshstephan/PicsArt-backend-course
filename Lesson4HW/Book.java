package com.main;

public class Book {
    private String ISBN;
    private String[] authors;
    private double price;

    public Book(String ISBN, String[] a, double price) {
        this.ISBN = ISBN;
        this.price = price;
        authors = new String[a.length];
        for (int i = 0; i < a.length; ++i) {
            authors[i] = a[i];
        }
        this.authors = authors;
    }
    @Override
    public String toString(){
        String result = ISBN + " " + price;
        return result;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] a) {
        authors = new String[a.length];
        for (int i = 0; i < a.length; ++i) {
            authors[i] = a[i];
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

