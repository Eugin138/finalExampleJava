package model;

import java.util.Date;

public class Donkey extends Packs{
    private String name;
    private Date birthday;

    public Donkey(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void action() {
        System.out.println("I am transporting cargo!");
    }

    @Override
    public String toString() {
        return "Donkey{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
