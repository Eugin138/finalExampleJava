package model;

import java.util.ArrayList;
import java.util.List;

public class Reestr {
    ArrayList<Animals> reestr;

    public ArrayList<Animals> getReestr() {
        return reestr;
    }

    public void setReestr(ArrayList<Animals> reestr) {
        this.reestr = reestr;
    }

    public void addAnimals(Animals animal){
        if(reestr == null) {
            reestr = new ArrayList<>();
        }
        reestr.add(animal);
    }

}
