package objectOrientedProgrammingHomeWorkRect;

public class Rect {
    double width;
    double height;

    void setDimens(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double perimeter() {
        return (width + height) * 2;
    }

    double square() {
        return width * height;
    }
}
