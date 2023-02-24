package model;

public class HamsterPlus extends Animals{
    Animals hamsterPlus;

    public HamsterPlus(Animals hamsterPlus) {
        this.hamsterPlus = hamsterPlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
