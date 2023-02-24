package view;

import model.*;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class View {
    Scanner iScaner = new Scanner(System.in);

    public Animals setAnimals() throws ParseException {

        Scanner iScaner = new Scanner(System.in);

        System.out.println("Какое животное хотите создать? Введите: 1 - если домашнее, 2 - если вьючное");
        int iD = iScaner.nextInt();
        if (iD == 1) {
            System.out.println("Введите вид животного: 1 - кошка, 2 - собака, 3 - хомяк");
            int iDPets = iScaner.nextInt();
            if (iDPets == 1) {
                System.out.println("Введите имя: ");
                String name = iScaner.next();
                System.out.println("Введите дату рождения в виде \"dd/MM/yyyy\": ");
                String dateS = iScaner.next();
                Date dateBirthday = new SimpleDateFormat("dd/MM/yyyy").parse(dateS);


                Animals cat = new Cat(name, dateBirthday);
                return cat;
            } else if (iDPets == 2) {
                System.out.println("Введите имя: ");
                String name = iScaner.next();
                System.out.println("Введите дату рождения в виде \"dd/MM/yyyy\": ");
                String dateS = iScaner.next();
                Date dateBirthday = new SimpleDateFormat("dd/MM/yyyy").parse(dateS);
                Animals dog = new Dog(name, dateBirthday);
                return dog;
            } else {
                System.out.println("Введите имя: ");
                String name = iScaner.next();
                System.out.println("Введите дату рождения в виде \"dd/MM/yyyy\": ");
                String dateS = iScaner.next();
                Date dateBirthday = new SimpleDateFormat("dd/MM/yyyy").parse(dateS);
                Animals hamster = new Hamster(name, dateBirthday);
                return hamster;
            }
        } else {
            System.out.println("Введите вид животного: 1 - верблюд, 2 - осел, 3 - лошадь");
            int iDPets = iScaner.nextInt();
            if (iDPets == 1) {
                System.out.println("Введите имя: ");
                String name = iScaner.next();
                System.out.println("Введите дату рождения в виде \"dd/MM/yyyy\": ");
                String dateS = iScaner.next();
                Date dateBirthday = new SimpleDateFormat("dd/MM/yyyy").parse(dateS);
                Animals camel = new Camel(name, dateBirthday);
                return camel;
            } else if (iDPets == 2) {
                System.out.println("Введите имя: ");
                String name = iScaner.next();
                System.out.println("Введите дату рождения в виде \"dd/MM/yyyy\": ");
                String dateS = iScaner.next();
                Date dateBirthday = new SimpleDateFormat("dd/MM/yyyy").parse(dateS);
                Animals donkey = new Donkey(name, dateBirthday);
                return donkey;
            } else {
                System.out.println("Введите имя: ");
                String name = iScaner.next();
                System.out.println("Введите дату рождения в виде \"dd/MM/yyyy\": ");
                String dateS = iScaner.next();
                Date dateBirthday = new SimpleDateFormat("dd/MM/yyyy").parse(dateS);
                Animals horse = new Horse(name, dateBirthday);
                return horse;
            }
        }
    }
}
