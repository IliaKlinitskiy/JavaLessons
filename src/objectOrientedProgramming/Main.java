package objectOrientedProgramming;

public class Main {
    public static void main(String[] args) {
        Box myBox;
        myBox = new Box();
        myBox.height = 10.2;
        myBox.lenght = 15;
        myBox.width = 11.3;
        double volume = myBox.width * myBox.height * myBox.lenght;
        System.out.println(volume);
    }
}
