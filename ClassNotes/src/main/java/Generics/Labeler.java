package Generics;

public class Labeler {


    //Making a method displayWithLabel() and making it generic so we can label multiple data types
    public <T> void displayWithLabel(String label, T value) {
        System.out.println(label + ": " + value);
    }

}
