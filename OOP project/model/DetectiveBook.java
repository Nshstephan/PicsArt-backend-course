package com.model;

public class DetectiveBook extends FictionBook {
    private String crime; //type of crime
    private String detective;
    private boolean wasArrested = true;
    private int numOfVictims = 1;

    public DetectiveBook(String ISBN, String[] a, double price, boolean hasMovie, String crime, String detective) {
        super(ISBN, a, price, hasMovie);
        this.crime = crime;
        this.detective = detective;

    }

    @Override
    public String toString() {
        String result = getISBN() + " " + getPrice() + " " +
                getNumOfPages() + " " + getEdition() + " " +
                getNumOfCopies() + " " + getCrime() + " " + getDetective();
        return result;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getDetective() {
        return detective;
    }

    public void setDetective(String detective) {
        this.detective = detective;
    }

    public boolean WasArrested() {
        return wasArrested;
    }

    public void setWasArrested(boolean wasArrested) {
        this.wasArrested = wasArrested;
    }

    public int getNumOfVictims() {
        return numOfVictims;
    }

    public void setNumOfVictims(int numOfVictims) {
        this.numOfVictims = numOfVictims;
    }
}
