import model.Dog;
import model.Reestr;
import presenter.Presenter;
import view.View;

import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws ParseException {
        Presenter presenter = new Presenter(new Reestr(), new View());
        presenter.run();

//        Dog dog = new Dog("ddd", new Date(2023,03,24));

    }
}
