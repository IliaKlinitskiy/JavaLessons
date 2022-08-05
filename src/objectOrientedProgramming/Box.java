package objectOrientedProgramming;

public class Box {
    double width;
    double height;
    double length;

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void showInfo() {
        System.out.println(" ������ ������� " + width + " ����� ������� " + length + " ������ ������ " + height);
    }

}
