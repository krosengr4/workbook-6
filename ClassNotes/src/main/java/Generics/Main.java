package Generics;

public class Main {

    public static void main(String[] args) {
        //calling methods
//        swapIntegers();
//        swapThings();
        labelThings();
        musicalPerformance();
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

    //Here we call the displayWithLabel() method which is a *generic method* in Labeler class
    public static void labelThings() {
        Labeler labeler = new Labeler();
        //We can use the displayWithLabel() method with both String's and int's because it is a generic method
        labeler.displayWithLabel("Name", "Kevin");
        labeler.displayWithLabel("Age", 19);
    }

    //Here we call .perform() method which is in Duet and Musician classes so that dataTypes that perform, can perform in a duet.
    public static void musicalPerformance() {
        Musician musician1 = new Musician("Jimi Hendrix", "Guitar");
        Musician musician2 = new Musician("Phil Collins", "Drums");
        System.out.printf("\nWelcome to the stage, %s and %s!!!\n\n", musician1.getName(), musician2.getName());

        Duet<Musician> duet = new Duet<>(musician1, musician2);

        //Only types that have a perform() method in their constructor class can call the perform() method in the Duet class
        duet.perform();
        System.out.println();
        musician1.swapInstruments(musician2);
        duet.perform();
    }
}
