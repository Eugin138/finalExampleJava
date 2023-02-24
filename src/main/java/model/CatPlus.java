package model;

import java.util.Date;

public class CatPlus extends Cat{
    Cat catPlus;

    public CatPlus(String name, Date birthday, Cat catPlus) {
        super(name, birthday);
        this.catPlus = catPlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
