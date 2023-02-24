package model;

public class DogPlus extends Animals{
    Animals dogPlus;

    public DogPlus(Animals catPlus) {
        this.dogPlus = catPlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
