package objectOrientedProgrammingHomeWorkRect;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setDimens (40, 25);
        System.out.println(rect.square());
        System.out.println(rect.perimeter());
    }
}
