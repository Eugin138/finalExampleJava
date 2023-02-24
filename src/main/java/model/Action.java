package model;

public class Action {
    public void addAction(int keyIdA, Reestr reestr) {

        if (reestr.getReestr().get(keyIdA).getClass() == Cat.class) {
            Animals catPlus = new CatPlus(reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, catPlus);}
        else if (reestr.getReestr().get(keyIdA).getClass() == Dog.class) {
            Animals dogPlus = new DogPlus(reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, dogPlus);
        }
        else if (reestr.getReestr().get(keyIdA).getClass() == Hamster.class) {
            Animals hamsterPlus = new HamsterPlus(reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, hamsterPlus);
        }
        else if (reestr.getReestr().get(keyIdA).getClass() == Camel.class) {
            Animals camelPlus = new CamelPlus(reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, camelPlus);
        }
        else if (reestr.getReestr().get(keyIdA).getClass() == Donkey.class) {
            Animals donkeyPlus = new DonkeyPlus(reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, donkeyPlus);
        }
        else if (reestr.getReestr().get(keyIdA).getClass() == Horse.class) {
            Animals horsePlus = new HorsePlus(reestr.getReestr().get(keyIdA));
            reestr.getReestr().put(keyIdA, horsePlus);
        }
    }
}
