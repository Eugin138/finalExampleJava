package model;

public class DonkeyPlus extends Animals{
    Animals donkeyPlus;

    public DonkeyPlus(Animals donkeyPlus) {
        this.donkeyPlus = donkeyPlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
