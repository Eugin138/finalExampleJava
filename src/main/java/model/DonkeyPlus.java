package model;

import java.util.Date;

public class DonkeyPlus extends Donkey{
    Donkey donkeyPlus;

    public DonkeyPlus(String name, Date birthday, Donkey donkeyPlus) {
        super(name, birthday);
        this.donkeyPlus = donkeyPlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
