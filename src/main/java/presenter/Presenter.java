package presenter;

import model.*;
import view.View;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.*;

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
            System.out.println("Выберите действие: 1 - посмотреть всех животных, 2 - создать новое животное," +
                    " 3 - посмотреть, что умеет животное, 4 - научить новому действию, 0 - выход");
            String key = iScanner.next();
            switch (key) {
                case "2":
                    reestr.addAnimals(view.setAnimals());
                    System.out.println("Вы создали: ");
                    break;
                case "1":
                    if (reestr.getReestr() == null) {
                        System.out.println("Реестр пустой");
                        break;
                    } else {
                        for (Integer i : reestr.getReestr().keySet()) {
                            System.out.println(i + " " +reestr.getReestr().get(i));
                        }
                    }
                    break;
                case "3":
                    System.out.println("Выбирите животное, введя его номер: ");
                    for (Integer i : reestr.getReestr().keySet()) {
                        System.out.println(i + ":" + reestr.getReestr().get(i));
                    }
                    int keyId = iScanner.nextInt();

                    Method[] methodsObject = Object.class.getMethods();
                    Method[] methods = reestr.getReestr().get(keyId).getClass().getMethods();
                    String[] actionS = {"getName", "toString", "setName", "setBirthday", "getBirthday"};
                    for (Method m : methods) {
                        if (!Arrays.asList(methodsObject).contains(m) &&
                                (!Arrays.asList(actionS).contains(m.getName()))) {
                            System.out.println(m.getName());
                        }
                    }
                    break;
                case "4":
                    System.out.println("Выбирите животное, введя его номер: ");
                    for (Integer i : reestr.getReestr().keySet()) {
                        System.out.println(i + ":" + reestr.getReestr().get(i));
                    }
                    int keyIdA = iScanner.nextInt();

                    Action action = new Action();
                    action.addAction(keyIdA, reestr);

                    break;
                case "0":
                    flag = false;
            }
        }
    }
}