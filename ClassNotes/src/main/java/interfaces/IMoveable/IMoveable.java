package interfaces.IMoveable;

import java.awt.*;

public interface IMoveable {

    Point move(int xUnits, int yUnits);
    void goHome();

    default void print() {
        System.out.println("I can move!");
    }
}
