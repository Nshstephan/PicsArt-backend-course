package com.model;

public class FictionBook extends Book {
    private boolean hasMovie;

    public FictionBook(String ISBN, String[] a, double price, boolean hasMovie) {
        super(ISBN, a, price);
        this.hasMovie = hasMovie;
    }

    public FictionBook(){
        this("x-xxx-xx-xxx", new String[]{"Nikol"}, 0, false);
    }

    @Override
    public String toString() {
        String result = getISBN() + " " + getPrice() + " " + hasMovie;
        return result;
    }

    public boolean hasMovie() {
        return hasMovie;
    }

    public void setHasMovie(boolean hasMovie) {
        this.hasMovie = hasMovie;
    }
}
