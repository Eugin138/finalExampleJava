package model;

import java.util.Date;

public class CatPlus extends Animals{
    Animals catPlus;

    public CatPlus(Animals catPlus) {
        this.catPlus = catPlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
