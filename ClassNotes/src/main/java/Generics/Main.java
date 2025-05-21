package Generics;

public class Main {

    public static void main(String[] args) {
        //calling methods
        swapIntegers();
        swapThings();

    }

    //We use the IntegerPair class here. This class's swap() method only works with int data types
    public static void swapIntegers() {
        IntegerPair iPairs = new IntegerPair(2, 5);
        System.out.printf("Numbers before swap:\nLeft = %d, Right = %d\n\n", iPairs.getLeftNumber(), iPairs.getRightNumber());
        iPairs.swap();
        System.out.printf("Numbers after swap:\nLeft = %d, Right = %d\n\n", iPairs.getLeftNumber(), iPairs.getRightNumber());
    }

    //Here we use the Pair class that uses generic fields, so now we can call swap() with any data type
    public static void swapThings() {

        //Making instance of Pair object with String data type, and using swap() method
        Pair<String> pair1 = new Pair<>("Bonnie", "Clyde");
        System.out.println(pair1.leftThing + " and " + pair1.rightThing);
        pair1.swap();
        System.out.println("Swapped\n" + pair1.leftThing + " and " + pair1.rightThing + "\n");

        //Making instance of Pair object with Boolean data type, and using swap() method
        Pair<Boolean> pair2 = new Pair<>(true, false);
        System.out.println(pair2.leftThing + " or " + pair2.rightThing);
        pair2.swap();
        System.out.println("Swapped\n" + pair2.leftThing + " or " + pair2.rightThing + "\n");
    }

}
