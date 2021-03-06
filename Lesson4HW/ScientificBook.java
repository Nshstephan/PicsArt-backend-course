package com.main;

public class ScientificBook extends Book {
    private String field; // physics, chemistry...
    private double citationIndex;

    public ScientificBook(String ISBN, String[] a, double price, String field, double citationIndex) {
        super(ISBN, a, price);
        this.field = field;
        this.citationIndex = citationIndex;
    }

    @Override
    public String toString(){
        String result = getISBN() + " " + getPrice() + " " + field + " with citation index " + citationIndex;
        return result;
    }
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public double getCitationIndex() {
        return citationIndex;
    }

    public void setCitationIndex(double citationIndex) {
        this.citationIndex = citationIndex;
    }
}
