package objectOrientedProgrammingHomeWorkDog;

import org.w3c.dom.ls.LSOutput;

public class Dog {
    String nickname;
    String breed;
    int speed;

    void run() {
        String result = "";
        for (int i = 0; i <= speed; i++) {
            result += "����";
            if (i == speed) {
                result += ".";
            } else {
                result += ",";
            }
        }
        System.out.println(result);
    }

    String info() {
        return "������: " + nickname + ", ������: " + breed + ", ��������: " + speed;
    }
}
