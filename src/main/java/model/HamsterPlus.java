package model;

import java.util.Date;

public class HamsterPlus extends Hamster{
    Hamster hamsterPlus;

    public HamsterPlus(String name, Date birthday, Hamster hamsterPlus) {
        super(name, birthday);
        this.hamsterPlus = hamsterPlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
