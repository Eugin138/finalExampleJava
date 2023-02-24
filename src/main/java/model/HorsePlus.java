package model;

public class HorsePlus extends Animals{
    Animals horsePlus;

    public HorsePlus(Animals horsePlus) {
        this.horsePlus = horsePlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
