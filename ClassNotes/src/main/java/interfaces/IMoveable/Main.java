package interfaces.IMoveable;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        robotCleaner();
        turtle();
        robot();
    }

    public static void robotCleaner() {
        Point point = new Point(0, 0);
        RobotVacuum roboVac = new RobotVacuum("Robo", point, 100);
        roboVac.print();

        roboVac.move(3, 10);
        System.out.println("I am at x = " + roboVac.getCurrentLocation().getX() + " y = " + roboVac.getCurrentLocation().getY());
        System.out.println("My power level is at: " + roboVac.getPower());
    }

    public static void turtle() {
        System.out.println("-----------------------------\n-----------------------------");
        Turtle turtle = new Turtle("Henry");
        turtle.print();
        turtle.goHome();
        System.out.println("My home is at x = " + turtle.getCurrentLocation().getX() + " y = " + turtle.getCurrentLocation().getY());
    }

    public static void robot() {
        System.out.println("-----------------------------\n-----------------------------");
        Robot robo = new Robot("Terry");
        robo.move(17, 8);
        robo.print();
        System.out.println("My current location is x = " + robo.getCurrentLocation().getX() + " y = " + robo.getCurrentLocation().getY());
        System.out.println("My power level is " + robo.getPower());
    }

}
