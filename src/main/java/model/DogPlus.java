package model;

import java.util.Date;

public class DogPlus extends Dog{
    Dog dogPlus;

    public DogPlus(String name, Date birthday, Dog dogPlus) {
        super(name, birthday);
        this.dogPlus = dogPlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
