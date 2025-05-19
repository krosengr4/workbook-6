package interfaces.IMoveable;

import java.awt.*;

public class Robot implements IMoveable{

    private String name;
    private Point currentLocation;
    private int power;

    public Robot (String name) {
        this.name = name;
        this.currentLocation = new Point(0, 0);
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
        // the robot can only move the number of units if it has the appropriate power

        int biggestUnit = (xUnits >= yUnits) ? xUnits : yUnits;
        double newX = currentLocation.getX() + xUnits;
        double newY = currentLocation.getY() + yUnits;

        if (power >= biggestUnit) {
            currentLocation.setLocation(newX, newY);
            power -= biggestUnit;
        }
        return currentLocation;
    }
    public void goHome() {
        this.currentLocation = new Point(0, 0);
    }
}
