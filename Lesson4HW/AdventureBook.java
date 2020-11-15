package com.main;

public class AdventureBook extends FictionBook {
    private String mainCharacter;


    public AdventureBook(String ISBN, String[] a, double price, boolean hasMovie, String mainCharacter) {
        super(ISBN, a, price, hasMovie);
        this.mainCharacter = mainCharacter;
    }

    @Override
    public String toString() {
        String result = getISBN() + " " + getPrice() + " " + mainCharacter;
        return result;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }
}
