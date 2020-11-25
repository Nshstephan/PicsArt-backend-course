package com.main;

public class AdventureBookService {
    public void print(AdventureBook alpha){
        System.out.println(alpha);
    }
    public void printMainHero(AdventureBook[] array, String hero){
        for (AdventureBook x: array) {
            if (x.getMainCharacter().equals(hero)){
                System.out.println(x);
            }
        }
    }
    public void hasMovies(AdventureBook[] data) {
        for (AdventureBook i : data) {
            if (i.hasMovie())
                System.out.println(i);
        }
    }

    public AdventureBook cheapest(AdventureBook alpha, AdventureBook beta){
        if(alpha.getPrice() >= beta.getPrice())
            return beta;
        else
            return alpha;
    }
}
