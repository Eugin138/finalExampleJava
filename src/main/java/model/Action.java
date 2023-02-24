package model;

public class Action {
    public void addAction(int keyIdA, Reestr reestr) {

        if (reestr.getReestr().get(keyIdA).getClass() == Cat.class) {
            Animals catPlus = new CatPlus(((Cat)reestr.getReestr().get(keyIdA)).getName(),
                                            ((Cat)reestr.getReestr().get(keyIdA)).getBirthday(),
                                            (Cat)reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, catPlus);}
        else if (reestr.getReestr().get(keyIdA).getClass() == Dog.class) {
            Animals dogPlus = new DogPlus(((Dog)reestr.getReestr().get(keyIdA)).getName(),
                    (((Dog)reestr.getReestr().get(keyIdA))).getBirthday(),
                    (Dog)reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, dogPlus);
        }
        else if (reestr.getReestr().get(keyIdA).getClass() == Hamster.class) {
            Animals hamsterPlus = new HamsterPlus(((Hamster)reestr.getReestr().get(keyIdA)).getName(),
                    ((Hamster)reestr.getReestr().get(keyIdA)).getBirthday(),
                    (Hamster)reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, hamsterPlus);
        }
        else if (reestr.getReestr().get(keyIdA).getClass() == Camel.class) {
            Animals camelPlus = new CamelPlus(((Camel)reestr.getReestr().get(keyIdA)).getName(),
                    ((Camel)reestr.getReestr().get(keyIdA)).getBirthday(),
                    (Camel)reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, camelPlus);
        }
        else if (reestr.getReestr().get(keyIdA).getClass() == Donkey.class) {
            Animals donkeyPlus = new DonkeyPlus(((Donkey)reestr.getReestr().get(keyIdA)).getName(),
                    ((Donkey)reestr.getReestr().get(keyIdA)).getBirthday(),
                    (Donkey)reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, donkeyPlus);
        }
        else if (reestr.getReestr().get(keyIdA).getClass() == Horse.class) {
            Animals horsePlus = new HorsePlus(((Horse)reestr.getReestr().get(keyIdA)).getName(),
                    ((Horse)reestr.getReestr().get(keyIdA)).getBirthday(),
                    (Horse)reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, horsePlus);
        }
    }
}
