package objectOrientedProgrammingHomeWorkDog;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.nickname = "�����";
        myDog.breed = "�����";
        myDog.speed = 10;
        myDog.run();
        System.out.println(myDog.info());
    }
}
