package interfaces.IMoveable;

import java.awt.*;

//A class can implement two interfaces
public class RobotVacuum implements IMoveable, ICleaner{

    private String name;
    private Point currentLocation;
    private int power;

    public RobotVacuum(String name, Point currentLocation, int power) {
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

    public void clean() {
        System.out.println("All clean!");
    }

    public void print() {
        System.out.printf("I am %s, the robot vacuum!\n", this.name);
        IMoveable.super.print();
        ICleaner.super.print();
    }


}
