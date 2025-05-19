package interfaces.IMoveable;

import java.awt.*;

public class Turtle implements IMoveable {

    private String name;
    private Point currentLocation;
    private int power;

    public Turtle(String name) {
        this.name = name;
        this.currentLocation = new Point(25, 25);
        this.power = 100;
    }

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    //endregion

    public Point move(int xUnits, int yUnits) {
        // the turtle moves the number of units specified in the direction specified
        double newX = currentLocation.getX() + xUnits;
        double newY = currentLocation.getY() + yUnits;
        currentLocation.setLocation(newX, newY);
        return currentLocation;
    }

    public void goHome() {
        this.currentLocation = new Point(25, 25);
    }
}
