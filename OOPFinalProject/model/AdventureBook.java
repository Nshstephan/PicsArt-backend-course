package com.model;

public class AdventureBook extends FictionBook {
    private String mainCharacter;


    public AdventureBook(String ISBN, String[] a, double price, boolean hasMovie, String mainCharacter) {
        super(ISBN, a, price, hasMovie);
        this.mainCharacter = mainCharacter;
    }

    public AdventureBook(){
        this("x-xxx-xx-xxx", new String[]{"Nikol"}, 0, false, "Pasha");
    }

    @Override
    public String toString() {
        String result = getISBN() + " " + getPrice() + " " +
                getNumOfPages() + " " + getEdition() + " " +
                getNumOfCopies() + " " + getMainCharacter() ;
        return result;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }
}
