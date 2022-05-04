package objectOrientedProgrammingHomeWork;

import java.awt.event.ItemListener;

public class MainHuman {
    public static void main(String[] args) {
        Human politolog = new Human();
        Human father = new Human();
        Human mather = new Human();
        Human sister = new Human();
        Human brother = new Human();
        politolog.age = 21;
        politolog.weihgt = 91;
        politolog.name = "Ilia";
        father.age = 50;
        father.weihgt = 90;
        father.name = "Sergey";
        mather.age = 45;
        mather.weihgt = 52;
        mather.name = "Elena";
        sister.age = 24;
        sister.weihgt = 52;
        sister.name = "Alexandra";
        brother.age = 29;
        brother.weihgt = 75;
        brother.name = "Sergey";
        int middleWeight = (politolog.weihgt + father.weihgt + mather.weihgt + sister.weihgt + brother.weihgt) / 5;
        System.out.println("Средний вес рассматриваемых людей = " + middleWeight);
    }
}
