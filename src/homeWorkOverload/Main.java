package homeWorkOverload;

public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        Monster monster2 = new Monster (4, 5);
        Monster monster3 = new Monster (9, 4,1);
        monster1.voice();
        monster2.voice(2);
        monster3.voice(1, "Монстр");
    }
}
