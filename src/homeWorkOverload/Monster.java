package homeWorkOverload;

public class Monster {
    int eyes;
    int hands;
    int legs;
    Monster () {
        this.eyes = 2;
        this.hands = 2;
        this.legs = 2;
    }
    Monster (int eyes) {
        this.eyes = eyes;
        this.hands = 2;
        this.legs = 2;
    }
    Monster (int eyes, int hands) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = 2;
    }
    Monster (int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }
     void voice () {
        System.out.println("�����");
    }
    void voice (int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println("�����");
        }
    }
    void voice (int n, String word) {
        for (int i = 0; i <= n; i++) {
            System.out.println(word);
        }
    }
}

