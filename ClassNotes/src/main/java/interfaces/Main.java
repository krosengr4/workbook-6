package interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<IShape> shapes = new ArrayList<>();

        Circle circle = new Circle(5);
        Square square = new Square(3.78);
        Rectangle rectangle = new Rectangle(12, 3);

        shapes.add(circle);
        shapes.add(square);
        shapes.add(rectangle);

        double totalArea = 0;

        for (IShape shape : shapes) {
            double area = shape.calculateArea();
            totalArea += area;
            System.out.printf("The area is: %.2f\n", area);
        }

        System.out.printf("The total area of all shapes is: %.2f", totalArea);

    }

}
