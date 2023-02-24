package presenter;

import model.Animals;
import model.Reestr;
import view.View;

import java.text.ParseException;
import java.util.Scanner;

import java.util.ArrayList;

public class Presenter {
    Reestr reestr;
    View view;

    public Presenter(Reestr reestr, View view) {
        this.reestr = reestr;
        this.view = view;
    }

    public void run() throws ParseException {
        Scanner iScanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("Выберите действие: 1 - посмотреть всех животных, 2 - создать новое животное, 0 - выход");
            String key = iScanner.next();
            switch (key) {
                case "2":
                    reestr.addAnimals(view.setAnimals());
//                    System.out.println(reestr);
                    break;
                case "1":
                    if (reestr.getReestr() == null) {
                        System.out.println("Реестр пустой");
                        break;
                    } else {
                        for (Animals animal : reestr.getReestr().values()) {
                            System.out.println(reestr);
                        }
                    }
                    break;
                case "0":
                    flag = false;
            }
        }
    }
}