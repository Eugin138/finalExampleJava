package model;

import java.util.ArrayList;
import java.util.Collections;

public class Count {

    public int id;
    public Count(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class CountCreater {
    static private CountCreater Creater;
    private Repo repo;

    public static CountCreater GetCreater() {
        if (Creater == null) {
            Creater = new CountCreater();
        }
        return Creater;
    }
    public Count CreateUser() {
        int id = repo.getLastId();
        return new Count(id);
    }
    private CountCreater() {
        repo = new Repo();
    }
}
class Repo {
    ArrayList<Integer> liId = new ArrayList<>();
    public int getLastId() {
        if (liId.size() > 0) {
            liId.add(Collections.max(liId) + 1);
            return Collections.max(liId);
        } else {
            liId.add(1);
            return 1;
        }
    }
}
