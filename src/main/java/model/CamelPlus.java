package model;

import java.util.Date;

public class CamelPlus extends Camel{
    Camel camelPlus;

    public CamelPlus(String name, Date birthday, Camel camelPlus) {
        super(name, birthday);
        this.camelPlus = camelPlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
