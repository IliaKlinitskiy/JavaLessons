package objectOrientedProgramming;

public class BoxWeight extends Box{
    private double weight;


    BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" Вес коробки " + weight);
    }
}
