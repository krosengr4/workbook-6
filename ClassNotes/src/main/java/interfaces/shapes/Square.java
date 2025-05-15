package interfaces.shapes;

public class Square implements IShape {

    double length;

    public Square(double length) {
        this.length = length;
    }

    public double calculateArea() {
        return Math.pow(this.length, 2);
    }

}
