package Generics;

//!Generic Class
//Similar to IntegerPair class, but now we can create pairs of any type of data using one class
public class Pair<T> {

    T leftThing;
    T rightThing;

    public Pair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }

    //region getters
    public T getLeftThing() {
        return leftThing;
    }
    //endregion

    public T getRightThing() {
        return rightThing;
    }

    public void swap() {
        T temp = leftThing;
        leftThing = rightThing;
        rightThing = temp;
    }
}
