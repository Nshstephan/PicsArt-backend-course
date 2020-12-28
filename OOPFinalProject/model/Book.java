package com.model;

public class Book implements Printable, Cloneable {
    private String ISBN;
    private String[] authors;
    private double price;
    private int numOfPages = 300;
    private String paperType = "Offset";
    private int edition = 9;
    private int numOfCopies = 5000;

    public Book(String ISBN, String[] a, double price) {
        this.ISBN = ISBN;
        this.price = price;
        authors = new String[a.length];
        System.arraycopy(a, 0, authors, 0, a.length);

    }

    public Book() {
        this("x-xxx-xx-xxx", new String[]{"Nikol"}, 0);
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getNumOfPages() {
        return numOfPages;
    }

    @Override
    public String getPaperType() {
        return paperType;
    }

    @Override
    public int getEdition() {
        return edition;
    }

    @Override
    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setAuthors(String[] a) {
        authors = new String[a.length];
        for (int i = 0; i < a.length; ++i) {
            authors[i] = a[i];
        }
    }

    @Override
    public Book clone() {
        String[] arr = new String[authors.length];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = authors[i];
        }

        Book book = new Book(this.ISBN, arr, this.price);
        return book;

    }

    @Override
    public String toString() {
        String result = ISBN + " " + price;
        return result;
    }
}

