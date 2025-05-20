package interfaces.IMoveable;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        robotCleaner();
    }

    public static void robotCleaner() {
        Point point = new Point();
        RobotVacuum roboVac = new RobotVacuum("Robo", point, 100);
        roboVac.print();

        roboVac.move(3, 10);
        System.out.println("I am at x = " + roboVac.getCurrentLocation().getX() + " y = " + roboVac.getCurrentLocation().getY());
    }

}
