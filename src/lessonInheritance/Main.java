package lessonInheritance;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(5, 5);
        Triangle triangle = new Triangle(12, 22, 33);
        System.out.println(rect.area());
        System.out.println(triangle.area());

    }
}
