package model;

public class CamelPlus extends Animals{
    Animals camelPlus;

    public CamelPlus(Animals camelPlus) {
        this.camelPlus = camelPlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
