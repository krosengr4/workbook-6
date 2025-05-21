package Generics;

public class Pair<T> {

    T leftThing;
    T rightThing;

    public Pair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }

    //getters
    public T getLeftThing() {
        return leftThing;
    }

    public T getRightThing() {
        return rightThing;
    }

    public void swap() {
        T temp = leftThing;
        leftThing = rightThing;
        rightThing = temp;
    }
}
