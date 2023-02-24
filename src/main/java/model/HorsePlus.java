package model;

import java.util.Date;

public class HorsePlus extends Horse{
    Horse horsePlus;

    public HorsePlus(String name, Date birthday, Horse horsePlus) {
        super(name, birthday);
        this.horsePlus = horsePlus;
    }

    public void wash() {
        System.out.println("I am washing");
    }
}
