package interfaces.shapes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
       double totalArea = printTheArea();
       System.out.printf("The total area of all shapes is: %.2f", totalArea);


    }

    public static double printTheArea() {
        ArrayList<IShape> shapes = new ArrayList<>();

        Circle circle = new Circle(5);
        Square square = new Square(3.78);
        Rectangle rectangle = new Rectangle(12, 3);
        Rectangle rectangle1 = new Rectangle(3.78, 3.78);

        shapes.add(circle);
        shapes.add(square);
        shapes.add(rectangle);
        shapes.add(rectangle1);

        double totalArea = 0;

        for (IShape shape : shapes) {
            double area = shape.calculateArea();
            totalArea += area;
            System.out.printf("The area is: %.2f\n", area);
        }
        return totalArea;
    }
}
