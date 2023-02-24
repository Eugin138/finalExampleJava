import model.Dog;
import model.Reestr;
import presenter.Presenter;
import view.View;

import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new Reestr(), new View());
        presenter.run();
    }
}
