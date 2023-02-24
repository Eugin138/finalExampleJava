package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reestr {
    Map<Integer, Animals> reestr = new HashMap<>();
    Count count;

    public Count getCount() {
        return count;
    }

    public Map<Integer, Animals> getReestr() {
        return reestr;
    }

    public void setReestr(Map<Integer, Animals> reestr) {
        this.reestr = reestr;
    }

    public void addAnimals(Animals animal){
        if(reestr == null) {
            reestr = new HashMap<>();
        }
        count = CountCreater.GetCreater().CreateUser();
        System.out.println(count.getId());
        reestr.put(count.getId(), animal);
    }

    @Override
    public String toString() {
        return "" + reestr;
    }
}
