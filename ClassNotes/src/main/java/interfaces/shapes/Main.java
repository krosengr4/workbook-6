package interfaces.shapes;

import java.util.ArrayList;

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

        shapes.add(circle);
        shapes.add(square);
        shapes.add(rectangle);

        double totalArea = 0;

        for (IShape shape : shapes) {
            double area = shape.calculateArea();
            totalArea += area;
            System.out.printf("The area is: %.2f\n", area);
        }
        return totalArea;
    }
}
