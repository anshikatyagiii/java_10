
import java.util.*;

class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

public class Q10_06 {
    public static void main(String[] args) {

        ArrayList<Shape> list = new ArrayList<>();

        list.add(new Circle(5));
        list.add(new Circle(7));
        list.add(new Circle(10));

        for (Shape s : list) {
            s.area();
        }
    }
}
